import java.util.Scanner;

class MediaTurma{
  public static void main(String[] argv){
    Scanner input = new Scanner(System.in);
    float[][] notas = new float[20][3];
    float media_turma = 0;
    int maior_que_media = 0;
    for (int i = 0; i < 20; i++) {
      for (int i2 = 0; i2 < 2; i2++) {
        System.out.printf("Digite a nota %d do aluno %d:", i2+1, i+1);
        notas[i][i2] = input.nextFloat();
      }
    }
    for (int i3 = 0; i3 < 20; i3++) {
      notas[i3][2] = (float) (notas[i3][0] + notas[i3][1]) / 2;
    }
    for (int i4 = 0; i4 < 20; i4++) {
      media_turma += notas[i4][2];
    }
    media_turma /= 20;
    for (int i5 = 0; i5 < 20; i5++) {
      if(notas[i5][2] > media_turma){
        maior_que_media++;
      }
    }
    System.out.printf("A nota media da turma é de:%.1f \ne o numero de alunos com nota maior que a media é de:%d\n", media_turma, maior_que_media);
    input.close();
  }
}
