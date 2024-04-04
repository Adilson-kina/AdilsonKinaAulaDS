import java.util.Scanner;

public class Quadrado2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.printf("Digite um numero:");
    int num = input.nextInt();
    int holder1 = 0;
    int holder2 = 0;
    String nothing = " ";
    while (holder1 < num) {
      while (holder2 < num) {
        switch (holder2) {
          case 0, 4:
            System.out.printf("*");
            holder2++;
            break;

          default:
            System.out.printf("*{nothing*(num-2)}*");
            break;
            holder2++;
          if (holder2 == num + 1) {
          System.out.println("");
          holder1++;
        } 
        }
      }
    }
  }
}
