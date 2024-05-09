public class ProjetoCarro{
  public static void main(String[] argv){
    Carro c1 = new Carro();
    c1.nome = "UNO";
    c1.marca = "FIAT";
    c1.ano = 2015;
    c1.vel = 60;

    c1.acelerar(20);
    System.out.printf("O carro está a %d KM", c1.vel);
  }
}
