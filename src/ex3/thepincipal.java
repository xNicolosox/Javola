package ex3;

public class thepincipal {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//nome, vida, mana, xp, inteligencia, force, nivel
		int totaldepersonagem = 0;
		Mago mago1 = new Mago("Nicolas", 50, 20, 30, 15, 5, 2);
		totaldepersonagem++;
		mago1.lvlup();
		mago1.lvlup();
		mago1.attack();
		mago1.aprenderMagia("xablau");
		
		Guerreiro guerreiro1 = new Guerreiro("Gabriel", 100, 5, 30, 3, 40, 3);
		guerreiro1.lvlup();
		guerreiro1.lvlup();
		guerreiro1.attack();
		guerreiro1.aprenderHabilidade("raduken");
		
		Personagem.mostrarpersonagens();

		
		
	}

}
