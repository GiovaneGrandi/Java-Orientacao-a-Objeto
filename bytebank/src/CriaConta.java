public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // A palavra chave "new" serve para criar (istanciar) um novo objeto de algum tipo, neste caso o tipo Conta /Com o prefixo "Conta" eu aviso que a varíavel é do tipo Conta que foi criado / O objeto não está dentro da varíavel, na verdade a varíavel armazena os dados para apontar para aquela conta criada
		primeiraConta.saldo = 200; //Se referindo ao saldo da primeiraConta e inicializando ele com o valor
		System.out.println(primeiraConta.saldo); //Pode usar o atalho "ctrl + espaço" para ele dar auto complete nas variaveis já criadas, além de após o "." ele indicar os atríbutos que são referênciados na classe Conta
		
		primeiraConta.saldo += 100; //É possível fazer operações aritméticas com os atributos da Conta
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia); //O valor default dos atributos númericos de um objeto, ao contrário de uma varíavel qualquer é "0" / Um boolean no caso tem o valor default como "false"
		System.out.println(primeiraConta.numero);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("São contas diferentes!"); //A parte do if que executará será o else por o if ser false, as 2 referências guardarem endereços de memória diferentes um do outro, são 2 contas diferentes
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta); //Já aqui será impresso dois valores diferentes pois cada referência está conectada com uma nova Conta, então são contas diferentes
		
		//Por mais que as 2 contas tenham os mesmos valores nos atributos e uma seja a cópia da outra, ainda sim todos esses testes darão diferentes pois por mais que as contas sejam iguais os endereços de memória que cada referencia tem são diferentes
	}
}
