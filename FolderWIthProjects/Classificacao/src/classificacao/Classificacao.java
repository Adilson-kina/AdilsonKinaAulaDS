/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classificacao;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class Classificacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int IdProduto;
      Scanner input = new Scanner(System.in);
      System.out.print("Digite um codigo de produto:");
      IdProduto = input.nextInt();
      switch (IdProduto) {
        case 1:
          System.out.println("Alimento nao perecivel");
          break;
        case 2:
          System.out.println("Alimento perecivel");
          break;
        case 3:
          System.out.println("Alimento perecivel");
          break;
        case 4:
          System.out.println("Alimento perecivel");
          break;
        case 5:
          System.out.println("Vestuario");
          break;
        case 6:
          System.out.println("Vestuario");
          break;
        case 7:
          System.out.println("Higiene pessoal ");
      }
      if(IdProduto >=8 && IdProduto <= 15){
        System.out.println("Limpesa e utensilios domesticos");
      }
      else if (IdProduto > 15){
        System.out.println("Codigo invalido");
      }
    }
    
}
