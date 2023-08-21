package controller;

public class BinarioControle {

	public BinarioControle() {
		super();
	}
	
	public String Binario(int N) {
		// Condição de parada -> Quando o valor dividido for igual a 0, pois é o valor final do cálculo de binário
		if (N == 0)
		{
			return "";
		}
		else
		{
			String sobra;
			if (N % 2 > 0)
			{
				sobra = "1";
			}
			else
			{
				sobra = "0";
			}
			N = N/2;
			//A função é chamada na soma com o resultado da divisão, com a variável N tendo sido dividida por 2
			sobra = Binario(N) + sobra;
			return sobra;
		}
	}

}
