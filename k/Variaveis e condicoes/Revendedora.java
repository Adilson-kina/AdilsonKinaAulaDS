import java.util.Scanner;

public class Revendedora{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float salario, comissao_carro_fixo, preco_carro, comissao_carro_variavel;
    comissao_carro_variavel = (float) 0.05;
    System.out.print("Digite o seu salario fixo:");
    salario = input.nextFloat();
    System.out.print("Digite de quantos reais e a comissao fixa por venda de carro:");
    comissao_carro_fixo = input.nextFloat();
    System.out.print("Digite em reais o valor total de carros que voce vendeu:");
    preco_carro = input.nextFloat();
    preco_carro *= comissao_carro_variavel;
    System.out.printf("O seu salario no final sera de R$%f", salario + comissao_carro_fixo + preco_carro);
    input.close();
  }
}
