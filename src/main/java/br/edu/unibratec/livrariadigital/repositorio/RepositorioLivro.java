package br.edu.unibratec.livrariadigital.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.edu.unibratec.livrariadigital.model.Livro;

public class RepositorioLivro implements IRepositorioLivro {


	List<Livro> Livros = new ArrayList<Livro>();

	public Livro create(Livro pLivro) {

		if (this.Livros.size() == 0) {

			pLivro.setId(1);
		} else {

			pLivro.setId(this.Livros.size() + 1);
		}

		this.Livros.add(pLivro);

		return pLivro;
	}

	public List<Livro> read() {
		return this.Livros;
	}

	public Livro update(Livro pLivro) {	
       
				this.Livros.remove(pLivro);

				this.Livros.add(pLivro);
		
		System.out.println("Livro atualizado com Sucesso!");

		return pLivro;
	}

	public Boolean delete(Livro pLivro) {
		for(int i = 0; i < Livros.size(); i++)
		{
			pLivro = Livros.get(i);

			if(pLivro.getId().equals(Livros))
			{        
				this.Livros.remove(pLivro);
				break;
			}
		}
		System.out.println("Livro deletado com Sucesso!");

		return true;
	}

	public Boolean livroExistente(Livro pLivro) {
		return this.Livros.contains(pLivro);
	}

	public List<Livro> readTitulo(String titulo) {
		List<Livro> livroTitulo = null;
		livroTitulo = new ArrayList<Livro>();
		for (Livro livro : this.Livros) {
			if (livro.getTitulo().equals(titulo)) {
				livroTitulo.add(livro);
			}
		}

		return livroTitulo;
	}

	public List<Livro> readAutor(String autor) {
		List<Livro> livroAutor = null;
		livroAutor = new ArrayList<Livro>();

		for (Livro livro : this.Livros) {
			if (livro.getAutor().equals(autor)) {
				livroAutor.add(livro);
			}
		}

		return livroAutor;
	}

	public List<Livro> readAno(Integer ano) {
		List<Livro> livroAno = null;
		livroAno = new ArrayList<Livro>();

		for (Livro livro : this.Livros) {
			if (livro.getAno().equals(ano)) {
				livroAno.add(livro);
			}
		}

		return livroAno;
	}

	public List<Livro> readId(Integer id) {
		List<Livro> livroId = null;
		livroId = new ArrayList<Livro>();

		for (Livro livro : this.Livros) {
			if (livro.getId().equals(id)) {
				livroId.add(livro);
			}
		}

		return livroId;
	}

	
}
