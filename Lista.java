package lista;

import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		VerduraLegumes intens = new VerduraLegumes();
		
		String item;
		System.out.println("Digite o item");
		while (true) {
			item = entrada.nextLine();
			intens.inserirItem(item);;
			if(item.toUpperCase().equals("SAIR")) {
				break;
			}
		}

		intens.listarItens();

		entrada.close();

	}

}
