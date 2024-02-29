package com.biancardy.provaLeilao.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biancardy.provaLeilao.model.Lance;
import com.biancardy.provaLeilao.model.Leilao;

public interface LanceRepository extends JpaRepository<Lance,Long>{
	
	ArrayList<Lance> findByLeilaoId(Long id);
	ArrayList<Lance> findByConcorrenteId(Long id);
	Lance findTopByLeilaoOrderByValorDesc(Leilao leilao);
	

}
