
public class TesteFuncionario {

	public static void main(String[] args) {
		Gerente joao = new Gerente();
		joao.setNome("Joao Santos");
		joao.setCpf("333.222.333-00");
		joao.setSalario(2500);
		
		System.out.println(joao.getNome());
		System.out.println(joao.getBonificacao());
		
		

	}

}
