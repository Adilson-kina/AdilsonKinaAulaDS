import java.util.Scanner; 

public class Quadrado1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Digite um numero:");
    int num = input.nextInt();
    int holder1 = 0;
    int holder2 = 0;
    while (holder1 < num){
      while (holder2 < num) {
        System.out.printf("*");
        holder2++;
      }
      if (holder2 < num+1) {
        holder2 = 0;
        System.out.println("");
        holder1++;
      }
    }
    input.close();
  }
}
