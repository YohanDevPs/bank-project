package application;


public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		
		Cliente venilton = new Cliente();
		Cliente jerfesson = new Cliente();   
		Cliente vanessa = new Cliente();
		Cliente jussara = new Cliente();   
		
		vanessa.setNome("Venilton");
		jussara.setNome("Jussara");
		jerfesson.setNome("Jerfesson");
		venilton.setNome("venilton");
		
		banco.addCliente(jerfesson);
		banco.addCliente(venilton);
		banco.addCliente(vanessa);
		banco.addCliente(jussara);
		
		banco.imprimirTodosClientes();
	}
}
