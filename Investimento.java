public class Investimento extends Conta {
	
	@Override
	public void ImprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}
}