/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estruturacase;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class EstruturaCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int NumeroDoDia;
      System.out.print("Digite um numero:");
      NumeroDoDia = input.nextInt();
      switch (NumeroDoDia) {
        case 1:
          System.out.println("Hoje é domingo");
          break;
        case 2:
          System.out.println("Hoje é segunda feira");
          break;
        case 3:
          System.out.println("Hoje é terca feira");
          break;
        case 4:
          System.out.println("Hoje é quarta feira");
          break;
        case 5:
          System.out.println("Hoje é quinta feira");
          break;
        case 6:
          System.out.println("Hoje é sexta feira");
          break;
        case 7:
          System.out.println("Hoje é sabado");
        default:
          System.out.println("Nao existe o dia da semana digitado");
          break;
       }
    }
    
}
