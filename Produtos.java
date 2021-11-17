package lista;

public abstract class Produtos {
	
	private String nome;
	
	Produtos(){}
	
	Produtos(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
