import java.util.Scanner;

public class MaiorNumero{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int i, maior_num, num;
    i = 0; maior_num = 0;
    while (i < 10) {
      System.out.printf("Digite o %d° número:", i + 1);
      num = input.nextInt();
      if (num > maior_num) {
        maior_num = num;
      }
      i++;
    }
    input.close();
    System.out.printf("O maior número é %d \n", maior_num);

  }
}
