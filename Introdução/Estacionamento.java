import java.util.Hashtable;
import java.util.NoSuchElementException;

public class Estacionamento {

  private Hashtable<String, String> veiculos;
  private Gerente gerente;

  public void estacionar(String placa, String modelo) {
    if(placa == null || placa.length() < 8){
      throw new NoSuchElementException("Placa inválida");
    }
    else if(modelo==null){
      throw new NoSuchElementException("Modelo inválido");
    }
    this.veiculos.put(placa, modelo);
  }

  public Estacionamento(Gerente gerente) {
    veiculos = new Hashtable<String, String>();
    this.gerente = gerente;
  }
}