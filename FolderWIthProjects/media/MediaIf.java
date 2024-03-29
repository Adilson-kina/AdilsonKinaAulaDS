package media;
import java.util.Scanner;

public class MediaIf{
  public static void main(String[] args){
    Scanner input = new input(System.in);
    float nota1, nota2, res;
    System.out.print("Digite a primeira nota:");
    nota1 = input.nextFloat();
    System.out.print("Digite a segunda nota:");
    nota2 = input.nextFloat();
    res = (nota1+nota2)/2;
    if(res>=0 && res<=4){
      System.out.printf("A nota foi %f Reprovado");
    }
    else if(res>=4.1 && res<=7){
      System.out.printf("A nota foi %f Exame");
    }
    else if(res>=7.1 && res<=10){
      System.out.prinf("A nota foi %f Aprovado")
    }
  }
}
