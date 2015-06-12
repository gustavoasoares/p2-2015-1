package aulaComposicao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente implements Autenticavel, Comparable<Cliente>{

	private String name; 
	
	public String getName() {return name;}
	
	public Cliente(String name) {
		this.name = name;
	}
	
	@Override
	public void autentica(String senha) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(new Cliente("Sergio"));
		clientes.add(new Cliente("David"));
		clientes.add(new Cliente("Matheus"));
		Collections.sort(clientes);
		
		System.out.println(clientes);
	}

	@Override
	public int compareTo(Cliente outro) {
		return this.name.compareTo(outro.getName());
	}

}
