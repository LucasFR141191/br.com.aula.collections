package br.com.aula.collections.mvc.arraylist;

import java.util.List;

public class AulaArrayList {

	public static void main(String[] args) {
		//criando um ArrayList de nomes
		List<String> nomes = new java.util.ArrayList<>();
		//cadastrar nomes:
	nomes.add("Alice");
	nomes.add("Bianca");
	nomes.add("Caio");
	nomes.add("Dênis");
	nomes.add("Ellen");
	//exibir a quantidades de nomes cadastrados
	System.out.println(nomes.size());
	for (String nome:nomes) {
		System.out.println(nome);
	}

	System.out.println();
	//Altera o nome 
	nomes.set(0, null);
	//remover o quinto nome no ArrayList (Ellen)
	nomes.remove(0);
	//excluir todos os nomes
	nomes.clear();
	//for index
		for (int indice=0; indice<nomes.size();indice++){
			System.out.println(nomes.get(indice));
		}
	}
			
	}

