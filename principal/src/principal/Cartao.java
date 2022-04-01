package principal;

public class Cartao {
	protected String numero;
	protected Titular titular;
	protected double totalBonus;

	public double calculaBonus(double valor){
		return totalBonus = valor * 0;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	public double getTotalBonus(){
		return totalBonus;
	}	
}
