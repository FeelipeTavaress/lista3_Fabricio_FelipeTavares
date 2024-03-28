
package exercicio9lista3;

import java.util.Scanner;

public class Exercicio9Lista3 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int idade;
       
        System.out.println(" Qual a idade da pessoa? ");
        idade = sc.nextInt();
        
        if (idade < 16) {
            System.out.println(" Não é eleitor "); 
            
        } else if (idade >= 16 && idade <= 17){
             System.out.println(" Eleitor facultativo "); 
            
        }  else if (idade >= 18 && idade <= 65){
             System.out.println(" Eleitor obrigatório "); 
             
        } else if (idade > 65){
         System.out.println(" Eleitor facultativo "); 
        
    }
    
}
}
