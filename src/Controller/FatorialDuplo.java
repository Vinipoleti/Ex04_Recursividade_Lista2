package Controller;

public class FatorialDuplo {

	public FatorialDuplo() {
		super ();
	}
	
	public int FatDuplo (int N) {
		if (N==1) { // condição de parada, tendo um resultado conhecido - 1!=1
			return 1;
		} else {
			return N*FatDuplo(N-2); // entra um número ímpar, e subtraindo 2, pegando assim apenas os ímpares
		}
	}

}
