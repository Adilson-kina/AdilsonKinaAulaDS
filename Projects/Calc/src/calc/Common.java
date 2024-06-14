/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calc;

/**
 *
 * @author Aluno CA
 */
public class Common {
    float num1;
    float num2;
    float res;
    public void setnum1(float num1){
        this.num1 = num1;
    }
    public void setnum2(float num2){
        this.num2 = num2;
    }
    public void setres(float res){
        this.res = res;
    }
    public void setboth(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public float getnum1(){
        return this.num1;
    }
    public float getnum2(){
        return this.num2;
    }
    public float getres(){
        return this.res;
    }
}
