import java.util.Scanner;

public class TrocaVariavel{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num1, num2, holder;
    System.out.print("Digite o primeiro numero:");
    num1 = input.nextInt();
    System.out.print("Digite o segundo numero:");
    num2 = input.nextInt();
    holder = num1;
    num1 = num2;
    num2 = holder;
    System.out.printf("O valor do segundo numero e %d e o valor do primeiro numero e %d", num2, num1);
    input.close();
  }
}
