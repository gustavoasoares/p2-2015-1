package aulaRecursividade;

import java.math.BigInteger;

public class Recursividade {

	public static BigInteger fat(int n) {
		if (n == 0) return BigInteger.valueOf(1);
		return BigInteger.valueOf(n).multiply(fat(n-1));
	}
	
	public static BigInteger fatIterativo(int n) {
		BigInteger result = BigInteger.valueOf(1);
		while (n > 0) {
			result = result.multiply(BigInteger.valueOf(n));
			n--;
		}
		return result;
	}
	
	static int i; 
	
	public static  void hanoi(int n, String origem, String destino, String aux) {
		if (n == 1) {
			System.out.println("Move disco de " + origem + " para " + destino);
			i++;
		} else {
			hanoi(n-1, origem, aux, destino);
			System.out.println("Move disco de " + origem + " para " + destino);
			i++;
			hanoi(n-1, aux, destino, origem);
			
		}
	}
	
	public static void main(String[] args) {
		Recursividade.hanoi(64,"A","C","B");
		System.out.println("Total de chamadas: " + Recursividade.i);
	}
}
