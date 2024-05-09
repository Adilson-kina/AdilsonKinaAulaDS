import java.util.Scanner;

class TemperaturaMedia{
  public static void main(String[] argv){
    Scanner input = new Scanner(System.in);
    float maiorTempAno = Float.MIN_VALUE; float menorTempAno = Float.MAX_VALUE; float mediaAno = 0;
    float[] tempMediaDia = new float[10];
    for (int i = 0; i < 10; i++) {
      System.out.printf("Digite a temperatura media do dia %d:", i+1);
      tempMediaDia[i] = input.nextFloat();
      if (maiorTempAno < tempMediaDia[i]) {
        maiorTempAno = tempMediaDia[i];
      }
      else if (menorTempAno > tempMediaDia[i]){
        menorTempAno = tempMediaDia[i];
        System.out.printf("menorTempAno:%.1f", menorTempAno);
      }
      mediaAno += tempMediaDia[i];
      System.out.printf("menorTempAno:%.1f", menorTempAno);
    }
    mediaAno /= 10;
    System.out.printf("A media do ano foi %.1f, a minima foi %.1f, e a maxima foi %.1f", mediaAno, menorTempAno, maiorTempAno);
    input.close();
  }
}
