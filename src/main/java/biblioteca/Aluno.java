package biblioteca;

public class Aluno {
	public String nome;
	public String matricula;
	public Boolean graduacao;
	public Boolean posGraduacao;

	public Aluno(String nome, String matricula, Boolean graduacao, Boolean posGraduacao) {		
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setGraduacao(graduacao);
		this.setPosGraduacao(posGraduacao);		
		Biblioteca.listaDeAlunos.add(this);
		System.out.println("Contrutor-Aluno .. Aluno criado");
	}

//	public void defineCategoria() {
//		if ((this.getGraduacao() == false) && (this.getPosGraduacao() == false)) {
//			System.out.println("O aluno precisa ser classificado como GRADUANDO ou P�S-GRADUANDO");				
//		} else {
//			if (this.getGraduacao()) {				
//				this.setPosGraduacao(false);
//				System.out.println("O aluno est� classificado na GRADUA��O");				
//			} else {				
//				this.setPosGraduacao(true);
//				System.out.println("O aluno est� classificado na P�S-GRADUA��O");			
//			}
//
//		}
//
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Boolean getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(Boolean graduacao) {
		this.graduacao = graduacao;
	}

	public Boolean getPosGraduacao() {
		return posGraduacao;
	}

	public void setPosGraduacao(Boolean posGraduacao) {
		this.posGraduacao = posGraduacao;
	}

}
