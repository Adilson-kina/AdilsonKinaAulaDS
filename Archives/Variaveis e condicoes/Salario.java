import java.util.Scanner;

public class Salario{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String nome;
    float salario, vendas_em_reais;
    System.out.print("Digite o seu nome:");
    nome = input.nextLine();
    System.out.print("Digite o seu salario:");
    salario = input.nextFloat();
    System.out.print("Digite quantos reais voce fez em vendas:");
    vendas_em_reais = input.nextFloat();
    System.out.printf("Ola %s seu salario no final do mes sera de R$%f", nome, salario + (0.15 * vendas_em_reais));
    input.close();
  }
}
