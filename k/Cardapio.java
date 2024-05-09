package valor;
import java.util.Scanner;

public class Cardapio{
  public static void main(String[] args){
    short codigo, quantidade;
    float preco;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite qual o codigo do produto:");
    codigo = input.nextShort();
    System.out.print("Digite a quantidade do produto:");
    quantidade = input.nextShort();
    switch(codigo){
      case 100:
        preco = (float) 1.7;
        System.out.printf("O valor total e de: R$%f", quantidade*preco);
        break;
      case 101:
        preco = (float) 2.3;
        System.out.printf("O valor total e de: R$%f", quantidade*preco);
        break;
      case 102: 
        preco = (float) 2.6;
        System.out.printf("O valor total e de: R$%f", quantidade*preco);
        break;
      case 103:
        preco = (float) 2.4;
        System.out.printf("O valor total e de: R$%f", quantidade*preco);
        break;
      case 104:
        preco = (float) 2.5;
        System.out.printf("O valor total e de: R$%f", quantidade*preco);
        break;
      case 105:
        preco = (float) 1;
        System.out.printf("O valor total e de: R$%f", quantidade*preco);
        break;
      default:
        System.out.println("Digite um valor valido");
        break;
    }
  }
}
