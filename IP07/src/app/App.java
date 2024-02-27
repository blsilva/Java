package app;

import java.util.Calendar;
import java.util.Scanner;

import dados.Jornadas;
import dados.Pessoas;
import dados.Pontos;
import dados.Trajetos;
import dados.Trechos;
import dados.Veiculos;
import jornada.Jornada;
import jornada.Ponto;
import jornada.Trajeto;
import jornada.Trecho;
import pessoas.Cobrador;
import pessoas.Motorista;
import pessoas.Passageiro;
import pessoas.Pessoa;
import uteis.Utilitarios;
import veiculo.Veiculo;

public class App {
	public static void main() {
		abrirArquivos();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Utilitarios.limpaTela();
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Menu de Veiculos");
			System.out.println("2 - Menu de Pessoas");
			System.out.println("3 - Menu de Viagem");
			System.out.println("4 - Menu de Jornada");
			System.out.println("5 - Menu de Busca");
			System.out.println("6 - Menu de Listagem");
			System.out.println("7 - Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				menuVeiculo();
				break;
			case 2:
				menuPessoa();
				break;
			case 3:
				menuParadas();
				break;
			case 4:
				menuJornada();
				break;
			case 5:
				menuBusca();
				break;
			case 6:
				menuLista();
				break;
			case 7:
				Utilitarios.Cx_Msg("Saindo do programa. Até logo!");
				scanner.close();
				System.exit(0);
			default:
				Utilitarios.Cx_Msg("Opção inválida. Tente novamente.");
			}
		}
	}
	
	private static void abrirArquivos() {
		Veiculos.lerArquivo();
		Pessoas.lerArquivo();
		Pontos.lerArquivo();
		Trechos.lerArquivo();
		Trajetos.lerArquivo();
		Jornadas.lerArquivo();
	}

	private static void menuVeiculo() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Utilitarios.limpaTela();
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Cadastrar veículo");
			System.out.println("2 - Remover veículo");
			System.out.println("3 - Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				cadastrarVeiculo();
				break;
			case 2:
				removerVeiculo();
				break;
			case 3:
				return;
			default:
				Utilitarios.Cx_Msg("Opção inválida. Tente novamente.");
				continue;
			}
			Veiculos.salvarArquivo();
		}
	}

	private static void cadastrarVeiculo() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite a marca do veículo:");
		String marca = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o modelo do veículo:");
		String modelo = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite a placa do veículo:");
		String placa = scanner.nextLine();

		Veiculos.addVeiculo(marca, modelo, placa);
	}

	private static void removerVeiculo() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite a placa do veículo a ser removido:");
		String placa = scanner.nextLine();

		Veiculos.remVeiculo(placa);
	}

	private static void menuPessoa() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Utilitarios.limpaTela();
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Cadastrar passageiro");
			System.out.println("2 - Cadastrar motorista");
			System.out.println("3 - Cadastrar cobrador");
			System.out.println("4 - Remover pessoa");
			System.out.println("5 - Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				cadastrarPassageiro();
				break;
			case 2:
				cadastrarMotorista();
				break;
			case 3:
				cadastrarCobrador();
				break;
			case 4:
				removerPessoa();
				break;
			case 5:
				return;
			default:
				Utilitarios.Cx_Msg("Opção inválida. Tente novamente.");
				continue;
			}
			Pessoas.salvarArquivo();
		}
	}

	private static void cadastrarPassageiro() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite o nome do passageiro:");
		String nome = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o CPF do passageiro:");
		String cpf = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o número do cartão do passageiro:");
		String cartao = scanner.nextLine();

		Passageiro passageiro = new Passageiro(nome, cpf, cartao);
		Pessoas.addPessoa(passageiro);
	}

	private static void cadastrarMotorista() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite o nome do motorista:");
		String nome = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o CPF do motorista:");
		String cpf = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o número da CNH do motorista:");
		String cnh = scanner.nextLine();

		Motorista motorista = new Motorista(nome, cpf, cnh);
		Pessoas.addPessoa(motorista);
	}

	private static void cadastrarCobrador() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite o nome do cobrador:");
		String nome = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o CPF do cobrador:");
		String cpf = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o número do contrato do cobrador:");
		String contrato = scanner.nextLine();

		Cobrador cobrador = new Cobrador(nome, cpf, contrato);
		Pessoas.addPessoa(cobrador);
	}

	private static void removerPessoa() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite o CPF da pessoa a ser removida:");
		String cpf = scanner.nextLine();

		Pessoas.remPessoa(cpf);
	}

	private static void menuParadas() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Utilitarios.limpaTela();
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Cadastrar ponto");
			System.out.println("2 - Cadastrar trecho");
			System.out.println("3 - Criar novo trajeto");
			System.out.println("4 - Adicionar trecho a trajeto");
			System.out.println("5 - Remover ponto");
			System.out.println("6 - Remover trecho");
			System.out.println("7 - Remover trajeto");
			System.out.println("8 - Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				cadastrarPonto();
				Pontos.salvarArquivo();
				break;
			case 2:
				cadastrarTrecho();
				Trechos.salvarArquivo();
				break;
			case 3:
				criarNovoTrajeto();
				break;
			case 4:
				adicionarTrechoATrajeto();
				Trajetos.salvarArquivo();
				break;
			case 5:
				removerPonto();
				Pontos.salvarArquivo();
				break;
			case 6:
				removerTrecho();
				Trechos.salvarArquivo();
				break;
			case 7:
				removerTrajeto();
				Trajetos.salvarArquivo();
				break;
			case 8:
				return;
			default:
				Utilitarios.Cx_Msg("Opção inválida. Tente novamente.");
			}
			
		}
	}

	private static void cadastrarPonto() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite o nome/local do ponto:");
		String local = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite a longitude do ponto:");
		double lon = scanner.nextDouble();

		Utilitarios.Cx_Msg("Digite a latitude do ponto:");
		double lat = scanner.nextDouble();

		Pontos.addPonto(local, lon, lat);
	}

	private static void cadastrarTrecho() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite o local de origem:");
		String origem = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o local de destino:");
		String destino = scanner.nextLine();

		Trechos.addTrecho(origem, destino);
	}

	private static void criarNovoTrajeto() {
		Trajetos.newTrajeto();
	}

	private static void adicionarTrechoATrajeto() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite o ID do trajeto:");
		String idTrajeto = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o ID do trecho:");
		String idTrecho = scanner.nextLine();

		Trajetos.preencherTrajeto(idTrajeto, idTrecho);
	}

	private static void removerPonto() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite a longitude do ponto a ser removido:");
		double lon = scanner.nextDouble();

		Utilitarios.Cx_Msg("Digite a latitude do ponto a ser removido:");
		double lat = scanner.nextDouble();

		Pontos.remPonto(lon, lat);
	}

	private static void removerTrecho() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite o ID do trecho a ser removido:");
		String id = scanner.nextLine();

		Trechos.remTrecho(id);
	}

	private static void removerTrajeto() {
		Scanner scanner = new Scanner(System.in);

		Utilitarios.Cx_Msg("Digite o ID do trajeto a ser removido:");
		String id = scanner.nextLine();

		Trajetos.remTrajeto(id);
	}

	private static void menuJornada() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Utilitarios.limpaTela();
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Criar nova jornada");
			System.out.println("2 - Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer do scanner

			switch (opcao) {
			case 1:
				criarNovaJornada();
				Jornadas.salvarArquivo();
				break;
			case 2:
				return;
			default:
				Utilitarios.Cx_Msg("Opção inválida. Tente novamente.");
			}
		}
	}

	private static void criarNovaJornada() {
		Scanner scanner = new Scanner(System.in);
		Calendar data = null;
		do {
			Utilitarios.Cx_Msg("Digite a data da jornada (formato: dd/MM/yyyy HH:mm):");
			String dataStr = scanner.nextLine();
			data = Utilitarios.obterCalendarDaString(dataStr);
		}while(data == null);

		Utilitarios.Cx_Msg("Digite o ID do trajeto:");
		String idTrajeto = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite o CPF do motorista:");
		String cpfMotorista = scanner.nextLine();

		Utilitarios.Cx_Msg("Digite a placa do veículo:");
		String placaVeiculo = scanner.nextLine();

		Utilitarios.Cx_Msg("Deseja informar um cobrador? (S/N)");
		String opcaoCobrador = scanner.nextLine();

		if (opcaoCobrador.equalsIgnoreCase("S")) {
			Utilitarios.Cx_Msg("Digite o CPF do cobrador:");
			String cpfCobrador = scanner.nextLine();
			Jornadas.newJornada(data, idTrajeto, cpfMotorista, placaVeiculo, cpfCobrador);
		} else {
			Jornadas.newJornada(data, idTrajeto, cpfMotorista, placaVeiculo);
		}
	}
	
	private static void menuBusca() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	Utilitarios.limpaTela();
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Buscar veículo");
            System.out.println("2 - Buscar jornada");
            System.out.println("3 - Buscar ponto");
            System.out.println("4 - Buscar trecho");
            System.out.println("5 - Buscar trajeto");
            System.out.println("6 - Buscar pessoa por CPF");
            System.out.println("7 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    buscarVeiculo();
                    break;
                case 2:
                    buscarJornada();
                    break;
                case 3:
                    buscarPonto();
                    break;
                case 4:
                    buscarTrecho();
                    break;
                case 5:
                    buscarTrajeto();
                    break;
                case 6:
                    buscarPessoaPorCPF();
                    break;
                case 7:
                    return;
                default:
                	Utilitarios.Cx_Msg("Opção inválida. Tente novamente.");
            }
        }
    }

    static void buscarVeiculo() {
        Scanner scanner = new Scanner(System.in);
        Utilitarios.Cx_Msg("Digite a placa do veículo:");
        String placa = scanner.nextLine();
        Veiculo veiculo = Veiculos.findVeiculo(placa);
        if (veiculo != null) {
        	Utilitarios.Cx_Msg(veiculo.toString());
        } else {
        	Utilitarios.Cx_Msg("Veículo não encontrado.");
        }
    }

    static void buscarJornada() {
        Scanner scanner = new Scanner(System.in);
        Utilitarios.Cx_Msg("Digite a data da jornada (formato: dd/MM/yyyy HH:mm):");
        String dataStr = scanner.nextLine();
        Calendar data = Utilitarios.obterCalendarDaString(dataStr);

        Utilitarios.Cx_Msg("Digite o CPF do motorista:");
        String cpfMotorista = scanner.nextLine();

        Utilitarios.Cx_Msg("Digite a placa do veículo:");
        String placaVeiculo = scanner.nextLine();

        Jornada jornada = Jornadas.findJornada(data, cpfMotorista, placaVeiculo);
        if (jornada != null) {
        	Utilitarios.Cx_Msg(jornada.toString());
        } else {
        	Utilitarios.Cx_Msg("Jornada não encontrada.");
        }
    }

    static void buscarPonto() {
        Scanner scanner = new Scanner(System.in);
        Utilitarios.Cx_Msg("Digite a longitude do ponto:");
        double longitude = scanner.nextDouble();

        Utilitarios.Cx_Msg("Digite a latitude do ponto:");
        double latitude = scanner.nextDouble();

        Ponto ponto = Pontos.findPonto(longitude, latitude);
        if (ponto != null) {
        	Utilitarios.Cx_Msg(ponto.toString());
        } else {
        	Utilitarios.Cx_Msg("Ponto não encontrado.");
        }
    }

    static void buscarTrecho() {
        Scanner scanner = new Scanner(System.in);
        Utilitarios.Cx_Msg("Digite o ID do trecho:");
        String id = scanner.nextLine();
        Trecho trecho = Trechos.findTrecho(id);
        if (trecho != null) {
        	Utilitarios.Cx_Msg(trecho.toString());
        } else {
        	Utilitarios.Cx_Msg("Trecho não encontrado.");
        }
    }

    static void buscarTrajeto() {
        Scanner scanner = new Scanner(System.in);
        Utilitarios.Cx_Msg("Digite o ID do trajeto:");
        String id = scanner.nextLine();
        Trajeto trajeto = Trajetos.findTrajeto(id);
        if (trajeto != null) {
        	Utilitarios.Cx_Msg(trajeto.toString());
        } else {
        	Utilitarios.Cx_Msg("Trajeto não encontrado.");
        }
    }

    static void buscarPessoaPorCPF() {
        Scanner scanner = new Scanner(System.in);
        Utilitarios.Cx_Msg("Digite o CPF da pessoa:");
        String cpf = scanner.nextLine();
        Pessoa pessoa = Pessoas.findPessoaPorCPF(cpf);
        if (pessoa != null) {
        	Utilitarios.Cx_Msg(pessoa.toString());
        } else {
        	Utilitarios.Cx_Msg("Pessoa não encontrada.");
        }
    }

    private static void menuLista() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Utilitarios.limpaTela();
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Listar Veiculos");
			System.out.println("2 - Listar Motoristas");
			System.out.println("3 - Listar Cobradores");
			System.out.println("4 - Listar Passageiros");
			System.out.println("5 - Listar Pontos");
			System.out.println("6 - Listar Trechos");
			System.out.println("7 - Listar Trajetos");
			System.out.println("8 - Listar Jornadas");
			System.out.println("9 - Sair");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				Veiculos.listar();
				break;
			case 2:
				Pessoas.listarMotoristas();
				break;
			case 3:
				Pessoas.listarCobradores();
				break;
			case 4:
				Pessoas.listarPassageiros();
				break;
			case 5:
				Pontos.listar();
				break;
			case 6:
				Trechos.listar();
				break;
			case 7:
				Trajetos.listar();
				break;
			case 8:
				Jornadas.listar();
				break;
			case 9:
				return;
			default:
				Utilitarios.Cx_Msg("Opção inválida. Tente novamente.");
				continue;
			}
		}
	}
	
}
