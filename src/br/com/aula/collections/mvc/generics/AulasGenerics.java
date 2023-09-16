package br.com.aula.collections.mvc.generics;

public class AulasGenerics {

	public static void main(String[] args) {
		Integer[] idades = { 18, 22, 31, 27, 17 };
		Double[] alturas = { 1.50, 1.77, 1.64, 1.80 };
		String[] nomes = { "Vanessa", "Rubens", "Larrisa", "Gabriel", "Paloma" };
		
		exibir(idades);
		exibir(alturas);
		exibir(nomes);
	}

	// Métodos para listar osdaods dos Arrays
	public static <E> void exibir(E[] vetores) {
		for (E elemento : vetores) {
			System.out.println(elemento);
		}

	}

}
