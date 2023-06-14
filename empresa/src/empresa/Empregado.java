package empresa;

import java.util.List;

public class Empregado extends Pessoa{

	public Empregado(String nome, Pessoa chefe, List<Pessoa> empregados) {
		super(nome, chefe, empregados);		
	}

	@Override
	public List<Pessoa> getEmpregado() throws Exception{		
		throw new Exception();
	}
	
}
