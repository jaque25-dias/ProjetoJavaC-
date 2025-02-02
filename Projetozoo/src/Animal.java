
public class Animal {

	String nome = "";
	String comprimento;
	int nPatas;
    String cor = "";
	String habitat = "";
    double velocidade = 0;
    
	public Animal(String nome, String comprimento, int nPatas, String cor, String habitat, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.nPatas = nPatas;
		this.cor = cor;
		this.habitat = habitat;
		this.velocidade = velocidade;
	}
	
	public Animal() {
		this.nPatas=4;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComprimento() {
		return comprimento;
	}
	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	public int getnPatas() {
		return nPatas;
	}
	public void setnPatas(int nPatas) {
		this.nPatas = nPatas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}	
	@Override
	public String toString() {
		return "~~~~~~~~~~~~~~~~~~~~~~\n"+
				"Animal:" + getNome() + "\n"+
	            "Comprimento: " + getComprimento() + "\n"+
	            "Número de Patas: " + getnPatas() +"\n"+
	            "Cor: "+ getCor() + "\n"+
	            "Ambiente: " + getHabitat() +"\n"+
	            "Velocidade: " + getVelocidade()+"\n";
	}	
}