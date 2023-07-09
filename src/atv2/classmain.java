package atv2;

public class Classmain {

	public static void main(String[] args) {
		Cavalo cavalo1 = new Cavalo();
		cavalo1.setNome("shiryu");
		cavalo1.setRaça("Marajoara");
		cavalo1.setIdade(18);
		cavalo1.setCor("marrom");
		System.out.println(cavalo1.toString());
		cavalo1.alimentar();
		cavalo1.levarVeterinario();	}

}
