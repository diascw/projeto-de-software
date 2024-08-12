/*# Ocultamento de Informações
Suponha que a classe abaixo seja utilizada em um sistema de estacionamentos. Esta classe não oculta estruturas que podem mudar no futuro. Reescreva este código, visando encapsular a estrutura de dados responsável por armazenar veículos, isto é, a tabela hash. 

import java.util.Hashtable;

public class Estacionamento {

  public Hashtable<String, String> veiculos;

  public Estacionamento() {
    veiculos = new Hashtable<String, String>();
  }

  public static void main(String[] args) {
    Estacionamento e = new Estacionamento();
    e.veiculos.put("TCP-7030", "Uno");
    e.veiculos.put("BNF-4501", "Gol");
    e.veiculos.put("JKL-3481", "Corsa");
  }
}

*/

import java.util.Hashtable;

public class Estacionamento {

  private Hashtable<String, String> veiculos;

  public void estacionar(String placa, String modelo) {
    // regras de negocio
    this.veiculos.put(placa, modelo);
  }

  public Estacionamento() {
    veiculos = new Hashtable<String, String>();

  }
}
