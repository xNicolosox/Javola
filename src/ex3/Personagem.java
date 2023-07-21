package ex3;

public class Personagem {
	private String nome;
	private int vida;
	private int mana;
	private float xp;
	private int inteligencia;
	private int forca;
	private int nivel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public float getXp() {
		return xp;
	}
	public void setXp(float xp) {
		this.xp = xp;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int nivel) {
		super();
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.nivel = nivel;
	}
	
	public void lvlup() {}
	private static int totaldepersonagem  = 0;
    {
            Personagem.totaldepersonagem ++;
    }
    public static int ProximaConta()
    {
        return Personagem.totaldepersonagem  + 1;
    }
	
    public static void mostrarpersonagens(){
    	int proxima = Personagem.ProximaConta();
    	System.out.println("Total de personagens criados: " + (proxima-1) +".");
    }
}
