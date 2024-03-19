
package exercicio2lista3;

import java.util.Scanner;


public class Exercicio2Lista3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double media;
       System.out.println("Informe a nota da primeira avaliação: ");
       nota1  = sc.nextDouble();
       
       System.out.println("Informe a nota da segunda avaliação: ");
       nota2  = sc.nextDouble();
       
       System.out.println("Informe a nota da terceira avaliação: ");
       nota3  = sc.nextDouble();
       
       media = (nota1 + nota2 + nota3)/3;
       
       if (media >= 7){
           System.out.println("Você foi aprovado! Sua média é: " + media);
       
       }else{
           
       System.out.println("Você foi reprovado, sua média é: " + media);
    }
    }
    
}
