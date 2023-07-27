package aulaprog3;

public class Trycatch {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 5;
		int result;
		
		try {
			result = (n1/n2);
			System.out.println(result);
		} catch (Exception erro) {
			System.out.println("deu erro aqui filho");
		}finally {
			System.out.println("sla");
		}
		
	}

}
