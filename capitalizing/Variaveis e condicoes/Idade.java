import java.util.Scanner;

public class Idade{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int idade, dias, meses;
    System.out.print("Digite sua idade:");
    idade = input.nextInt();
    dias = idade * 365; // meses e dias
    meses = idade * 12;
    System.out.printf("Voce esta vivo a aproximadamente %d dias ou %d meses", dias, meses);
    input.close();
  }
}
