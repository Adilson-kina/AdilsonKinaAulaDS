public class Pares{
  public static void main(String[] args){
    int num = 0;
    while (num < 101) {
      if (num % 2 == 0) {
        System.out.printf("Par:%d \n", num);
      }
      num++;
    }
  }
}
