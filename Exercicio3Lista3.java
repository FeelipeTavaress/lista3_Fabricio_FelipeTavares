
package exercicio3lista3;

import java.util.Scanner;


public class Exercicio3Lista3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double eleitores;
        double branco;
        double nulo;
        double valido;
        double porcentagemBrancos;
        double porcentagemNulos;
        double porcentagemValidos;
        double resto;

        
        
        System.out.println("Informe o número total de eleitores: ");
         eleitores  = sc.nextInt();
        System.out.println("Informe a quantidade de votos em branco: ");
         branco  = sc.nextInt();
        System.out.println("Informe a quantidade de votos nulos: ");
         nulo  = sc.nextInt();
        System.out.println("Informe a quantidade de votos válidos: ");
         valido  = sc.nextInt();
         
         porcentagemBrancos = (branco * 100)/ eleitores;
         porcentagemNulos = (nulo * 100)/eleitores;
          porcentagemValidos = (valido * 100)/ eleitores;
          resto = eleitores - (porcentagemBrancos + porcentagemNulos + porcentagemValidos );
          
         if (porcentagemBrancos + porcentagemNulos + porcentagemValidos != eleitores){
         System.out.println("a porcentagem de votos em branco é: "+ porcentagemBrancos+ "%");
          System.out.println("a porcentagem de votos nulos é: " + porcentagemNulos+ "%");
          System.out.println("a porcentagem de votos validos é: "+ porcentagemValidos+ "%");
          System.out.println("Os eleitores que não votarem foram: "+ resto + "%");
          
          } else {
             System.out.println("a porcentagem de votos em branco é: "+ porcentagemBrancos+ "%");
          System.out.println("a porcentagem de votos nulos é: " + porcentagemNulos+ "%");
          System.out.println("a porcentagem de votos validos é: "+ porcentagemValidos+ "%");
          
          
         
          
          }
        
        
        
        
        
        
        
        
        
        sc.close();
    }
    
}
