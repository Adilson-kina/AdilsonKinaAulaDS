import java.util.Scanner;

public class ParImpar{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int i = 1;
    int num;
    System.out.printf("Digite um número:");
    num = input.nextInt();
    input.close();
    while (i <= num) {
      if (i % 2 == 0) {
        System.out.printf("Par:%d \n", i);
      }
      i++;
    }
    i = 1;
    while (i <= num) {
      if (i % 2 == 1) {
        System.out.printf("Impar:%d \n", i);
      }
      i++;
    }
  }
}
