package br.com.generation.aula06.correcao;

public class ImprimirAnimal {

	public static void main(String[] args) {
		
		TestaAnimal t1 = new TestaAnimal();
		
		t1.somAnimal(new Cachorro());
		t1.somAnimal(new Cavalo());
		t1.correr(new Cachorro());
		t1.correr(new Cavalo());
		
	}
}