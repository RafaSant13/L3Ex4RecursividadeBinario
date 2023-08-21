package controller;

public class BinarioControle {

	public BinarioControle() {
		super();
	}
	
	public String Binario(int N) {
		// Condi��o de parada -> Quando o valor dividido for igual a 0, pois � o valor final do c�lculo de bin�rio
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
			//A fun��o � chamada na soma com o resultado da divis�o, com a vari�vel N tendo sido dividida por 2
			sobra = Binario(N) + sobra;
			return sobra;
		}
	}

}
