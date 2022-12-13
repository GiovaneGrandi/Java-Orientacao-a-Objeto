//Em uma class que representa u7m objeto não se usa a tag main
public class Conta { 
	private double saldo; //Usando a palavra chave "private" para deixar um atributo privado impedindo-o de ser visto ou acessado de fora da classe
	int agencia;			//Os atributos de uma classe não podem nunca ser atrubuídos diretamente, sempre se deve apenas acessa-los através dos métodos
	int numero;
	Cliente titular; //Informando que o titular receberá uma referência para um objeto do tipo Cliente, fazendo assim a associação entre os objetos Conta e Cliente
	//O valor default de um atributo do tipo referencia é "null" /Também caso eu quisesse poderia setar o valor default como "new Cliente()" no titular para ele sempre criar um novo cliente automaticamente, porém nesse caso nem seria o certo a se fazer
	
	public void deposita(double valor) { 
		this.saldo += valor; 
	}
	
	public boolean saca(double valor) { 
		if(this.saldo >= valor) { 
			this.saldo -= valor; 
			return true; 
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() { //É uma convenção que um método que pega alguma informação se chame "get" /Para mudar o nome de uma variavel sem ter que reescrever os outros arquivos em que ela aparece é só seleciona-la e ir em "refactor" e em "rename"
		return this.saldo; //Fazendo um método que ao ser invocado ele irá retornar o saldo da conta pedida, já que o atributo saldo se tornou privado
	}
}