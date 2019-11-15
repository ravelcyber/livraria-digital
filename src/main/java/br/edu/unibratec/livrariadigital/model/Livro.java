package br.edu.unibratec.livrariadigital.model;


public class Livro extends Produto {

	private String autor;
   
	
	public Livro(String titulo, String editora, Integer ano, Tipo tipo, String autor) {
		super(titulo, editora, ano, tipo);
		this.autor = autor;
		
	}

	public Livro() {
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Produto [id=" + getId() + ", titulo=" + getTitulo() + " autor= " + getAutor() + ", editora=" + getEditora() + ", ano=" + getAno() + ", tipo=" + getTipo()
				+ "]";
	}
	
}
