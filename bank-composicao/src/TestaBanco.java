
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silva";
		paulo.cpf = "434.243.432-00";
		paulo.profissao = "programador";
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		
		//associa o cliente paulo a conta contaPaulo
		contaPaulo.titular = paulo;
		System.out.println(contaPaulo.titular);
		System.out.println(paulo);
	}
}
