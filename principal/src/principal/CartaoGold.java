package principal;

public class CartaoGold extends Cartao {

	public double calculaBonus(double valor){
		return this.totalBonus += valor;
	}

}