import java.util.Scanner;

/**
 *
 * Autor: RA: 1124736840 Nome: Adilson
 * Data: 11/04/2024
 *
 **/

public class Tabuada{
  public static void main(String[] args){
    System.out.print("Digite o numero para saber a tabuada:");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt(); 
    System.out.print("Digite até onde a tabuada deve ir:");
    int ate_quando = input.nextInt();
    for (int i = 1; i <= ate_quando; i++) {
      System.out.printf("%d x %d = %d \n", num, i, i * num);
    }
    input.close();
  }
}
