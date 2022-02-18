

    
   
    
   
package controle;

import java.util.ArrayList;
import modelo.*;

public class ControleEmprestimo {
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    
    public void cadastrarEmprestimo(long codigo, String data_emprestimo, String data_devolucao, Usuario usuario, Livro livro) {
        Emprestimo emprestimo = new Emprestimo(codigo, data_emprestimo, data_devolucao, usuario, livro);
        emprestimos.add(emprestimo);
    }

    public void removeEmprestimo(long codigo, String data_emprestimo, String data_devolucao, Usuario usuario, Livro livro) {
        Emprestimo emprestimo = new Emprestimo(codigo, data_emprestimo, data_devolucao, usuario, livro);
        emprestimos.remove(emprestimos);
    }

    public Emprestimo pesquisaEmprestimo(long codigo, String data_emprestimo, String data_devolucao, Usuario usuario, Livro livro) {
        Emprestimo emprestimo = new Emprestimo(codigo, data_emprestimo, data_devolucao, usuario, livro);
        for(int i = 0; i < emprestimos.size(); i++) {
            if(emprestimos.get(i).getcodigo() == codigo) {
                return emprestimos.get(i);
            }
        }
        return null;
    }

    public void listarEmprestimo() {
        for(int i = 0; i < emprestimos.size(); i++) {
            System.out.println("Codigo Emprestimo: " + emprestimos.get(i).getcodigo() +
                                "\nTitulo: " + emprestimos.get(i).getlivro() +
                                "\nUsuario: " + emprestimos.get(i).getusuario() +
                                "\nData do Emprestimo: " + emprestimos.get(i).getdata_emprestimo() +
                                "\nData de Devolucao: " + emprestimos.get(i).getdata_devolucao() + "\n\n");
        }
    }
}
