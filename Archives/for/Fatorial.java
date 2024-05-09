import java.util.Scanner;

public class Fatorial{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    System.out.printf("Digite um número para saber o fatorial:");
    num = input.nextInt();
    for (int i = num - 1; i > 0; i--) {
      num *= i;
    }
    System.out.printf("O fatorial é %d", num);
    input.close();
  }
}
