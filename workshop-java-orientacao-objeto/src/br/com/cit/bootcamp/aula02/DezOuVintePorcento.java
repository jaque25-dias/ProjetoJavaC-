package br.com.cit.bootcamp.aula02;

public class DezOuVintePorcento implements RegraDeCalculo {
	public double calcula (Funcionario funcionario)
	{
		if(funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() / 0.9;
		}
		
		return funcionario.getSalarioBase() / 0.8;
	}
}