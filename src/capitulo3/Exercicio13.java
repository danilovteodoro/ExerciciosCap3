/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo3;

/**
 *
 * @author danilo_vieira
 */
public class Exercicio13 {
    
    public static void main(String[] args) {
        
        System.out.println("Impreime todos os números de 150 a 300 : ");
        
        for (int i = 150; i <= 300; i++) {
            System.out.println(i);            
        }
        System.out.println("--------------");
        
        System.out.println("Impreme todos os números de 1 a 1000");
        
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
            
        }
        
        System.out.println("--------------");
        
        System.out.println("Imprime todos os números múltiplos de 3 entre 1 e 100");
        for (int i = 1; i < 100; i++) {
            if (i%3==0) {
                System.out.println(i);                
            }
            
        }
        System.out.println("--------------");
        
        System.out.println("Imprime o fatorial de 1 até 10.");
        int fatorial=1;
        for (int i = 1; i <= 10; i++) {
            fatorial *=i;
            System.out.println("Fatorial de "+i+" = "+fatorial);
            
        }
        
        System.out.println("--------------"); 
        
        System.out.println("Imprime a série Fibonacci.");
        int valor=0;
        int valorAnterior=0;
        int aux;
        
        while (valor<100) {
            
            
            if (valor==0) {
                System.out.println(valor);
                valor=1;
                
            }else{
                aux=valor;
                valor+=valorAnterior;
                valorAnterior=aux;
                System.out.println(valor);
                
            }
                                    
        }
        
    }
    
}
