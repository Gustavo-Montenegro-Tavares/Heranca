
public class CriarConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Cliente gustavo = new Cliente();
		primeiraConta.setTitular(gustavo);
		
		//Teste de refer�ncia
		primeiraConta.getTitular().setNome("Jubileu");
		System.out.println(primeiraConta.getTitular().getNome());
		
		gustavo.setNome("gustavo");
		System.out.println(gustavo.getNome());
		//fim do teste de refer�ncia
		
		primeiraConta.deposita(200);
		primeiraConta.saca(100);
		System.out.println("O saldo de " + gustavo.getNome() + " �: " + primeiraConta.getSaldo() + " reais");
		
		primeiraConta.deposita(100);
		System.out.println("O saldo de " + gustavo.getNome() + " �: "  + primeiraConta.getSaldo() + " reais");
		
		Conta segundaConta = new Conta();
		Cliente bertin = new Cliente();
		segundaConta.setTitular(bertin);

		segundaConta.getTitular().setNome("bertin");
		
		segundaConta.deposita(50);
		System.out.println("O saldo de " + bertin.getNome() + " �: "  + segundaConta.getSaldo() + " reais");

		
	}
}
