import java.util.Scanner;

public class OneToN{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num, i = 1;
    System.out.print("Digite um numero:");
    num = input.nextInt();
    if (num <= 0) {
      System.out.println("Digite um numero valido");
      main(new String[0]);
    }
    else {
      while (i <= num){
        System.out.println(i);
        i++;
      }
    }
    input.close();
  }
}
