
public class Trab {
	
	private static void cocktail(int[] vetor)
	{
	    int tamanho, inicio, fim, swap, aux;
	    tamanho = 10; 
	    inicio = 0;
	    fim = tamanho - 1;
	    swap = 0;
	    
	    /*laço principal, será executado enquanto não houver mais trocas a serem realizadas 
	     * e o índice "início" for menor que o índice "fim". Garantindo que o algoritmo percorra 
	     * o vetor todo pelo menos uma vez.
	     */
	    while (swap == 0 && inicio < fim)
	    {
	    	
	    	/*laço for que percorre o vetor do índice "início" até o índice "fim" e verifica se
	    	 *  o elemento atual é maior que o próximo elemento. Se for, os elemento serão trocados 
	    	 *  e a variável "swap" é setada para 0, o que indica a ocorrência de uma troca. Depois desse 
	    	 *  laço o índice "fim" é subtraído em um.
	    	 */
	        swap = 1;
	        for (int i = inicio; i < fim; i = i + 1)
	        {
	            if (vetor[i] > vetor[i + 1])
	            {
	                aux = vetor[i];
	                vetor[i] = vetor[i + 1];
	                vetor[i + 1] = aux;
	                swap = 0;
	            }
	        }
	        fim = fim - 1;
	        
	        /*Segundo laço for, que percorre o vetor do índice "fim" até o índice "início" e verifica se o elemento
	         * atual é menor que o elemento anterior, se for o "swap" é setado em 0 e o índice "início" é incrementado em 1.
	         */
	        for (int i = fim; i > inicio; i = i - 1)
	        {
	            if (vetor[i] < vetor[i - 1])
	            {
	                aux = vetor[i];
	                vetor[i] = vetor[i - 1];
	                vetor[i - 1] = aux;
	                swap = 0;
	            }
	        }
	        inicio = inicio + 1;
	    }
	}
}
