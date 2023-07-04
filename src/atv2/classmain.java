package atv2;

public class classmain {

	public static void main(String[] args) {
		Cavalo cavalo1 = new Cavalo();
		cavalo1.setNome("shiryu");
		cavalo1.setRaça("Marajoara");
		cavalo1.setIdade(18);
		cavalo1.setCor("marrom");
		cavalo1.alimentar();
		System.out.println(cavalo1.toString());
	}

}
