package lista;

import java.util.ArrayList;

public class VerduraLegumes extends Produtos implements Itens{

	private String nome;
	
	ArrayList<String> listaVerdursLegumes = new ArrayList<>();

	VerduraLegumes(){}
	
	VerduraLegumes(String nome){
		this.nome = nome;
	}
	
	@Override
	public void inserirItem(String nome) {
		this.nome = nome;
		listaVerdursLegumes.add(nome);
	}
	
	@Override
	public void listarItens() {
		listaVerdursLegumes.remove(listaVerdursLegumes.size()-1);
		for (int i = 0; i < listaVerdursLegumes.size(); i++) {
			System.out.println(listaVerdursLegumes.get(i));
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
