package application;

import java.util.ArrayList;
import java.util.List;

//Projeto modificado
public class Banco {
	
	protected Cliente cliente;
	private List<Cliente> listaClientes = new ArrayList<>();
	private String nome;
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}	

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
		System.out.println("======= Clientes do Banco ========");
		for(Cliente ls : listaClientes) {
			System.out.println(String.format("%s", ls.getNome()));			
		}
		System.out.println("==================================");
	}
	
}
