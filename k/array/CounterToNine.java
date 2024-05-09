import java.util.Scanner;

class CounterToNine{
  public static void main(String[] argv){
    Scanner input = new Scanner(System.in);
    int[] arr = new int[10];
    int[] arr2 = new int[10];
    int choose_array = 1;
    for (int i = 0; i < 10; i++) {
      System.out.printf("Digite o %d° número:", i+1);
      arr[i] = input.nextInt();
    }
    for (int i2 = 0; i2 < 10; i2++) {
      if (arr[i2] % 2 == 0){
        arr2[i2] = arr[i2] * 5;
      }
      else{
        arr2[i2] = arr[i2] + 5;
      }
    }
    for (int i3 = 0; i3 < 10; i3++) {
      if (choose_array == 1){
        System.out.printf("Array 1, Index %d:%d\n", i3, arr[i3]);
      }
      else if (choose_array == 2){
        System.out.printf("Array 2, Index %d:%d\n", i3, arr2[i3]);
      }
      if (i3 == 9 && choose_array == 1){
        choose_array++;
        i3 = -1;
      }
    }
    input.close();
  }
}
