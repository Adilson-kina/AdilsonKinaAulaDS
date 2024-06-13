/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc;

/**
 *
 * @author Aluno CA
 */
public class Divisao extends Common{
    public float divisao(){
        if(num2 != 0){
            return this.num1 / this.num2;
        }
        else{
            throw new ArithmeticException("nao da pra dividir por zero");
        }
    }
}
