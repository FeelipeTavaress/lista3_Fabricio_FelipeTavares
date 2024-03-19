
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
            System.out.print("Você está abaixo do peso, seu IMC é de: " + IMC);
            
            
        } else if (IMC >= 20 ) { 
             System.out.print("Seu peso está normal, seu IMC é de: " + IMC);
             
             
        }  else if (IMC >= 25 ) {
        
        System.out.print("Você está com sobrepeso, seu IMC é de: " + IMC);
        
        
        } else if (IMC >= 30 ) {
        
        System.out.print("Você está obeso, seu IMC é de: " + IMC);
        
        
        } else if (IMC > 40 ) {
        
        System.out.print("Você está com obesidade morbida, seu IMC é de: " + IMC);
        
        
         } else if (IMC < 20 ) {
        
        System.out.print("Você está com desnutri��o, seu IMC é de: " + IMC);
        
        
    } else {
            
           System.out.print("IMC invalido"); 
            }
        
        sc.close();
        
    }
    
}
