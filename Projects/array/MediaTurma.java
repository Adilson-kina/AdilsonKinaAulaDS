import java.util.Scanner;

class MediaTurma{
  public static void main(String[] argv){
    Scanner input = new Scanner(System.in);
    float[][] notas = new float[5][3];
    for (int i = 0; i < 5; i++) {
      for (int i2 = 0; i2 < 2; i2++) {
        System.out.printf("Digite a nota %d do aluno %d:", i2+1, i+1);
        notas[i][i2] = input.nextFloat();
        System.out.printf("i2:%d, i:%d\n", i2, i);
      }
    }
    for (int i3 = 0; i3 < 5; i3++) {
      notas[i3][2] = (notas[i3][0] + notas[i3][1]) / 2;
    }
    for (int i4 = 0; i4 < 5; i4++) {
      System.out.printf("Media aluno %d: %f\n", i4, notas[i4][2]);
    }
    input.close();
  }
}
