package com.biancardy.provaLeilao.controller;

import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biancardy.provaLeilao.controller.DTO.ConcorrenteDTO;
import com.biancardy.provaLeilao.model.Lance;
import com.biancardy.provaLeilao.model.Leilao;
import com.biancardy.provaLeilao.repository.ConcorrenteRepository;
import com.biancardy.provaLeilao.repository.LanceRepository;
import com.biancardy.provaLeilao.repository.LeilaoRepository;

@RestController
@RequestMapping("/vencedor_leilao/")
public class VencedorLeilao {
    
    @Autowired
    private LanceRepository lanceRepository;
    
    @Autowired
    private LeilaoRepository leilaoRepository;
    
    
    @GetMapping("/{id}")
    public ResponseEntity<?> obterVencedorLeilao(@PathVariable Long id) {
        try {
            if (id == null) {
                return ResponseEntity.badRequest().body("O ID do leilão não foi fornecido.");
            }

            Optional<Leilao> leilaoOptional = leilaoRepository.findById(id);
            if (leilaoOptional.isEmpty()) {
                return ResponseEntity.notFound().build();
            }

            Leilao leilao = leilaoOptional.get();

            if (!leilao.getStatus()) {
                return ResponseEntity.status(HttpStatus.FORBIDDEN).body("O leilão está fechado.");
            }


            Lance maiorLance = lanceRepository.findTopByLeilaoOrderByValorDesc(leilao);
            if (maiorLance == null) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Não foi possível obter o vencedor do leilão.");
            }

            ConcorrenteDTO concorrenteDTO = new ConcorrenteDTO(maiorLance.getConcorrente());

            JSONObject responseJson = new JSONObject();
            responseJson.put("id_leilao", leilao.getId());
            responseJson.put("descricao_leilao", leilao.getDescricao());
            responseJson.put("maior_lance", maiorLance.getValor());
            responseJson.put("concorrente", concorrenteDTO);

            return ResponseEntity.ok(responseJson.toString());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
