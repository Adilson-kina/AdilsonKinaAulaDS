import java.util.Scanner; 

public class Divisao{
  public static void main(String[] args){
    float num1, num2, div;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o primeiro numero:");
    num1 = (float) input.nextFloat();
    while (true) {
      System.out.print("Digite o segundo numero:");
      num2 = (float) input.nextFloat();
      if (num2 == 0) {
        System.out.println("Não da para dividir por 0");
      }
      else{
        break;
      }
    }
    div = (float) num1/num2;
    System.out.printf("O resultado da divisão de %.2f por %.2f é de %.2f", num1, num2, div);
    input.close();
  }
}
