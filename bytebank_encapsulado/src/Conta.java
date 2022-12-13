public class Conta { 
	private double saldo; 
	private int agencia;			
	private int numero;
	private Cliente titular; //Privando todos os atributos da classe pois eles só devem ser mexidos dentro da classe
	private static int total; //Criando um atributo para medir a quantidade de contas criadas no banco /Usando a palavra chave "static" para definir que aquele atributo não é exclusivo de cada conta, até agora todas as contas tinham um saldo, um numero, uma agencia... Mas com o static o total passa a ser um atributo de todas as contas e não de uma só, agora todas as contas compartilham um único atributo total
	
	public Conta(int agencia, int numero) { //Criando um construtor para a Conta, assim quando for criada uma new Conta será obrigatório passar os parâmetros desejados e então será executado tudo o que está dentro das chaves junto com a inicialização desse novo objeto
		Conta.total++; //Assim que o construtor rodar ele irá aumentar a contagem de contas criadas /No momento que se tem um atributo estático o "this." não funciona pra ele por não ser um atributo daquela conta específica, agora como o "total" é um atributo da classe Conta ele pode ser referenciado usando o "NomeDaClasse." no caso sendo "Conta."
		
		this.agencia = agencia; //Informando que os atributos da Conta vão receber os parâmetros informados no construtor
		this.numero = numero;
		
		System.out.println("Estou criando a conta " + this.numero + " da agência " + this.agencia); //Toda vez que uma Conta nova for criada essa mensagem será inicializada
		System.out.println("O total de contas criadas agora é " + Conta.total);
	}
	//O Java automaticamente te dá um construtor padrão até você definir um você mesmo, porém depois de definir um construtor o Java não aplicará mais o default, caso você precise dele terá que adiciona-lo por conta própria
	
	
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
	
	public double getSaldo() { 
		return this.saldo; 
	}
	
	public int getNumero() { //Criando um método que irá pegar o número da conta e retorna-lo para quem o invoca
		return this.numero;
	}
	
	public void setNumero(int numero) { //Criando um método que servirá para criar um novo número para a conta caso precise no futuro adicionar novos parâmetros para o numero da conta
		if(numero <= 0) {
			System.out.println("Não é permitido números menores ou iguais a 0");
			return;
		}
		this.numero = numero; //Pode usar uma variavel temporária com o mesmo nome do atributo pois ele está sendo apoiado pelo this, então é o número "dessa conta que está chamando" que receberá o numero passado pelo programador
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não é permitido números menores ou iguais a 0");
			return; //Como esse método é um void e não retorna nada eu apenas uso o return para encerrar a execução do método ao concluir o if
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() { //Usando o "static" pra definir um método para a classe Conta ao invés de suas intâncias, agora ao invés de ter que chamar uma conta qualquer para saber o total de contas podemos ir direto para a classe pedir
		return total;
	}
	//Um método estático só consegue acessar atributos estáticos daquela classe, o getTotal não conseguiria acessar o saldo de alguma conta por exemplo
}

//No atalho "Window" e "Show View" pode ser acessado o "Outline" que serve para listar todos os atributos e métodos de um objeto resumidamente para melhor navegação, também é possível acessar ele pelo atalho no teclado "Ctrl + O" ele irá abrir uma janelinha do Outline para navegar dentro dos objetos com mais facilidade




