
package exercicio10lista3;

import java.util.Scanner;


public class Exercicio10Lista3 {

 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         double valor;
         double valorVenda;
         
         System.out.println(" LOJINHA DO SR. ABOO ");
         
         System.out.println("Informe qual o valor da compra com o fornecedor: ");
         valor = sc.nextDouble();
         
         
         if (valor < 10 ){
             
             valorVenda = ((valor /100)* 70)+ valor;
             
             System.out.println("Porcentagem de lucro de 70% ");
             
              System.out.println("Valor que o produto deve ser colocado a venda: "+ valorVenda);
              
         } else if (valor>= 10 && valor < 30){
             
             valorVenda = ((valor /100)* 50)+ valor;
             
             System.out.println("Porcentagem de lucro de 50% ");
             
              System.out.println("Valor que o produto deve ser colocado a venda: "+ valorVenda);
              
         } else if (valor >= 30 && valor < 50 ){
             
             valorVenda = ((valor /100)* 40)+ valor;
             
             System.out.println("Porcentagem de lucro de 40% ");
             
              System.out.println("Valor que o produto deve ser colocado a venda: "+ valorVenda);
              
        
         } else if (valor >= 50 ) {
             valorVenda = ((valor /100)* 30)+ valor;
             
             System.out.println("Porcentagem de lucro de 30% ");
             
              System.out.println("Valor que o produto deve ser colocado a venda: "+ valorVenda);
             
         }
    }
    
}
