import java.util.Scanner;

public class Populacao{
  public static void main(String[] args){
    int populacao_a = 80000, populacao_b = 200000, anos = 0;
    float taxa_a = 0.03f, taxa_b = 0.015f;
    while (populacao_a < populacao_b) {
      populacao_a += Math.round(populacao_a * taxa_a);
      populacao_b += Math.round(populacao_b * taxa_b);
      anos++;
    }
    System.out.printf("Em %d anos o pais A terá %d habitantes e o pais B %d habitantes", anos, populacao_a, populacao_b);
  }
}
