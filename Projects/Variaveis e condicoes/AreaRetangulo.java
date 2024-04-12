import java.util.Scanner;

public class AreaRetangulo{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float altura, largura, area;
    System.out.print("Digite a altura do retangulo:");
    altura = input.nextFloat();
    System.out.print("Digite a largura do retangulo:");
    largura = input.nextFloat();
    area = altura * largura;
    System.out.printf("A area do retangulo e de %f", area);
    input.close();
  }
}
