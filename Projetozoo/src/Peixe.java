
public class Peixe extends Animal {

	
	public String caracteristicas;
		
	public Peixe(String nome, String comprimento, int nPatas, String cor, String habitat, double velocidade,
			String caracteristicas) {
		super(nome, comprimento, nPatas, cor, habitat, velocidade);
		this.caracteristicas = caracteristicas;
	}
	
	public Peixe() {
		super.setnPatas(0);
		super.setHabitat("Mar");
		super.setCor("cinza");
		this.caracteristicas= "barbatanas e cauda";
	}
	public int getnPatas() {
		return nPatas;
	}
	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}	
	@Override
	public String toString() {
		return super.toString() +
			 "Caracteristicas: " + getCaracteristicas();
	    }
	}
	