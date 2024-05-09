package classificacao;
import java.util.Scanner;

public class Classificacao{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int id;
    System.out.println("Digite o codigo do produto:");
    id = input.nextInt();
    switch(id){
      case 1:
        System.out.println("Produto nao perecivel");
        break;
      case 2:
      case 3:
      case 4:
        System.out.println("Produto perecivel");
        break;
      case 5:
      case 6:
        System.out.println("Vestuario");
        break;
      case 7:
        System.out.println("Higiene pessoal");
        break;
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
        System.out.println("Limpesa e utensilios domesticos");
        break;
      default:
        System.out.println("Escolha nao valida");
        break;
    }
  }
}
