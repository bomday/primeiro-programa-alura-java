package primeiroPrograma;
class Conta { 
	//atributos da conta:
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//métodos (funções): não existe método dentro de método
	public void deposita(double valor /*Aqui pode não ter nenhum parâmetro*/) {//void: não retorna informações
		this.saldo += valor; //o this possibilita que o saldo só mudo para a conta que chamou o deposito
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}