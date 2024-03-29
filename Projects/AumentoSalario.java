package aumentosalario;
import java.util.Scanner;

public class AumentoSalario{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String nome;
    float salarioFixo, novoSalario, dinheiroVendas;
    System.out.print("Digite seu nome:");
    nome = input.nextLine();
    System.out.print("Digite seu salario:");
    salarioFixo = (float) input.nextFloat();
    System.out.print("Digite quantos reais em vendas voce fez:");
    dinheiroVendas = input.nextFloat();
    novoSalario = (float) (salarioFixo+(dinheiroVendas*0.15));
    System.out.printf("Voce vai ganhar R$%f no final", novoSalario);
  }
}
