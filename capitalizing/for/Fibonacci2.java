public class Fibonacci{
  public static void main(String[] args){
    int num = 1, loopar = 0;
    int anteriores[] = {0, 0};
    while (loopar == 0) {
      if (num < 500) {
        anteriores[0] = anteriores[1];
        anteriores[1] = num;
        System.out.printf("%d ", num);
        num = anteriores[0] + anteriores[1];
      }
      else{
        System.out.printf("%d", num);
        loopar = 1;
      }
    }
  }
}
