package biblioteca;

public class CadastraLivro {
	public String titulo;
	public String editora;
	public String codigo;
	public String autor;
	public Integer edicao;

	public CadastraLivro(String titulo, String editora, String codigo, String autor, Integer edicao) {
		this.setTitulo(titulo);
		this.setEditora(editora);
		this.setCodigo(codigo);
		this.setAutor(autor);
		this.setEdicao(edicao);
					

		if (CadastraLivro.verificaExistenciaDoLivro(this) == false){
			Livro livro = new Livro(this.getTitulo(), this.getEditora(), this.getCodigo(), this.getAutor(), this.getEdicao());
		}
	}
			
	
	private static Boolean verificaExistenciaDoLivro(CadastraLivro livro) {
		for (int i = 0; i < Biblioteca.listaDeLivros.size(); i++) {
			if (Biblioteca.listaDeLivros.get(i).getCodigo() == livro.getCodigo()) {
				System.out.println("O livro já existe com o código " + livro.getCodigo());
				return true;
			}
		}

		return false;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}

}
