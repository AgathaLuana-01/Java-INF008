package empresa;

import java.util.List;

public class Chefe extends Pessoa {
	private List<Pessoa> empregados;
	public Chefe(String nome, Pessoa chefe, List<Pessoa> empregados) {
		super(nome, chefe, empregados);
		
	}

	public List<Pessoa> getEmpregado() throws Exception {
		return this.empregados;
	}

}
