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
			System.out.println(solucao);
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
	
	//questão 1 da lista
	public static int soma(int[] array) {
//		return somaRecursiva(array, array.length);
		return somaRecursiva2(array, 0, array.length -1);
	}

	private static int somaRecursiva(int[] array, int i) {
		if (i == 1)
			return array[0];
		return array[i-1] + somaRecursiva(array, i-1);
	}
	
	private static int somaRecursiva2(int[] array, int l, int r) {
		if (r == l)
			return array[r]; 
		int m = (r + l) / 2;
		return somaRecursiva2(array, l, m) + somaRecursiva2(array, m+1, r);
	}

	public static void main(String[] args) {
		System.out.println(Recursividade.soma(new int[] {1,2,4,5,6,7}));
	}
}
