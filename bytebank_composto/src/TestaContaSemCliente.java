public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		
		contaDaMarcela.titular = new Cliente(); //Ao criar o novo Cliente eu já o armazeno no conta.titular sem precisar criar uma variavel para fazer essa junção
		System.out.println(contaDaMarcela.titular);
		
		contaDaMarcela.titular.nome = "Marcela"; 
		System.out.println(contaDaMarcela.titular.nome); //Agora como esse cliente realmente existe o Java consegue percorrer os atributos sem erros
	}
}

//Ao tentar mudar o nome de um cliente que sequer existe o Java devolve um erro e continuará como null