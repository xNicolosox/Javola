package ex7;

public class Supervisor extends Funcionario{

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}
	@Override
	public void Bonificacao() {
		System.out.println("Salario com a bonificação do(a) supervisor " +getNome() +" é de " + (getSalario() + 5000.0) +".");
	}
}
