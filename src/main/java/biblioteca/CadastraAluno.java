package biblioteca;

public class CadastraAluno {
	public String nome;
	public String matricula;
	public Boolean graduacao;
	public Boolean posGraduacao;

	public CadastraAluno(String nome, String matricula, Boolean graduacao, Boolean posGraduacao) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setGraduacao(graduacao);
		this.setPosGraduacao(posGraduacao);			

		if (CadastraAluno.verificaCategoriaDoAluno(this) == true
				&& CadastraAluno.verificaExistenciaDoAluno(this) == false) {
			Aluno aluno = new Aluno(this.getNome(), this.getMatricula(), this.graduacao, this.getPosGraduacao());			
		}
	}

	private static Boolean verificaExistenciaDoAluno(CadastraAluno aluno) {
		for (int i = 0; i < Biblioteca.listaDeAlunos.size(); i++) {
			if (Biblioteca.listaDeAlunos.get(i).getMatricula() == aluno.getMatricula()) {
				System.out.println("O aluno já existe com a matricula " + aluno.getMatricula());
				return true;
			}
		}

		return false;

	}

	private static Boolean verificaCategoriaDoAluno(CadastraAluno aluno) {
		if ((aluno.getGraduacao() == false) && (aluno.getPosGraduacao() == false)) {
			System.out.println("O aluno deve ser GRADUANDO ou PÓS-GRADUANDO");
			return false;
		} else {
			if ((aluno.getGraduacao() == true) && (aluno.getPosGraduacao() == true)) {
				System.out.println("O aluno não pode ser GRADUANDO PÓS-GRADUANDO ao mesmo tempo");
				return false;
			} else {
				if ((aluno.getGraduacao() == true) && (aluno.getPosGraduacao() == false)) {
					System.out.println("O aluno foi classificado como GRADUADO");
					return true;
				} else {
					System.out.println("O aluno foi classificado como PÓS-GRADUADO");
					return true;					
				}
				
			}			
		}

	}

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
