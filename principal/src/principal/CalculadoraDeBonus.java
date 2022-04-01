package principal;

public class CalculadoraDeBonus {

	private double total;

	public void somaBonus(Cartao cartao){
		this.total += cartao.getTotalBonus();
	}

	public double getTotal(){
		return this.total;
	}

}
