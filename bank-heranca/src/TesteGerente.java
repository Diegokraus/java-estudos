
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marta");
		g1.setCpf("437243749247");
		g1.setSalario(5000);

		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(223);
		boolean autenticou = g1.autetica(223);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
