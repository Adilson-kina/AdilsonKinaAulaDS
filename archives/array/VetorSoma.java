import java.util.Scanner;

class VetorSoma{
  public static void main(String[] argv){
    Scanner input = new Scanner(System.in);
    int tamanho_vetor;
    System.out.printf("Digite o numero de indices o vetor terá:");
    tamanho_vetor = input.nextInt();
    int[] arr1 = new int[tamanho_vetor];
    int[] arr2 = new int[tamanho_vetor];
    int[] arr3 = new int[tamanho_vetor];
    for (int i = 0; i < 3; i++) {
      for (int i2 = 0; i2 < tamanho_vetor; i2++) {
        if (i == 0){
          System.out.printf("Digite o %d° número do array %d:", i2+1, i+1);
          arr1[i2] = input.nextInt();
        }
        else if (i == 1){
          System.out.printf("Digite o %d número do array %d:", i2+1, i+1);
          arr2[i2] = input.nextInt();
        }
        else{
          arr3[i2] = arr1[i2] + arr2[i2];
          System.out.printf("Array 3 Index %d:%d\n", i2, arr3[i2]);
        }
      }
    }
    input.close();
  }
}
