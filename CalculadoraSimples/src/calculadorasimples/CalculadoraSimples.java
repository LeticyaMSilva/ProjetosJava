/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasimples;

import java.util.Scanner;

/**
 *
 * @author Letic
 */
public class CalculadoraSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        double valorA,valorB,resultado;
        char operacao;
        
        System.out.print("Digite o primeiro: ");
        valorA = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        valorB = sc.nextDouble();
        
        System.out.println("Escolha a operação");
        System.out.println("Soma digite +");
        System.out.println("Subtração digite -");
        System.out.println("Multiplicação digite *");
        System.out.println("Divisão digite /");
        operacao =  sc.next().charAt(0);
        
        switch (operacao){
            case '+' :
                resultado = valorA + valorB;
                System.out.print("O resultado é: " + resultado);  
                break;
        
             case '-' :
                resultado = valorA - valorB;
                System.out.print("O resultado é: " + resultado);  
                break;
                
             case '*' :
                resultado = valorA * valorB;
                System.out.print("O resultado é: " + resultado);  
                break;   
             
              case '/' :
                resultado = valorA / valorB;
                System.out.print("O resultado é: " + resultado);  
                break;   
        }
    }
    
}
