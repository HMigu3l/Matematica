/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;

/**
 *
 * @author heidy miguel
 */
public class MetodosSetEGet 
{
   
    
    private static int resultado;
    private static int adicao;
    private static int multiplicacao;
    private static int divisao;
    private static int subtracao;
    
    /* Metodo para afectuar a soma de dois dois numeros */
    static void adicao(int numero1, int numero2 )
    {
        adicao = numero1 + numero2;
    }
    
    /* metodo para retornar o resultado da adicao */
    static int retornarAdicao()
    {
        return adicao;
    }
    
    /* metodo para afectuar a multiplicacao dos dois numeros */
    static void multiplicacao( int numero1, int numero2 )
    {
        multiplicacao = numero1 * numero2;
    }
    
    /* metodo para retornar o resultado da multiplicao */
    static int retornarMultiplicacao()
            {
                return multiplicacao;
            }
    
    /* Metodo para afectuar a divisao dos dois numeros */
    static void divisao(int numero1, int numero2 )
    {
        divisao = numero1 / numero2;
    }
    
    /* metodo para retornar o resultado da divisao */
    static int retornarDivisao()
            {
                return divisao;
            }
    
    /* Metodo para afectuar a subtracao dois numeros */
    static void subtracao(int numero1, int numero2 )
    {
        subtracao = numero1 - numero2;
    }
    
    /* metodo para retornar o resultado da divisao */
    static int retornarSubtracao()
            {
                return subtracao;
            }
}
