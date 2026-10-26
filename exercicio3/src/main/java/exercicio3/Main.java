package exercicio3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Livro l1 = new Livro();
		CD cd = new CD();
		
		System.out.println("Digite o nome do livro");
		l1.setNome(scanner.nextLine());
		System.out.println("Digite o preco do livro");
		l1.setPreco(scanner.nextDouble());
		System.out.println("Digite o nome do autor");
		scanner.next();
		l1.setAutor(scanner.nextLine());
		
		System.out.println("Digite o nome do CD");
		cd.setNome(scanner.nextLine());
		System.out.println("Digite o preco do CD");
		cd.setPreco(scanner.nextDouble());
		System.out.println("Digite o numero de faixas");
		cd.setNumFaixas(scanner.nextInt());
		
		System.out.println(cd.exibeInformacoes());
	}

}
