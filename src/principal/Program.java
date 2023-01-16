package principal;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1, "Leo", "leo@gmail.com");
		Pessoa p2 = new Pessoa(2, "Leticia", "leticia@yahoo.com");
		Pessoa p3 = new Pessoa(3, "Juan", "juan@gmail.com.br");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
