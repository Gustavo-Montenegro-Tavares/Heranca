
public class testaMetodos {
	
	public static void main(String[] args) {
		
		Conta contaGutu = new Conta();
		Conta contaJoao = new Conta();
		Cliente gutu = new Cliente();
		Cliente joao = new Cliente();
		contaGutu.setTitular(gutu);
		contaJoao.setTitular(joao);
		
		contaGutu.deposita(100);
		contaJoao.deposita(200);
		
		contaGutu.saca(100);
		System.out.println("Gutu sacou "  + contaGutu.getSaldo());
		
		contaGutu.deposita(100);
		System.out.println("Gutu depositou  "  + contaGutu.getSaldo());
		
		contaGutu.transfere(500, contaJoao);
		System.out.println("Gutu transferiu para João "  + contaGutu.getSaldo());
		System.out.println(contaJoao.getSaldo()	);
		
	}
}
