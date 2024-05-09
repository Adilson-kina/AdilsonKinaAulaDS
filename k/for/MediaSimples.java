import java.util.Scanner;

public class MediaSimples{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float nota1, nota2, media;
    String continuar;
    System.out.print("Digite a primeira nota do aluno:");
    nota1 = nota(input);
    System.out.print("Digite a segunda nota do aluno:");
    nota2 = nota(input);
    media = (nota1 + nota2) / 2;
    System.out.printf("A media do aluno é %.1f\n", media);
    System.out.print("Gostaria de continuar?(s/n)");
    continuar = input.nextLine();
    switch (continuar){
      case "s":
        main(new String[0]);
        break;
      case "n":
        break;
      default:
        System.out.println("Pow nem isso escolhendo certo, considerar não");
    }
    input.close();
  }
  public static float nota(Scanner input){
    float num = input.nextFloat();
    input.nextLine();
    if (num >= 0 && num <= 10){
      return num;
    }
    else{
      System.out.println("Digite uma nota valida");
      return nota(input);
    }
  }
}
