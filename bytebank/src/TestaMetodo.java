public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoGiovane = new Conta(); //É uma prática bastante usada quando vai se criar um objeto apenas para uso rápido nomealo com o mesmo nome da classe só que com letras minusculas
		contaDoGiovane.titular = "Giovane Grandi";
		System.out.println(contaDoGiovane.titular);
		contaDoGiovane.saldo = 100;
		contaDoGiovane.deposita(50);
		System.out.println(contaDoGiovane.saldo);


		
		boolean conseguiuRetirar = contaDoGiovane.saca(20); //Criando uma variavel para pegar o boolean retornado pelo método
		System.out.println(contaDoGiovane.saldo); //Mostrando o valor da conta após o saque
		System.out.println(conseguiuRetirar); //Exibindo o boolean armazenado na variavel que recebe do método
		
		Conta contaDaMaria = new Conta();
		contaDaMaria.deposita(1000);
		if(contaDaMaria.transfere(300, contaDoGiovane)) { //Ao invés de guardar o boolean retornado pelo método em uma variavel também é possível fazer esse if direto pois um if sempre retorna true ou false, como transfere é um boolean ele o aceita como parâmetro
			System.out.println("Transferência efetuada com sucesso!");
		} else {
			System.out.println("Tivemos um erro!");
		}
		System.out.println(contaDaMaria.saldo);
		System.out.println(contaDoGiovane.saldo);
	}
}

//Ao manter o "ctrl" pressionado e passar o mouse por cima do código muitas invocações e e comandos irão aparecer como links que levarão direto ao seu local /No exemplo de um método, ao clicar na sua invocação ele irá para a classe onde aquele método foi criado