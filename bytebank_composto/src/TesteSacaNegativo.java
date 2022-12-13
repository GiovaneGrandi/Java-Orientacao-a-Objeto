public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(200)); //Retornando o boolean false pois não foi possível sacar pelo valor ser maior que o saldo disponível
		
		System.out.println(conta.getSaldo());
	}
}
