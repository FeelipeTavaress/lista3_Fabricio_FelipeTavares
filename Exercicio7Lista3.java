
package exercicio7lista3;

import java.util.Scanner;


public class Exercicio7Lista3 {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         String nome;
         int quantidade;
         Double preco;
         Double total;
         double totalpagar;
         double desconto;
         
         
         
        
        
        
        System.out.print("Insira o nome do produto: " );
        nome = sc.nextLine();
        
        
        System.out.print("Insira a quantidade de produto adquirida : " );
        quantidade = sc.nextInt();
        
        
        System.out.print("Insira o preço por unidade: " );
        preco = sc.nextDouble();
        
        
        total = quantidade * preco;
        
        
        System.out.print("O total é: " + total );
        
        
        
        if (quantidade <= 5){
            
            desconto = 2 ;
         totalpagar = total - ((desconto *100) /total);
         
         
         System.out.print("\n O desconto é de: " + desconto + "%" );
         
         System.out.print("\n O total a pagar é: "+ totalpagar );
         
         
        } else if(quantidade > 5 && quantidade <= 10) {
            
            desconto = 3 ;
         totalpagar = total - ((desconto *100) /total);
         
         System.out.print("\n O desconto é de: " + desconto + "%" );
         
         System.out.print("\n O total a pagar é:" + totalpagar); 
         
         
         
          } else if(quantidade > 10 && quantidade < 30) {
            
            desconto = 5 ;
         totalpagar = total - ((desconto *100) /total);
         
         System.out.print("\n O desconto é de: " + desconto + "%" );
         
         System.out.print("\n O total a pagar é:" + totalpagar); 
         
         
         
            } else if(quantidade >=30) {
            
            desconto = 10 ;
         totalpagar = total - ((desconto *100) /total);
         
         System.out.print("\n O desconto é de: " + desconto + "%" );
         
         System.out.print("\n O total a pagar é:" + totalpagar); 
         
            sc.close();
    }
    
}
}
