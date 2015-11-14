package aulaRecursividade;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
	
	public static void perm(List<Integer> solucao, List<Integer> elementos) {
		if (solucao.size() == elementos.size()) {
//			System.out.println(solucao);
		}
		else {
			for (Integer x : elementos) {
				if (valid(solucao, x)) {
					solucao.add(x);
					perm(solucao,elementos);
					solucao.remove(x);
				}
			}
		}
	}
	
	private static boolean valid(List<Integer> solucao, Integer x) {
		return !solucao.contains(x);
	}

	public static void main(String[] args) {
//		Recursividade.hanoi(64,"A","C","B");
//		System.out.println("Total de chamadas: " + Recursividade.i);
		double start = System.currentTimeMillis(); 
		Recursividade.perm(new ArrayList<>(), Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		double stop = System.currentTimeMillis();
		System.out.println((stop - start)/1000);
	}
}
