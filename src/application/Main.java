package application;


public class Main {

	public static void main(String[] args) {
Banco banco = new Banco();
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		poupanca.sacar(200);
		
		banco.addCliente(venilton);
		
		Cliente Yohan = new Cliente();
		Yohan.setNome("Yohan");
		
		Conta cc1 = new ContaCorrente(Yohan);
		Conta poupanca1 = new ContaPoupanca(Yohan);
		cc1.depositar(100);
		cc1.transferir(100, poupanca1);
		cc1.depositar(100);
		cc1.transferir(100, poupanca1);
		poupanca1.sacar(200);
		
		banco.addCliente(Yohan);
		
		banco.imprimirTodosClientes();


	}
}
