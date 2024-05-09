import java.util.Scanner;

public class MaioresNumero{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int i, maior_num, maior_num2, num;
    i = 0; maior_num = 0; maior_num2 = 0;
    while (i < 10) {
      System.out.printf("Digite o %d° número:", i + 1);
      num = input.nextInt();
      if (num > maior_num) {
        maior_num2 = maior_num;
        maior_num = num;
      }
      else if (num > maior_num2 && num < maior_num){
        maior_num2 = num;
      }
      i++;
    }
    input.close();
    System.out.printf("O maior número é %d, e o segundo maior é %d \n", maior_num, maior_num2);
  }
}
