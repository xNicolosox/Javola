package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem implements Ataque{
	
	private List<String> Habilidade;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int nivel) {
		super(nome, vida, mana, xp, inteligencia, forca, nivel);
		Habilidade = new ArrayList<>();
	}

	@Override
	public void lvlup() {
		setVida(getVida()+10);
		setForca(getForca()+5);
		setNivel(getNivel()+1);
		System.out.println("SUBIU DE NIVEL!");
		System.out.println("A vida do gurreiro " + getNome() + " é " + getVida()+ " e a força é "+ getForca() + ".");
		
	}

	@Override
	public void attack() {
		int ataque;
		Random random = new Random();
		int numeroRandomico = random.nextInt(301);
		ataque = (getForca()*getNivel() + numeroRandomico);
		System.out.println("A força do ataque é " + ataque + ".");
	}
	
	void aprenderHabilidade(String habilidade){
		Habilidade.add(habilidade);
		for (String hab1: Habilidade){
			System.out.println("Habilidade aprendida: " + hab1);
		}
	}
	
}
