package ex2;

import java.util.ArrayList;
import java.util.List;

public class principalex2 {

	public static void main(String[] args) {
		Livro livro11 = new Livro ("Harry potter", 40, 50, "J. K . Rowling", "fantasia", 300);
		Livro livro12 = new Livro ("Senhor dos aneis", 60, 30, "J. R. R.Tolkien", "fantasia", 500);
		Livro livro13 = new Livro ("Java POO", 20, 50, "GFT", "educativo", 500);
		
		List<Livro> livros = new ArrayList<>();
	
		livros.add(livro11);
		livros.add(livro12);
		livros.add(livro13);
	
		Videogames ps4 = new Videogames("PS4", 1800, 100, "Sony", "Slim", false);
		Videogames ps4Usado = new Videogames("PS4", 1000, 7, "Sony", "Slim", true);
		Videogames xbox = new Videogames("XBOX", 1500, 500, "Microsoft", "One", false);
		
		List<Videogames> videogames = new ArrayList<>();
		videogames.add(ps4);
		videogames.add(ps4Usado);
		videogames.add(xbox);
		
		
		Loja americanas = new Loja ("Americanas","12345678", livros, videogames);
		
		livro12.calcularimposto();
		livro13.calcularimposto();
		
		ps4Usado.calcularimposto();
		ps4.calcularimposto();
		
		americanas.meusLivros();
		americanas.meusVideogames();
		americanas.calculaPatrimonio();
		
		
	}

}
