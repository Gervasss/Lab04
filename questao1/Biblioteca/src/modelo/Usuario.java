
package modelo;


public class Usuario {
      
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    private String cpf;
    private String endereco;
    private String profissao;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public Usuario(String nome, String cpf, String endereco, String profissao){
        this.Nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.profissao = profissao;
    }

    

    
    
}
