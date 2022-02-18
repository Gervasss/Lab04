
package controle;

import java.util.ArrayList;
import modelo.Usuario;

public class ControleUsuario {
private final ArrayList<Usuario>usuario=new ArrayList();
    
    public void cadastrarUsuario(String nome,String cpf,String endereco,String profissao){
        Usuario cont= new Usuario(nome,cpf,endereco,profissao);
        usuario.add(cont);
    }
    
    public Usuario pesquisaroUsuario(String nome){
        for(int i = 0;1<usuario.size();i++){
            if(usuario.get(i).getNome().equals(nome)){
                return usuario.get(i);
            }
                    
        }
        return null;
}
    public void removeroUsuario(String nome,String cpf,String endereco,String profissao){
        Usuario cont= new Usuario(nome,cpf,endereco,profissao);
        usuario.remove(cont);
    
    
}
}
 