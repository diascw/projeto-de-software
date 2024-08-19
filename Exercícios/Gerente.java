public class Gerente{
  private String nome;
  private String cpf;
  private String fone;
  private String endereco;

  Gerente(String nome, String cpf, String fone, String endereco){
      this.nome = nome;
      this.cpf = cpf;
      this.fone = fone;
      this.endereco = endereco;
    
  }

  public String getNome(){
    return this.nome;
  }

  public String getCpf(){
    return this.cpf;
  }

  public String getFone(){
    return this.fone;
  }

  public String getEndereco(){
    return endereco;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public void setFone(String fone){
    this.fone = fone;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
}