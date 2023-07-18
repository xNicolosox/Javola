package ex7;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	@Override
	public void Bonificacao() {
		System.out.println("Salario com a bonificação do(a) vendedor " +getNome() +" é de " + (getSalario() +3000.0) +".");
	}
}
