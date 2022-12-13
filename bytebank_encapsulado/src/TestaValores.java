public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		Conta conta2 = new Conta(1337, 16549);
		
		Conta conta3 = new Conta(2112, 14660);
		
		System.out.println(Conta.getTotal()); //Invocando o método da classe Conta usando a classe como sujeito ao invés de uma instância aleatória como "conta2"
	}
}
