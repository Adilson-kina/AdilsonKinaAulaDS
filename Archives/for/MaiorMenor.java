import java.util.Scanner;

public class MaiorMenor{
  public static void main(String[] args){
    int num, maior = 0, menor = 1001, loop;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite quantos numeros você quer digitar:");
    num = input.nextInt();
    loop = num;
    for (int i = 0; i < loop; i++) {
      System.out.printf("Digite o %d° numero:", i + 1);
      num = input.nextInt();
      if (num < 0 || num > 1000) {
        i--;
      }
      else{
        if (num > maior) {
          maior = num;
        }
        else if (num < menor){
          menor = num;
        }
      }
    }
    System.out.printf("O menor numero digitado foi %d e o maior foi %d, e a soma entre eles é de %d", menor, maior, maior + menor);
    input.close();
  }
}
