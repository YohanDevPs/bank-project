package application;

import java.util.ArrayList;
import java.util.List;


public class Banco {
	
	protected Cliente cliente;
	private List<Cliente> listaClientes = new ArrayList<>();

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	public void addCliente (Cliente nome) {
		this.listaClientes.add(nome);
	}


	protected void imprimirTodosClientes() {
		for(Cliente ls : listaClientes) {
			System.out.println(String.format("%s", ls.getNome()));
			
		}
	}
	
}
