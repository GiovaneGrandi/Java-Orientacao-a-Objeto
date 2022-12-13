public class TestaBanco {
	public static void main(String[] args) {
		Cliente giovane = new Cliente();
		giovane.nome = "Giovane Grandi";
		giovane.cpf = "222.222.222-22";
		giovane.profissao = "Programador";
		
		Conta contaDoGiovane = new Conta();
		contaDoGiovane.deposita(100);
		contaDoGiovane.titular = giovane; //O comando que conecta a conta (contaDoGiovane) com um cliente (giovane) /contaDoGiovane e giovane levam ao mesmo objeto da classe Cliente, os dois são referencias para o mesmo objeto
		System.out.println(contaDoGiovane.titular.nome); //Navegando pelos atributos utilizando o "." /Eu primeiro vou até a referencia do titular da conta e em seguida passo para o objeto cliente e seleciono o atributo nome
	}
}
