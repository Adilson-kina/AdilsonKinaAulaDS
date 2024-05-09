import java.util.Scanner;

public class Antecessor{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num;
    System.out.print("Digite um numero:");
    num = input.nextInt();
    System.out.printf("O antecessor do %d e o %d", num, num - 1);
    input.close();
  }
}
