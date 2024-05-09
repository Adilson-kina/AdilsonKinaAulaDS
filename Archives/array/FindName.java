import java.util.Scanner;

class FindName{
  public static void main(String[] argv){
    Scanner input = new Scanner(System.in);
    String[] nomes = new String[10];
    String achar_nome;
    int quit = 0;
    for (int i = 0; i < 10; i++) {
      System.err.printf("Digite o %d° nome:", i+1);
      nomes[i] = input.nextLine();
    }
    System.out.printf("Digite outro nome para achar:");
    achar_nome = input.nextLine();
    quit++;
    for (int i2 = 0; i2 < 10; i2++){
      quit++;
      if (achar_nome.equals(nomes[i2])) {
        System.out.printf("Achei");
        return;
      }
      else if(quit == 9){
        System.out.printf("Não achei");
        return;
      }
    }
    input.close();
  }
}
