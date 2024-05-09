public class Impares{
  public static void main(String[] args){
    int num = 0;
    while (num < 101) {
      if (num % 2 == 1) {
        System.out.printf("Impar:%d \n", num);
      }
      num++;
    }
  }
}
