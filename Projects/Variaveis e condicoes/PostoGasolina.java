import java.util.Scanner;

public class PostoGasolina{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String tipo;
    int litros;
    float desconto, preco_combustivel, preco_pagar;
    System.out.print("Digite quantos litros de gasolina voce quer:");
    litros = input.nextInt();
    input.nextLine();
    System.out.print("Digite se voce quer Gasolina com 'G' ou Alcool com 'A':");
    tipo = input.nextLine();
    switch (tipo) {
      case "A":
        preco_combustivel = 2.9f;
        if (litros <= 20){
          desconto = 0.03f;
          preco_pagar = preco_combustivel * (litros - (litros * desconto));
          System.out.printf("voce pagara R$%f", preco_pagar);
        }
        else if(litros > 20){
          desconto = 0.05f;
          preco_pagar = preco_combustivel * (litros - (litros * desconto));
          System.out.printf("voce pagara R$%f", preco_pagar);
        }
        break;
      case "B":
        preco_combustivel = 3.3f;
        if (litros <= 20){
          desconto = 0.04f;
          preco_pagar = preco_combustivel * (litros - (litros * desconto));
          System.out.printf("voce pagara R$%f", preco_pagar);
        }
        else if(litros > 20){
          desconto = 0.06f;
          preco_pagar = preco_combustivel * (litros - (litros * desconto));
          System.out.printf("voce pagara R$%f", preco_pagar);
        }
      default:
        break;
    }
    input.close();
  }
}
