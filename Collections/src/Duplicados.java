import java.util.HashSet;


public class Duplicados {
	
	public static void main(String[] args) {
		
		HashSet<String> nomesDistintos = new HashSet<String>();
		HashSet<String> nomesDuplicados = new HashSet<String>();
		
		for (int i = 0; i < args.length; i++) {
			if (!nomesDistintos.add(args[i])) {
				nomesDuplicados.add(args[i]);
			}				
		}
		nomesDistintos.removeAll(nomesDuplicados);
		
		System.out.println(nomesDistintos);
		System.out.println(nomesDuplicados);
	}

}
