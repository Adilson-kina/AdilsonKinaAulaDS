import java.util.Scanner;

public class PesoIdeal{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String nome, sexo;
    float altura_em_m, peso_ideal;
    System.out.print("Digite seu nome:");
    nome = input.nextLine();
    System.out.print("Digite seu sexo(m/f):");
    sexo = input.nextLine();
    if (sexo != "m" || sexo != "f" || sexo != "M" || sexo != "F"){
      System.err.print("Digite um valor valido");
    }
    System.out.print("Digite sua altura em metros:");
    altura_em_m = input.nextFloat();
    switch(sexo){
      case "m", "M":
        peso_ideal = ( (float) 72.7 * altura_em_m) - 58;
        System.out.printf("Ola %s seu peso ideal seria de %f", nome, peso_ideal);
        break;
      case "f", "F":
        peso_ideal = ( (float) 62.1 * altura_em_m) - (float) 44.7;
        System.out.printf("Ola %s seu peso ideal seria de %f", nome, peso_ideal);
        break;
    }
    input.close();
  }
}
