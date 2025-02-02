
public class Mamifero extends Animal {

	private String alimento;
	
 
  public Mamifero(String nome, String comprimento, int nPatas, String cor, String habitat, double velocidade,
			String alimento) {
		super(nome, comprimento, nPatas, cor, habitat, velocidade);
		this.alimento = alimento;
	}

public Mamifero() {
	 super.setHabitat("Terrestre");
 }

public String getAlimento() {
	return alimento;
}

public void setAlimento(String alimento) {
	this.alimento = alimento;
}

@Override
public String toString() {
	return super.toString() +
			"Alimento"+getAlimento();
}
}
