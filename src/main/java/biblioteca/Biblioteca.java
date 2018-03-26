package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	public static ArrayList<Livro> listaDeLivros = new ArrayList<Livro>();
	public static ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

	public static void mostraListaAlunos() {
		for (int i = 0; i < listaDeAlunos.size(); i++) {
			System.out.println(listaDeAlunos.get(i).getNome());			
		}

	}

	public static void mostraListaLivros() {
		for (int i = 0; i < listaDeLivros.size(); i++) {
			System.out.println(listaDeLivros.get(i).getTitulo());
		}

	}

}
