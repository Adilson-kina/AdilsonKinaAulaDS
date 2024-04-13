import java.util.Scanner;

public class Eleitores{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int eleitores, voto_nulo, voto_branco, voto_valido;
    float porcento_nulo, porcento_branco, porcento_valido;
    System.out.print("Digite o numero de eleitores:");
    eleitores = input.nextInt();
    System.out.print("Digite o numero de votos brancos:");
    voto_branco = input.nextInt();
    System.out.print("Digite o numero de votos nulos:");
    voto_nulo = input.nextInt();
    System.out.print("digite o numero de votos validos:");
    voto_valido = input.nextInt();
    porcento_nulo = ((float)voto_nulo / eleitores) * 100;
    porcento_branco = ((float)voto_branco / eleitores) * 100;
    porcento_valido = ((float)voto_valido / eleitores) * 100;
    System.out.printf("Tem %f por cento de votos validos, %f por cento de votos nulos, %f por cento de votos brancos", porcento_valido, porcento_nulo, porcento_branco);
    input.close();
  }
}
