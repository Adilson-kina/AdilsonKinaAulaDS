/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocarro;

/**
 *
 * @author pc
 */
public class Carro {
    
    // atributos
    String  nome;
    String  marca;
    int ano;
    int vel;
    
    //métodos
    void acelerar(int aceleracao){
        this.vel += aceleracao;
    }
    
    void freiar(int reduzir){
        this.vel -= reduzir;
    }
    
    void buzinar(){
        System.out.println("Carro Buzinando");
    }
    void setNome(String nome){
        this.nome = nome;
    }
    void setMarca(String marca){
        this.marca = marca;
    }
    void setAno(int ano){
        this.ano = ano;
    }
    void setVel(int velocidade){
        this.vel = velocidade;
    }
    String getNome(){
        return this.nome;
    }
    String getMarca(){
        return this.marca;
    }
    int getAno(){
        return this.ano;
    }
    int getVel(){
        return this.vel;
    }
    }
