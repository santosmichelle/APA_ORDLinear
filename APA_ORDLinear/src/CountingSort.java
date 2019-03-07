
public class CountingSort {

	public void Counting(int entrada[])  {

		int maior = entrada[0];

		for (int i=1; i< entrada.length; i++) {
			if(entrada[i] > maior) {
				maior = entrada[i];
			}
		}

		//cria um array para contagem do tamanho do maior elemento
		int contagem[] = new int[maior] ;

		// Faz a contagem de elementos e guarda no array de contagem */
		for (int i = 0; i < entrada.length; i++)
			contagem[ entrada[i] - 1 ]++;

		for (int i = 1; i < contagem.length; ++i)
			contagem[i] += contagem[i - 1];

		//ordenando no array 
		int ordenado[] = new int[entrada.length];
		for (int i = 0; i < ordenado.length; i++) {
			ordenado[contagem[entrada[i]] - 1] = entrada[i];
			contagem[entrada[i] - 1]--;

			//copia pro array original
			for (int j = 0; j < ordenado.length; j++) {
				entrada[i] = ordenado[i];
				System.out.println(entrada[j]);

			}


		}
	}
}