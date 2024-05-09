import java.util.Scanner;

class TenNumbers{
  public static void main(String[] argv){
    Scanner input = new Scanner(System.in);
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      System.out.printf("Digite o numero de indice %d:", i);
      arr[i] = input.nextInt();
    }
    for (int i2 = 9; i2 >= 0; i2--) {
      System.out.printf("Index %d:%d\n", i2, arr[i2]);
    }
    input.close();
  }
}
