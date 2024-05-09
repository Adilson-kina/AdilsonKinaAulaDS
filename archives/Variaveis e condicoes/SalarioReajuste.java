import java.util.Scanner;

public class SalarioReajuste{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    float salario_inicial, salario_final;
    int reajuste_porcento;
    System.out.print("Digite seu salario atual:");
    salario_inicial = input.nextFloat();
    System.out.print("Digite quantos por cento a mais voce ganhara");
    reajuste_porcento = input.nextInt();
    reajuste_porcento /= 100;
    salario_final = salario_inicial + (salario_inicial * reajuste_porcento);
    System.out.printf("O seu salario final sera de R$%f", salario_final);
    input.close();
  }
}
