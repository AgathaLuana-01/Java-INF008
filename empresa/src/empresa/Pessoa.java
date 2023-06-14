package empresa;

import java.util.List;

public abstract class Pessoa {
	private String nome;
	private Pessoa chefe;
	private List<Pessoa> empregados;
	
	public Pessoa(String nome, Pessoa chefe, List<Pessoa> empregados) {
	this.nome = nome;
	this.chefe = chefe;
	this.empregados = empregados;
	}
	
	public Pessoa getChefe() {
		return this.chefe;
	}
	
	public abstract List<Pessoa> getEmpregado() throws Exception;
	
	
	
}
