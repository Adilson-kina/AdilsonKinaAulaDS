/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorapre;
import java.util.Scanner;

/**
 *
 * @author Aluno CA
 */
public class CalculadoraPre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short num1, num2, operacao;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:");
        num1 = input.nextShort();
        System.out.print("Digite o tipo de operacao \n1.Adicao \n2.Subtracao \n3.Multiplicacao \n4.Divisao \n");
        operacao = input.nextShort();
        if (operacao <= 4 && operacao >= 1){
          System.out.print("Digite o segundo numero:");
          num2 = input.nextShort();
          switch(operacao){
            case 1:
              System.out.printf("A soma entre %d e %d e de %d", num1, num2, num1+num2);
              break;
            case 2:
              System.out.printf("A subtracao entre %d e %d e de %d", num1, num2, num1-num2);
              break;
            case 3:
              System.out.printf("A multiplicacao entre %d e %d e de %d", num1, num2, num1*num2);
              break;
            case 4:
              System.out.printf("A divisao entre %d e %d e de %d", num1, num2, num1/num2);
              break;
          }
        }
        else{
            System.out.println("Voce nao digitou um valor valido");
            main(args);
        }
    }
}