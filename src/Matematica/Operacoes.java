/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;
import java.util.Scanner;
/**
 *
 * @author windows eight
 */
public class Operacoes 
{
    static int respostaDoUsuario; // resposta inserida pelo usuario
    
    
    
    static void multiplicacao(int aleatorio1, int aleatorio2 )
            {
                Scanner input = new Scanner( System.in );
                    
                Perguntas.perguntaDeMultiplicacao( aleatorio1, aleatorio2 ); /* fazer a pergunta com os numeros aleatorio gerados */
                respostaDoUsuario = input.nextInt(); 
                MetodosSetEGet.multiplicacao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                    
                    
                while ( respostaDoUsuario != MetodosSetEGet.retornarMultiplicacao()  ) // enquanto respostaDoUsuario não estiver correta...
                    {
                        System.out.println("Errado! Tenta novamente\n"); // imprime "errado"
                        respostaDoUsuario = input.nextInt(); // dá outra oportunidade para inserir a resposta correta
                        
                        while( respostaDoUsuario == MetodosSetEGet.retornarMultiplicacao() ) // enquanto a respostaDoUsuario estiver correta...
			{
                            System.out.println("Parabéns! Você acertou!");
                            System.out.println();
                            
                            aleatorio1 = 1 + Matematica.ale.nextInt( 12 ); /* acessa a vareavel aleatorio da class main */
                            aleatorio2 = 1 + Matematica.ale.nextInt( 12 ); /*   ||   ||    ||       ||    ||   ||   ||  */
                            
                            Perguntas.perguntaDeMultiplicacao( aleatorio1, aleatorio2 ); /* nova pergunta */
                            respostaDoUsuario = input.nextInt();
                            MetodosSetEGet.multiplicacao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                            
                            while (  respostaDoUsuario !=  MetodosSetEGet.retornarMultiplicacao() ) /* enquanto a respostaDoUsuario estiver correta */
                                {
                                    System.out.println("Errado! Tenta novamente\n");
                                    respostaDoUsuario = input.nextInt();
				}			
			}	
		}
                    
                    while (  (respostaDoUsuario == MetodosSetEGet.retornarMultiplicacao() ) ) 
		{
			System.out.println("parabens vc acertou"); // imprime "errado"
                        System.out.println();
                        
                        aleatorio1 = 1 + Matematica.ale.nextInt( 12 );
                        aleatorio2 = 1 + Matematica.ale.nextInt( 12 );
                        
                        Perguntas.perguntaDeMultiplicacao( aleatorio1, aleatorio2 ); /* nova pergunta */
                        respostaDoUsuario = input.nextInt();
                        MetodosSetEGet.multiplicacao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                        
                        while( respostaDoUsuario != MetodosSetEGet.retornarMultiplicacao() ) /* enquanto a resposta estiver correta */
                            {
                                System.out.println("Parabéns! Você acertou!");
                                System.out.println();
			
			
			aleatorio1 = 1 + Matematica.ale.nextInt( 12 );
                        aleatorio2 = 1 + Matematica.ale.nextInt( 12 );
                        
                        Perguntas.perguntaDeMultiplicacao( aleatorio1, aleatorio2 ); /* nova pergunta */
                        respostaDoUsuario = input.nextInt();
                        MetodosSetEGet.multiplicacao( aleatorio1, aleatorio2 );
			
			while ( ( respostaDoUsuario !=  MetodosSetEGet.retornarMultiplicacao() ) )
                            {
				System.out.println("Errado! Tenta novamente\n");
				respostaDoUsuario = input.nextInt();
                            }
                            }
                        }
           }
    
    static void adicao( int aleatorio1, int aleatorio2 )
    {
                Scanner input = new Scanner( System.in );
                    
                Perguntas.perguntaDeAdicao( aleatorio1, aleatorio2 ); /* fazer a pergunta com os numeros aleatorio gerados */
                respostaDoUsuario = input.nextInt(); 
                MetodosSetEGet.adicao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                    
                    
                while ( respostaDoUsuario != MetodosSetEGet.retornarAdicao()  ) // enquanto respostaDoUsuario não estiver correta...
                    {
                        System.out.println("Errado! Tenta novamente\n"); // imprime "errado"
                        respostaDoUsuario = input.nextInt(); // dá outra oportunidade para inserir a resposta correta
                        
                        while( respostaDoUsuario == MetodosSetEGet.retornarAdicao() ) // enquanto a respostaDoUsuario estiver correta...
			{
                            System.out.println("Parabéns! Você acertou!");
                            System.out.println();
                            
                            aleatorio1 = 1 + Matematica.ale.nextInt( 12 ); /* acessa a vareavel aleatorio da class main */
                            aleatorio2 = 1 + Matematica.ale.nextInt( 12 ); /*   ||   ||    ||       ||    ||   ||   ||  */
                            
                            Perguntas.perguntaDeAdicao( aleatorio1, aleatorio2 ); /* nova pergunta */
                            respostaDoUsuario = input.nextInt();
                            MetodosSetEGet.adicao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                            
                            while (  respostaDoUsuario !=  MetodosSetEGet.retornarAdicao() ) /* enquanto a respostaDoUsuario estiver correta */
                                {
                                    System.out.println("Errado! Tenta novamente\n");
                                    respostaDoUsuario = input.nextInt();
				}			
			}	
		}
                    
                    while (  (respostaDoUsuario == MetodosSetEGet.retornarAdicao() ) ) 
		{
			System.out.println("parabens vc acertou"); // imprime "errado"
                        System.out.println();
                        
                        aleatorio1 = 1 + Matematica.ale.nextInt( 12 );
                        aleatorio2 = 1 + Matematica.ale.nextInt( 12 );
                        
                        Perguntas.perguntaDeAdicao( aleatorio1, aleatorio2 ); /* nova pergunta */
                        respostaDoUsuario = input.nextInt();
                        MetodosSetEGet.adicao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                        
                        while( respostaDoUsuario != MetodosSetEGet.retornarAdicao() ) /* enquanto a resposta estiver correta */
                            {
                                System.out.println("Parabéns! Você acertou\n!");
                                System.out.println();
			
			
			aleatorio1 = 1 + Matematica.ale.nextInt( 12 );
                        aleatorio2 = 1 + Matematica.ale.nextInt( 12 );
                        
                        Perguntas.perguntaDeAdicao( aleatorio1, aleatorio2 ); /* nova pergunta */
                        respostaDoUsuario = input.nextInt();
                        MetodosSetEGet.adicao( aleatorio1, aleatorio2 );
			
			while ( ( respostaDoUsuario !=  MetodosSetEGet.retornarAdicao() ) )
                            {
				System.out.println("Errado! Tenta novamente\n");
				respostaDoUsuario = input.nextInt();
                            }
                            }
                        }
    }
    
    static void subtracao( int aleatorio1, int aleatorio2 )
    {
        Scanner input = new Scanner( System.in );
                    
                Perguntas.perguntaDeSubtracao( aleatorio1, aleatorio2 ); /* fazer a pergunta com os numeros aleatorio gerados */
                respostaDoUsuario = input.nextInt(); 
                MetodosSetEGet.subtracao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                    
                    
                while ( respostaDoUsuario != MetodosSetEGet.retornarSubtracao()  ) // enquanto respostaDoUsuario não estiver correta...
                    {
                        System.out.println("Errado! Tenta novamente\n"); // imprime "errado"
                        respostaDoUsuario = input.nextInt(); // dá outra oportunidade para inserir a resposta correta
                        
                        while( respostaDoUsuario == MetodosSetEGet.retornarSubtracao() ) // enquanto a respostaDoUsuario estiver correta...
			{
                            System.out.println("Parabéns! Você acertou!");
                            System.out.println();
                            
                            aleatorio1 = 1 + Matematica.ale.nextInt( 12 ); /* acessa a vareavel aleatorio da class main */
                            aleatorio2 = 1 + Matematica.ale.nextInt( 12 ); /*   ||   ||    ||       ||    ||   ||   ||  */
                            
                            Perguntas.perguntaDeSubtracao( aleatorio1, aleatorio2 ); /* nova pergunta */
                            respostaDoUsuario = input.nextInt();
                            MetodosSetEGet.subtracao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                            
                            while (  respostaDoUsuario !=  MetodosSetEGet.retornarSubtracao() ) /* enquanto a respostaDoUsuario estiver correta */
                                {
                                    System.out.println("Errado! Tenta novamente\n");
                                    respostaDoUsuario = input.nextInt();
				}			
			}	
		}
                    
                    while (  (respostaDoUsuario == MetodosSetEGet.retornarSubtracao() ) ) 
		{
			System.out.println("parabens vc acertou"); // imprime "errado"
                        System.out.println();
                        
                        aleatorio1 = 1 + Matematica.ale.nextInt( 12 );
                        aleatorio2 = 1 + Matematica.ale.nextInt( 12 );
                        
                        Perguntas.perguntaDeSubtracao( aleatorio1, aleatorio2 ); /* nova pergunta */
                        respostaDoUsuario = input.nextInt();
                        MetodosSetEGet.subtracao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                        
                        while( respostaDoUsuario != MetodosSetEGet.retornarSubtracao() ) /* enquanto a resposta estiver correta */
                            {
                                System.out.println("Parabéns! Você acertou!");
                                System.out.println();
			
			
			aleatorio1 = 1 + Matematica.ale.nextInt( 12 );
                        aleatorio2 = 1 + Matematica.ale.nextInt( 12 );
                        
                        Perguntas.perguntaDeSubtracao( aleatorio1, aleatorio2 ); /* nova pergunta */
                        respostaDoUsuario = input.nextInt();
                        MetodosSetEGet.subtracao( aleatorio1, aleatorio2 );
			
			while ( ( respostaDoUsuario !=  MetodosSetEGet.retornarSubtracao() ) )
                            {
				System.out.println("Errado! Tenta novamente\n");
				respostaDoUsuario = input.nextInt();
                            }
                            }
                        }
    }
    
    static void divisao( int aleatorio1, int aleatorio2 )
    {
        Scanner input = new Scanner( System.in );
                    
                Perguntas.perguntaDeDivisao( aleatorio1, aleatorio2 ); /* fazer a pergunta com os numeros aleatorio gerados */
                respostaDoUsuario = input.nextInt(); 
                MetodosSetEGet.divisao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                    
                    
                while ( respostaDoUsuario != MetodosSetEGet.retornarDivisao()  ) // enquanto respostaDoUsuario não estiver correta...
                    {
                        System.out.println("Errado! Tenta novamente\n"); // imprime "errado"
                        respostaDoUsuario = input.nextInt(); // dá outra oportunidade para inserir a resposta correta
                        
                        while( respostaDoUsuario == MetodosSetEGet.retornarDivisao() ) // enquanto a respostaDoUsuario estiver correta...
			{
                            System.out.println("Parabéns! Você acertou!");
                            System.out.println();
                            
                            aleatorio1 = 1 + Matematica.ale.nextInt( 12 ); /* acessa a vareavel aleatorio da class main */
                            aleatorio2 = 1 + Matematica.ale.nextInt( 12 ); /*   ||   ||    ||       ||    ||   ||   ||  */
                            
                            Perguntas.perguntaDeDivisao( aleatorio1, aleatorio2 ); /* nova pergunta */
                            respostaDoUsuario = input.nextInt();
                            MetodosSetEGet.divisao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                            
                            while (  respostaDoUsuario !=  MetodosSetEGet.retornarDivisao() ) /* enquanto a respostaDoUsuario estiver correta */
                                {
                                    System.out.println("Errado! Tenta novamente\n");
                                    respostaDoUsuario = input.nextInt();
				}			
			}	
		}
                    
                    while (  (respostaDoUsuario == MetodosSetEGet.retornarDivisao() ) ) 
		{
			System.out.println("parabens vc acertou"); // imprime "errado"
                        System.out.println();
                        
                        aleatorio1 = 1 + Matematica.ale.nextInt( 12 );
                        aleatorio2 = 1 + Matematica.ale.nextInt( 12 );
                        
                        Perguntas.perguntaDeDivisao( aleatorio1, aleatorio2 ); /* nova pergunta */
                        respostaDoUsuario = input.nextInt();
                        MetodosSetEGet.divisao( aleatorio1, aleatorio2 ); /* multiplicar os numeros aleatorios */
                        
                        while( respostaDoUsuario != MetodosSetEGet.retornarDivisao() ) /* enquanto a resposta estiver correta */
                            {
                                System.out.println("Parabéns! Você acertou!\n");
                                System.out.println();
			
			
			aleatorio1 = 1 + Matematica.ale.nextInt( 12 );
                        aleatorio2 = 1 + Matematica.ale.nextInt( 12 );
                        
                        Perguntas.perguntaDeDivisao( aleatorio1, aleatorio2 ); /* nova pergunta */
                        respostaDoUsuario = input.nextInt();
                        MetodosSetEGet.subtracao( aleatorio1, aleatorio2 );
			
			while ( ( respostaDoUsuario !=  MetodosSetEGet.retornarDivisao() ) )
                            {
				System.out.println("Errado! Tenta novamente\n");
				respostaDoUsuario = input.nextInt();
                            }
                            }
                        }
    }
}