package br.com.aula.collections.mvc.hashmap;

import java.util.HashMap;

public class AulaHashMap {
	
	public static void nain(String[]args) {
		
		HashMap<String,String> estados = new HashMap<String,String>();
		estados.put("Santa Catarina", "Florianópolis");
		estados.put("Paraná", "Curitiba");
		estados.put("Minas Gerais","Belo Horizont");
		estados.put("Pará","Belém");
		//Exibindo o valor do HashMap
		System.out.println(estados);
		
		//Exibindo o valor Florinópolis
		System.out.println(estados.get("Santa Catarina"));
		//removendo o elemento onde achave soja Paraná
		estados.remove ("Paraná");
		System.out.println(estados);
	}
	
		
	}

