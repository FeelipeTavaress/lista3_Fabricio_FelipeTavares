
package exercicio8lista3fabricio;

import java.util.Scanner;


public class Exercicio8Lista3Fabricio {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double lado1;
        double lado2;
        double lado3;
        
        
        while(true){
            System.out.println(" Informe o valor de um dos lados do triângulo: ");
        lado1 = sc.nextDouble();
        System.out.println(" Informe o valor de outro lado do triângulo: ");
        lado2 = sc.nextDouble();
        System.out.println(" Informe o valor de mais um dos lados do triângulo: ");
        lado3 = sc.nextDouble();
       
        if(lado1 < lado2 + lado3 && lado2 < lado3 + lado1 && lado3 < lado2 + lado1 ){
            break;
              
        }else {
            
            System.out.println("Valores inválidos!");}
        }
               
        
          
        if ( lado1 == lado2 && lado1 == lado3 && lado2 == lado3 ) {
       System.out.println("O triângulo é um triângulo equilátero! ");
                   
    } else if (lado1 == lado2 && lado2 != lado3){
        
       System.out.println("O triângulo é um triângulo isósceles! ");
        
    } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
        
          System.out.println("O triângulo é um triângulo escaleno! ");
        
    }
    }
}
    
