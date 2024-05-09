package calculadora;
import java.util.Scanner;

public class Calculadora{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float num1, num2, media, diferenca, produto, divisao;
    int choose;
    System.out.print("Digite o primeiro numero:");
    num1 = input.nextFloat();
    System.out.print("Digite o segundo numero:");
    num2 = input.nextFloat();
    System.out.printf("Escolha uma operacao \n1. Media\n2. Diferenca \n3. Produto \n4. Divisao\n");
    choose = input.nextInt();
    media = (num1+num2) /2;
    diferenca = num1-num2;
    produto = num1 * num2;
    divisao = num1/num2;
    switch(choose){
      case 1:
        System.out.printf("A media entre %f e %f e de %f", num1, num2, media);
        break;
      case 2:
        System.out.printf("A diferenca entre %f e %f e de %f", num1, num2, diferenca);
        break;
      case 3:
        System.out.printf("O produto entre %f e %f e de %f", num1, num2, produto);
        break;
      case 4:
        System.out.printf("A divisao entre %f e %f e de %f", num1, num2, divisao);
      default:
        System.out.println("Escolha uma opcao valida");
    }
  }
}
