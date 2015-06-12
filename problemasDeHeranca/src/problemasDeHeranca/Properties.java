package problemasDeHeranca;

import java.util.HashMap;

public class Properties extends HashMap<Object, Object>{

	public void setProperty(String name, String value) {
		put(name,value);
	}
	
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("teste", "isso é um teste");
		properties.put(2, "outro teste");
		
	}

}
