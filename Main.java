
public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new Contapoupanca();
		Conta investimento = new Investimento();
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		}
}