
package modelo;


public class Emprestimo {
    private long codigo;
    private String data_emprestimo;
    private String data_devolucao;
    private Livro livro;
    private Usuario usuario;
    
    
    
    public Emprestimo(long codigo,String data_emprestimo,String data_devolucao,Livro livro,Usuario usuario){
    this.codigo = codigo;
    this.data_emprestimo = data_emprestimo;
    this.data_devolucao = data_devolucao;
    this.livro= livro;
    this.usuario=usuario;
}

    public Emprestimo(long codigo, String data_emprestimo, String data_devolucao, Usuario usuario, Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String imprimir(){
        return "Usuario" + usuario.getNome()+"\nCpf:"+ usuario.getCpf()+"\nEndereço:"+ usuario.getEndereco()+"\nProfissao:"+ usuario.getProfissao()+
          "\nCodigo do livro:"+ livro.getCodigolivro()+"\nTitulo do livro:"+livro.getTitulo()+"\nAutor do livro:"+ livro.getAutor()+"\nISSN:"+livro.getIssn()+
          "\nEditora do livro:"+ livro.getEditora();
    }
    
    
    public void setcodigo(long codigo){
        this.codigo=codigo;
    }
   public long getcodigo(){
       return codigo;
     
   }
   public void setdata_emprestimo(String data_emprestimo){
       this.data_emprestimo=data_emprestimo;
   }
   public String getdata_emprestimo(){
       return data_emprestimo;
   }
   public void setdata_devolucao(String data_devolucao){
       this.data_devolucao=data_devolucao;
   }
   public String getdata_devolucao(){
       return data_devolucao;
   }
   public void setlivro(Livro livro){
       this.livro=livro;
   }
   public Livro getlivro(){
       return livro;
   }
   public void setusuario(Usuario usuario){
       this.usuario=usuario;
   }
   public Usuario getusuario(){
       return usuario;
       
   }
}



