import java.util.HashMap;
import java.util.Map.Entry;


public class FrequenciaDeNomes {

	public static void main(String[] args) {
		
		HashMap<String, Integer> frequenciaDeNomes = new HashMap<String, Integer>();
		
		for (int i = 0; i < args.length; i++) {
			String nome = args[i];
			Integer frequenciaAnterior = frequenciaDeNomes.get(nome);
			frequenciaDeNomes.put(nome, (frequenciaAnterior == null? 1 : frequenciaAnterior + 1));
		}
		
		System.out.println(frequenciaDeNomes);
		
		for (Entry<String, Integer> entrada : frequenciaDeNomes.entrySet()) {
			System.out.println("Nome: " + entrada.getKey());
			System.out.println("Frequencia: " + entrada.getValue());
			System.out.println("==================================");
		}
		
		System.out.println(frequenciaDeNomes.keySet());
		System.out.println(frequenciaDeNomes.values());
		System.out.println(frequenciaDeNomes.entrySet());
	}
}
