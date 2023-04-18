package primeiroPrograma;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //pega o valor da primeira
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("São contas diferentes!");
		}
	}
}
