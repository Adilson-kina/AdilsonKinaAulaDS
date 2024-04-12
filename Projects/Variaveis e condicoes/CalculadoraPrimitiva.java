import java.util.Scanner;

public class CalculadoraPrimitiva{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float num1, num2;
    int op;
    System.out.printf("Digite o primeiro numero:");
    num1 = input.nextFloat();
    System.out.printf("Digite o segundo numero:");
    num2 = input.nextFloat();
    System.out.printf("Escolha uma operacao \n1.Adicao \n2.Subtracao \n3.Multiplicacao \n4.Divisao\n");
    op = input.nextInt();
    switch (op) {
      case 1:
        System.out.printf("A soma entre %f e %f e de %f", num1, num2, num1 + num2);
        break;
      case 2:
        System.out.printf("A subtracao entre %f e %f e de %f", num1, num2, num1 - num2);
        break;
      case 3:
        System.out.printf("A multiplicacao entre %f e %f e de %f", num1, num2, num1 * num2);
        break;
      case 4:
        System.out.printf("A divisao entre %f e %f e de %f", num1, num2, num1 / num2);
        break;
      default:
        System.out.println("A escolha nao e valida");
        break;
    }
    input.close();
  }
}
