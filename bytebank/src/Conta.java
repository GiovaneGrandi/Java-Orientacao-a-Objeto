public class Conta { //class Conta é = tipo Conta / Com o class se cria um novo tipo de objeto ou instância que poderá ser usado no futuro
	double saldo; //Aquilo que fica dentro de uma class em português é chamado de atríbuto
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) { //Criando um método "deposita" no qual ele recebe como parâmetro uma variavel double chamada de valor / quando tem um "void" na frente de um método isso significa que ele não retornará nada, ele apenas irá executar o método mas não terá nenhuma ação após a conclusão do método, apenas enviando o valor para a conta mas não retornando nada para quem o invocou
		this.saldo += valor; //Usando o this para que a soma seja feita no objeto Conta que esse método for invocado e não nas de mais / Nessa ocasião o this não é obrigatório porém mais na frente ele irá aparecer mais
	}
	
	public boolean saca(double valor) { //Criando um método que retornará um boolean para caso a operação tenha dado certo ou não, por isso a palavra chave "boolean" na esquerda
		if(this.saldo >= valor) { //Fazendo o if que fará o teste de "tenho dinheiro o suficiente para sacar este valor da conta?"
			this.saldo -= valor; //Fazendo o comando utilizando o -= para encurtar /Saldo -= valor é como se fosse "saldo = saldo - valor"
			return true; //Caso o saque consiga ser feito será retornado true para quem invocou /O return também irá parar o método na hora que ele for ativado
		} else {
			return false; //Caso o saque não dê certo ele retornará false
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
}