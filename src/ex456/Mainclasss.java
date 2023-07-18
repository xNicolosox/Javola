package ex456;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mainclasss {

	public static void main(String[] args) {
		People pessoa1 = new People("João",15);
		People pessoa2 = new People("Leandro", 21);
		People pessoa3 = new People("Paulo",17);
		People pessoa4 = new People("Jessica", 18);
		
		List <People> pessoas = new ArrayList<>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		for (People pessoa :pessoas) {
			System.out.println(pessoa.toString());
		}
		People pessoamaisvelha = null;
		int maisvelho =0;
		
		for (People pessoa: pessoas) {
			if (pessoa.getIdade() > maisvelho) {
				maisvelho=pessoa.getIdade();
				pessoamaisvelha = pessoa;
			}
		}
		System.out.println("___________________________________________");
		System.out.println("Pessoa mais velha: " + pessoamaisvelha.getNome());
	
		Iterator<People> it = pessoas.iterator();
		
		
		while(it.hasNext()) {
			People people = it.next();
			if(people.getIdade()<18) {
				it.remove();
			}
			System.out.println(it.next()); 
		}
		System.out.println("___________________________________________");
		
		String Nomebuscado = "Jessica";
		boolean encontrado = false;
		
		for (People pessoa:pessoas) {
			if (pessoa.getNome().equals(Nomebuscado)) {
				System.out.println("Idade de "+ pessoa.getNome() + " é " + pessoa.getIdade());
				encontrado = true;
				break;
			}
		}
		
		if (!encontrado) {
			System.out.println("Pessoa levou cha de sumiço");
		}
    }

	}

