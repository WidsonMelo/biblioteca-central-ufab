package biblioteca;

public class Start {

	public static void main(String[] args) {
		//Criando dois alunos, por�m o segundo n�o deve ser poss�vel, pois possui a mesma matr�cula
		CadastraAluno a1 = new CadastraAluno("Widson", "101010", true, false);
		CadastraAluno a2 = new CadastraAluno("Pablo", "1202020", true, false);
		CadastraAluno a3 = new CadastraAluno("George", "101010", false, true);
		System.out.println();
		
		
		
		
		//Criando dois livros diferentes
		CadastraLivro l1 = new CadastraLivro("Java como programar", "Bookman", "01", "Deitel", 8);
		CadastraLivro l2 = new CadastraLivro("Redes de Computadores", "Bookman", "02", "Tanebaum", 3);
		//Este livro deve ser criado, pois apesar de possuir a mesma descri��o, tem c�digo diferente		
		CadastraLivro l3 = new CadastraLivro("Redes de Computadores", "Bookman", "03", "Tanebaum", 3);
		
		
		
		
		//mostrando a rela��o de todos os alunos
		Biblioteca.mostraListaAlunos();
		
		//mostrando a rela��o de todos os livros
		Biblioteca.mostraListaLivros();
		
		
		
	}

}
