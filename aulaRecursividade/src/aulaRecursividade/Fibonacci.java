package aulaRecursividade;

public class Fibonacci {

	public int fib(int n) {
		if (n < 2)
			return n;
		else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	
	public long fibIterativo(int n) {
		long[] fibs = new long[n+1];
		fibs[0] = 0;
		fibs[1] = 1;
		for (int i = 2; i < fibs.length; i++) {
			fibs[i] = fibs[i-1] + fibs[i-2];
		}
		return fibs[n-1];
	}
	
	

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fib(60));
	}
}
