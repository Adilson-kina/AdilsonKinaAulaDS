import java.util.Scanner;

public class CustoCarro{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float imposto = (float) 0.45; float distribuidor = (float) 0.28, preco_carro;
    System.out.print("Digite o preco de fabrica do carro:");
    preco_carro = input.nextFloat();
    preco_carro = preco_carro + (preco_carro * distribuidor) + (preco_carro * imposto);
    System.out.printf("O preco do carro e de R$%f", preco_carro);
    input.close();
  }
}
