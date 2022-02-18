
package modelo;


public class Livro {

    public int getCodigolivro() {
        return codigolivro;
    }

    public void setCodigolivro(int codigolivro) {
        this.codigolivro = codigolivro;
    }

    
    private  int codigolivro;
    private String titulo;
    private String autor;
    private long issn;
    private String editora;
     
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }
    
    public Livro(int codigo, String titulo, String autor, long issn){
       this.codigolivro = codigo;
       this.autor = autor;
       this.issn = issn;
       this.titulo = titulo;
    }

    

    
        
}




