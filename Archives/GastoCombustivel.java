package gastocombustivel;
import java.util.Scanner;

public class GastoCombustivel{
  public static void main(String[] args){
    float distanciaKm, combustivelGastoLitro, gastoKm;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite a distancia total percorrida em km:");
    distanciaKm = (float) input.nextFloat();
    System.out.print("Digite o combustivel gasto em litros:");
    combustivelGastoLitro = (float) input.nextFloat();
    gastoKm = combustivelGastoLitro / distanciaKm;
    System.out.printf("O automovel gasta %f litros por km", gastoKm);
  }
}
