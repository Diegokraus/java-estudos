
public class Gerente extends Funcionario{

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autetica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	public double getBonificacao() {
		System.out.println("chamando o metodo bonificacao do GERENTE");
		return super.getSalario();
	}	
	
}
