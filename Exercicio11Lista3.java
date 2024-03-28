
package exercicio11lista3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercicio11Lista3 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char opcao = ' ';
        double saldo = 0;
        double deposito = 0;
        double saque = 0;
        boolean validar = true;
        List<String> extrato = new ArrayList<String>(); 
        extrato.add(" Saldo inicial: R$ "+ saldo);       

        while(validar){
        
        System.out.print("\nDigite uma opção(1-saldo, 2- extrato, 3-deposito, 4-saque, 5- sair): ");
        opcao = sc.next().charAt(0);
                
        
        switch (opcao) {
            case '1' : 
                System.out.print("\nSeu saldo atual é: " + saldo);
                break;
            case '2' : 
                   extrato.add(" saldo atual: "+ saldo);
                for(String string : extrato) {
                    System.out.println(string); } 
                break;
            case '3' :
                System.out.print("\nInforme o valor de depósito: ");
                deposito = sc.nextDouble();
                saldo += deposito;
                break;
            case '4' :
                System.out.print("\nInforme o valor de saque: ");
                saque = sc.nextDouble();
                saldo -= saque;
                break;
            case '5' :
                validar = false;
                break;
            default :
                System.out.print("\nOpção invalida!");
                validar = false;
                break;
    }
    
}
    }
}
