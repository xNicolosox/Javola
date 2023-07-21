package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem implements Ataque{
	
	private List<String> Magia;
	
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int nivel) {
		super(nome, vida, mana, xp, inteligencia, forca, nivel);
		Magia = new ArrayList<>();
		}
	
	
	@Override
	public void lvlup() {
		setMana(this.getMana()+10);
		setInteligencia(this.getInteligencia()+5);
		setNivel(getNivel() + 1);
		System.out.println("SUBIU DE NIVEL! seu nivel é " + getNivel()+ ".");
		System.out.println("A mana do mago " + getNome() + " é " + getMana() + " e a inteligencia é "+ getInteligencia() + ".");
		
	}

	@Override
	public void attack() {
		int ataque;
		Random random = new Random();
		int numeroRandomico = random.nextInt(301);
		ataque = (getInteligencia()* getNivel())+ numeroRandomico;
		System.out.println("A força do ataque é " + ataque + ".");
	}
	
	
	
	public void aprenderMagia(String magia){
		Magia.add(magia);
		for (String magia1: Magia) {
            System.out.println("Magia aprendida: " + magia1);
		}
	}
	}
