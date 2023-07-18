package ex7;

public class Mymainclass {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente("Nicolas", 18, 6000.0 );
		Gerente gerente2 = new Gerente("Isabella", 21, 8000.0 );
		
		Supervisor supervisor1 = new Supervisor("Kelvin", 20, 4000.0);
		
		Vendedor vendedor1 = new Vendedor("Dario", 21, 2000.0);
		
		
		gerente1.Bonificacao();
		gerente2.Bonificacao();
		supervisor1.Bonificacao();
		vendedor1.Bonificacao();
	}
}
