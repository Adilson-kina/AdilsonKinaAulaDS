import java.util.Scanner;

public class Fibonacci{
  public static void main(String[] args){
    int num = 1, num_input;
    int anteriores[] = {0, 0};
    Scanner input = new Scanner(System.in);
    System.out.print("Digite com quantos indices você quer a sequencia de Fibonacci:");
    num_input = input.nextInt();
    for (int i = 0; i < num_input; i++) {
      anteriores[0] = anteriores[1];
      anteriores[1] = num;
      System.out.printf("%d ", num);
      num = anteriores[0] + anteriores[1];
    }
    //System.out.printf("%d", num);
    input.close();
  }
}
