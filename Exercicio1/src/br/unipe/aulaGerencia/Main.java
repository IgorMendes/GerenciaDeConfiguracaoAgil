package br.unipe.aulaGerencia;

public class Main {

	public static void main(String[] args) {
		
		Valores vector = new Valores();
		
		System.out.println(vector.ins(1));
		System.out.println(vector.ins(7));
		System.out.println(vector.ins(100));
		System.out.println(vector.ins(-15));
		System.out.println(vector.size());
		System.out.println(vector.del(1));
		System.out.println(vector.size());
	}

}
