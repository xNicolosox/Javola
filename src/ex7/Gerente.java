package ex7;

public class Gerente extends Funcionario {

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public void Bonificacao() {
		System.out.println("Salario com a bonificação do(a) gerente " +getNome() +" é de " + (getSalario() + 10000.0) +".");
	}
}
