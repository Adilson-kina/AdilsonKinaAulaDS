import java.util.Scanner;

public class ConsumoAutomovel{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float distancia, combustivel_gasto, consumo;
    System.out.printf("Digite a distancia percorrida pelo automovel(em km):");
    distancia = input.nextFloat();
    System.out.printf("Digite o combustivel gasto nesse distancia(em L):");
    combustivel_gasto = input.nextFloat();
    consumo = distancia / combustivel_gasto;
    System.out.printf("Voce gasta %fL/km", consumo);
    input.close();
  }
}
