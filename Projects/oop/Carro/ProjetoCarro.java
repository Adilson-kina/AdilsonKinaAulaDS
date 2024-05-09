/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocarro;
/**
 *
 * @author pc
 */
public class ProjetoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // instanciando a classe carro;
        
        Carro carro1 = new Carro();
        carro1.setNome("UNO");
        carro1.setMarca("FIAT");
        carro1.setAno(2015);
        carro1.setVel(60);
        
        carro1.acelerar(10);
        System.out.println("Velocidade: "+carro1.vel+" KM");
        carro1.freiar(30);
        System.out.println("Velocidade Apos Freio: "+carro1.vel+" km");
        carro1.buzinar();
        String nomeCarro1 = carro1.getNome();
        System.out.printf("Suposto nome do carro 1 %s", nomeCarro1);
    }
    
       
    
}
