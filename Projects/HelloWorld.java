/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;
/**
 *
 * @author Adilson
 */
public class HelloWorld {
//Comentario de criação de classe
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double  num1, num2, newNum1;
        num1 = 324.5;
        num2 = 458.8;
        System.out.printf("a soma entre %f, e %f é de %f\n", num1, num2, num1+num2);
        System.out.printf("o num1 é:%f e o num2 é:%f\n", num1, num2);
        newNum1 = num2;
        num2 = num1;
        num1 = newNum1;
        System.out.printf("o novo num1 é:%f e o novo num2 é:%f\n", num1, num2);
        
    }
}
