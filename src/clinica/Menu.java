package clinica;

import java.util.Scanner;

public class Menu {
    private Clinica clinica;
    private Scanner scanner;



    public Menu(Clinica clinica){
        this.clinica = clinica;
        this.scanner = new Scanner(System.in);
    }

    private void adicionarCliente(){
        System.out.println("Digite o nome do cliente :");
        String name = scanner.nextLine();
        Cliente cliente = new Cliente(name);
        clinica.adicionarCliente(cliente);
    }

    private void chamarProximo(){
        clinica.chamarProximo();
    }

    private  void todosClientes(){
        clinica.todosCliente();
    }
    public void exibirMenu(){
        int escolha;

        do{
            System.out.println("----Menu----");
            System.out.println("1 : Adicionar Cliente");
            System.out.println("2: Chamar Proximo Cliente");
            System.out.println("3: Todos a serem atendidos");
            System.out.println("0 : Sair");

            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o scanner

            switch (escolha){
                case 1 :
                    adicionarCliente();
                    break;
                case 2 :
                    chamarProximo();
                    break;
                case 3 :
                    todosClientes();
                    break;
                case 0 :
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }while (escolha != 0);

    }
}
