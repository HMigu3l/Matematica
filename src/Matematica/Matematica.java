 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Heidy Miguel
 */
public class Matematica 
{
    static Random ale = new Random();
    /**
     * @param args the command line arguments
     */
           @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
        int aleatorio1 = 1 + ale.nextInt( 12 );
        int aleatorio2 = 1 + ale.nextInt( 12 );
        Scanner input = new Scanner( System.in );
        
        
        System.out.printf("O que gostarias de estudar hoje?\n"
                 + "1 - multiplicacao\t 2 - adicao\n"
                 + "3 - subtracao\t 3 - divisao");
        System.out.println();
        
        switch( input.nextInt()  )
        {
            case 1:
            {
                Operacoes.multiplicacao( aleatorio1, aleatorio2 );
                break;
            }
            case 2:
            {
                Operacoes.adicao(aleatorio1, aleatorio2);
                break;
            }
            case 3:
            {
                Operacoes.subtracao(aleatorio1, aleatorio2);
                break;
            }
            case 4:
            {
                Operacoes.adicao(aleatorio1, aleatorio2);
                break;
            }
            default:
                        {
                            System.out.println("este numero nao faz parte das opcoes disponiveis");
                        }
        }
    } // fim do metodo main
} // fim da classe Matematica
