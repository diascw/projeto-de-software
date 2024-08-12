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

  // encapsula a estrutura de dados para armazenar os veículos
  private Hashtable<String, String> veiculos;

  public Estacionamento() {
    veiculos = new Hashtable<String, String>();
  }

  // método para adicionar um veículo
  public void adicionarVeiculo(String placa, String modelo) {
    veiculos.put(placa, modelo);
  }

  // método para remover um veículo
  public void removerVeiculo(String placa) {
    veiculos.remove(placa);
  }

  // método para obter o modelo de um veículo
  public String obterModelo(String placa) {
    return veiculos.get(placa);
  }

  // método para verificar se um veículo está presente
  public boolean existeVeiculo(String placa) {
    return veiculos.containsKey(placa);
  }

  public static void main(String[] args) {
    Estacionamento e = new Estacionamento();
    e.adicionarVeiculo("TCP-7030", "Uno");
    e.adicionarVeiculo("BNF-4501", "Gol");
    e.adicionarVeiculo("JKL-3481", "Corsa");

    // exemplo de uso dos métodos encapsulados
    System.out.println(e.obterModelo("TCP-7030")); // Saída: Uno
  }
}
