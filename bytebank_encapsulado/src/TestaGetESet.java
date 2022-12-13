public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente giovane = new Cliente();
		
		giovane.setNome("Giovane Grandi");
		conta.setTitular(giovane);
		System.out.println(conta.getTitular().getNome()); //Para percorrer as referencias e alcançar os atributos desejaveis é da mesma forma de antes, porém ao invés de usar os atributos puros usamos os gets
		
		conta.getTitular().setProfissao("Programador"); //É possível também combinar os getters e setters para trabalharem juntos, nesse caso eu estou pegando o return de titular e então entrando nele e modificando o atributo profissao através do set
		//Também é possível fazer esse código quebrando em duas linhas, nesse caso ficaria assim:
		
		//Cliente titularDaConta = conta.getTitular();
		//titularDaConta.setProfissao("Programador");
	}
}
