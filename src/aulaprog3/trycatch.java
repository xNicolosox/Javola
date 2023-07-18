package aulaprog3;

public class trycatch {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
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
