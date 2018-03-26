package biblioteca;

public class Livro {
	public String titulo;
	public String editora;
	public String codigo;
	public String autor;
	public Integer edicao;
	public Boolean emprestado;
	

	public Livro(String titulo, String editora, String codigo, String autor, Integer edicao) { 
		this.setTitulo(titulo);
		this.setEditora(editora);
		this.setCodigo(codigo);
		this.setAutor(autor);		
		this.setEdicao(edicao);
		this.setEmprestado(false);
		Biblioteca.listaDeLivros.add(this);		
		System.out.println("Contrutor-Livro .. Livro criado");
	}
	
	public static void exibeLivroCompleto(Integer endereco) {
		System.out.println(Biblioteca.listaDeLivros.get(endereco).getTitulo());
		System.out.println(Biblioteca.listaDeLivros.get(endereco).getEditora());
		System.out.println(Biblioteca.listaDeLivros.get(endereco).getCodigo());
		System.out.println(Biblioteca.listaDeLivros.get(endereco).getEdicao());		
		
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

	public Boolean getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(Boolean emprestado) {
		this.emprestado = emprestado;
	}

	public Integer getEdicao() {
		return edicao;
	}

	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}	

}
