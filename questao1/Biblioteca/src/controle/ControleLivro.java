
package controle;
import java.util.ArrayList;
import modelo.Livro;
public class ControleLivro {
private ArrayList<Livro>livro=new ArrayList();
    
    public void cadastrarLivro(int codigo,String titulo,String autor,long issn){
        Livro cont= new Livro(codigo,titulo,autor,issn);
        livro.add(cont);
    }
   public Livro pesquisarLivro(int codigo){
        for(int i = 0;1<livro.size();i++){
            if(livro.get(i).getCodigolivro()==codigo){
                return livro.get(i);
            }
                    
        }
        return null;
}
        
   public void removeroLivro(int codigo,String titulo,String autor,long issn){
        Livro cont= new Livro(codigo,titulo,autor,issn);
       livro.remove(cont);
    
    
}
   
   }
   

