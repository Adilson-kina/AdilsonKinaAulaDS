import java.util.Scanner;

public class MediaNota{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num_alunos, soma_notas, media, i;
    i = 0;
    soma_notas = 0;
    System.out.printf("Digite a quantidade de alunos na sua sala:");
    num_alunos = input.nextInt();
    while (i < num_alunos) {
      System.out.printf("Digite a nota do aluno %d:", i + 1);
      soma_notas += input.nextInt();
      i++;
    }
    media = soma_notas / num_alunos;
    System.out.printf("A media da turma de %d alunos é de %d \n", num_alunos, media);
  }
}
