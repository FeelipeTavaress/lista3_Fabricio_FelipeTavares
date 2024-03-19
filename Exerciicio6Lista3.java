
package exerciicio6lista3;

import java.util.Scanner;


public class Exerciicio6Lista3 {
    
         

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         int estacao;
        
        
        
        System.out.print("Insira um número de 1 a 4(sendo 1 primavera, 2 verão, 3 outono, 4 inverno): " );
        estacao = sc.nextInt();
        
        
         if (estacao == 1){
            
            System.out.print("Você escolheu primavera, estação onde as planras florescem! " );
            
                  
        } else if (estacao == 2) {
            
            System.out.print("Você escolheu verão, estação mais quente do ano! " );
            
        } else if (estacao == 3) {
            
            System.out.print("Você escolheu outono, estação onde as plantas perdem  suas folhas! " );
            
            
        } else if (estacao == 4) {          
               
            System.out.print("Você escolheu inverno, estação mais fria do ano! " );
            
            
            
            sc.close();
            
            
        }
    }
    
}
