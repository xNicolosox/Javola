package aula2prog3;

public class ObserverMain {

	public static void main(String[] args) {
		  Sujeito sujeito = new Sujeito();
	        Observer assinante1 = new ObservadorConcreto();
	        Observer assinante2 = new ObservadorConcreto();
	        
	        sujeito.adicionarAssinantes(assinante1);
	        sujeito.adicionarAssinantes(assinante2);
	        sujeito.removerObservador(assinante2);
	     

	        // Quando ocorre uma mudança, notificamos os observadores
	        
	}

}
