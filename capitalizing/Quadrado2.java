/**
 *
 * Autor: RA: 1124736840 Nome: Adilson Kina
 * Data: 12/04/2024
 *
**/

import java.util.Scanner;

public class Quadrado2{
  // AVISO: O CODIGO FUNCIONA POR MAGICA CUIDADO AO TOCAR NO CODIGO
  public static void main(String[] args){
    int lados, i = 0, i2 = 0, i3 = 0, i4 = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o numero de lados do quadrado:");
    lados = input.nextInt();
    while (i < lados){
      while (i2 < lados){
        if (i3 == 0 || i3 == lados - 1){
          System.out.print("*");
          i2++;
          if (i2 == lados){
            i3++;
          }
        }
        else{
          System.out.print("*");
          while (i4 < lados - 2){
            System.out.print(" ");
            if (i4 == lados - 3){
              i3++;
            }
            i4++;
          }
          System.out.print("*");
          i4 = 0;
          i2 = lados;
        }
      }
      i2 = 0;
      System.out.println("");
      i++;
    }
    input.close();
  }
}
