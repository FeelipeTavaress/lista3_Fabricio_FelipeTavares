
package exercicio1lista3;

import java.util.Scanner;


public class Exercicio1Lista3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double resultado; 
        
        System.out.println("Informe um número: ");
        num1  = sc.nextDouble();
        System.out.println("Informe mais um número: ");
        num2  = sc.nextDouble();
        
        resultado = (num1 / num2);
        System.out.println("O resultado da divisão é: " + resultado);
        
        
        
                
                
     sc.close();
    }
    
}
