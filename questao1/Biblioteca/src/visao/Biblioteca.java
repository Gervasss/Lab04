
package visao;
import controle.*;
//import modelo.Livro;
//import modelo.Usuario;
import java.util.Scanner;

public class Biblioteca {

   
    public static void menu() {
      
    System.out.println(" MENU ");
        System.out.println("1.cadastrar livro");
        System.out.println("2.cadastrar usuario");
        System.out.println("3.cadastrar emprestimo de livro");
        System.out.println("4.listar emprestimo de livro");
        System.out.println("0.sair");
       
    }

    public static void main(String[] args){
        int op = 10, codigolivro;
        int codigolivro2;
        String titulo, nome, cpf, endereco, profissao,autor,data_emprestimo,data_devolucao,usuario;
        long issn,codigoEmprestimo;
        
        ControleEmprestimo  ControleEmprestimo = new ControleEmprestimo();
        ControleUsuario ControleUsuario = new ControleUsuario();
        ControleLivro ControleLivro = new ControleLivro();
        
        
        Scanner teclado = new Scanner(System.in);
        
        while(op != 0){
            menu();
            
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    System.out.println(" CADASTRO DE LIVRO");
                    System.out.println("Digite o codigo do livro");
                    codigolivro = teclado.nextInt();
                    System.out.println("Digite o titulo do livro");
                    titulo = teclado.next();
                    System.out.println("digite o autor");
                    autor=teclado.next();
                    System.out.println("digite o issn");
                    issn=teclado.nextByte();
                    ControleLivro.cadastrarLivro( codigolivro,titulo,autor,issn);
                    
                 
                    
                    break;
                case 2:
                //String nome, String cpf, String endereco, String profissao
                    System.out.println("CADASTRO DE USUÁRIO");
                    System.out.println("Digite o nome do usuário");
                    nome = teclado.next();
                    System.out.println("Digite o cpf");
                    cpf = teclado.next();
                    System.out.println("Digite o endereco");
                    endereco = teclado.next();
                    System.out.println("Digite a profissão");
                    profissao = teclado.next();
                  
                    ControleUsuario.cadastrarUsuario(nome, cpf,endereco, profissao);
                    
               case 3:
               

                    System.out.println("CADASTRO DE EMPRÉSTIMO");
                    System.out.println("Digite o código do livro");
                    codigolivro2 = teclado.nextInt();
                    System.out.println("Digite o código do empréstimo");
                    codigoEmprestimo = teclado.nextInt();
                    System.out.println("Digite a data do empréstimo");
                    data_emprestimo = teclado.next();
                    System.out.println("Digite a data da devolução");
                    data_devolucao = teclado.next();
                    System.out.println("Digite o nome do usuario");
                    nome = teclado.next();
                    
                    ControleEmprestimo.cadastrarEmprestimo(codigolivro2, data_emprestimo, data_devolucao,ControleUsuario.pesquisaroUsuario(nome),ControleLivro.pesquisarLivro(codigolivro2));

                    
                break;
            case 4:
                System.out.println("listar emprestimos:");
            ControleEmprestimo.listarEmprestimo();
            break;  
            }
        }
    }

    
}

    

