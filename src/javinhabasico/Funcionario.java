package javinhabasico;

public class Funcionario extends Pessoa  {
	private String cargo;
	private double salario;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", salario=" + salario + ", nome=" + getNome() + ", idade="
				+ getIdade() + ", cpf=" + getCpf() + "]";
	}
	
}
