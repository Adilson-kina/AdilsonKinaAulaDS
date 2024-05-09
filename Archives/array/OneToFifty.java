class OneToFifty{
  public static void main(String[] argv){
    int[] arr = new int[50];
    for (int i = 1; i <= 50; i++) {
      arr[i-1] = i;
    }
    for (int i2 = 50; i2 > 0; i2--) {
      System.out.printf("Index %d:%d\n", i2-1, arr[i2-1]);
    }
  }
}
