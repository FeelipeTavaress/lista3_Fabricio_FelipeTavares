
package exercicio5lista3;

import java.util.Scanner;


public class Exercicio5Lista3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double peso;
        double altura;
        double IMC;
        
        System.out.print("Informe seu peso atual(em quilos) : ");
        peso = sc.nextDouble();
        System.out.print("Informe sua altura(em metros) : ");
        altura = sc.nextDouble();
        
        IMC = (peso/(altura * altura));
        
        if (IMC< 20){
            System.out.print("Voc� est� abaixo do peso, seu IMC � de: " + IMC);
            
            
        } else if (IMC >= 20 ) { 
             System.out.print("Seu peso est� normal, seu IMC � de: " + IMC);
             
             
        }  else if (IMC >= 25 ) {
        
        System.out.print("Voc� est� com sobrepeso, seu IMC � de: " + IMC);
        
        
        } else if (IMC >= 30 ) {
        
        System.out.print("Voc� est� obeso, seu IMC � de: " + IMC);
        
        
        } else if (IMC > 40 ) {
        
        System.out.print("Voc� est� com obesidade morbida, seu IMC � de: " + IMC);
        
         } else if (IMC > 20 ) {
        
        System.out.print("Voc� est� com desnutri��o, seu IMC � de: " + IMC);
        
        
    } else {
            
           System.out.print("IMC invalido"); 
            }
        
        sc.close();
        
    }
    
}
