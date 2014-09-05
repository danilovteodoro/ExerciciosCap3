/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo3;

/**
 *
 * @author danilo_vieira
 */
public class BalancoTrimestral {
    
    public static void main(String[] args) {
        //cria as variáveis para receber os valores dos gastos.
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;
        
        //variável que recebe o gasto trimestral.
        int gastosTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
        //imprime o gasto trimestral.
        System.out.println(gastosTrimestre);
        
        //variável que recebe a média mensal.
        int mediaMesal=gastosTrimestre/3;
        
        //imprime o valor da média mensal.
        System.out.println("média mensal = "+mediaMesal);
    }
    
}
