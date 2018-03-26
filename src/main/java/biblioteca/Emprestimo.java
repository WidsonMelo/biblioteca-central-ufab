package biblioteca;

public class Emprestimo {
	public String nomeAluno;
	public String matriculaAluno;
	public String nomeLivro;
	public String autorLivro;
	public Integer edicaoLivro;	

	public Emprestimo(Aluno aluno, Livro livro) {
		this.setNomeAluno(aluno.getNome());
		this.setMatriculaAluno(aluno.getMatricula());
		this.setNomeLivro(livro.getTitulo());
		this.setAutorLivro(livro.getAutor());
		this.setEdicaoLivro(livro.getEdicao());
		System.out.println("Contrutor-Emprestimo .. Emprestimo criado");
	}		

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}

	public Integer getEdicaoLivro() {
		return edicaoLivro;
	}

	public void setEdicaoLivro(Integer edicaoLivro) {
		this.edicaoLivro = edicaoLivro;
	}

}
