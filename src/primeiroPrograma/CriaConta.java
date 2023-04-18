package primeiroPrograma;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //tem que chamar conta para class e defini-la nesse espaço
		primeiraConta.saldo = 200; //pega a conta chamada e chama o atributo de dentro dela, podendo atribuir um valor e torna-la uma variavel
		System.out.println(primeiraConta.saldo); //printa na tela
		
		primeiraConta.saldo += 100;
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta(); //nova conta, nova variavel
		segundaConta.saldo = 50;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		//valores em default quando não possuem nenhum valor declarado
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		//atribuído valores
		primeiraConta.agencia = 1;
		primeiraConta.numero = 65978;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
	}
}
