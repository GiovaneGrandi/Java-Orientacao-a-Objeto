public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //O "primeiraConta" não é um objeto do tipo Conta, ele é apenas uma referência que leva até um objeto novo de Conta (new Conta) / Essa varíavel apenas guarda o endereço da memória onde está localizada essa nova Conta
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //Ao apontar uma referência para uma varíavel ao invés de um "new objeto" eu não vou criar duas contas, eu vou apenas estar tendo duas referências para o mesmo objeto, então ao modificar algum atributo da conta, independente de qual varíavel você chamar aquele valor será o mesmo em todas as suas referências
		
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!"); //Esse if será true por justamente as duas referências guardarem o mesmo endereço de memória nelas
		}
		
		System.out.println(primeiraConta); //Ao imprimir a primeiraConta sem puxar nenhum atríbuto será retornado "Conta(por se tratar de um objeto do tipo Conta) e um número que seria o endereço de memória que esse objeto ocupa"
		System.out.println(segundaConta); //Provando uma segunda vez que as duas referências levam para o mesmo lugar da memória
	}
}
