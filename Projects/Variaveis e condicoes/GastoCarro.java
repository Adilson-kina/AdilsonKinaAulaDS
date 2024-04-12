import java.util.Scanner;

public class GastoCarro{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float preco_gasolina, distancia_km, custo_viagem, combustivel_necessario;
    int km_l;
    System.out.print("Digite o preco atual da gasolina:");
    preco_gasolina = input.nextFloat();
    System.out.print("Digite quantos kilometro/litro seu carro gasta:");
    km_l = input.nextInt();
    System.out.print("Digite a distancia da viagem em km:");
    distancia_km = input.nextFloat();
    combustivel_necessario = distancia_km / km_l;
    custo_viagem = combustivel_necessario * preco_gasolina;
    System.out.printf("Voce gastara R$%f", custo_viagem);
    input.close();
  }
}
