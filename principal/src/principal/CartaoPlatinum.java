package principal;

public class CartaoPlatinum extends Cartao {

	public double calculaBonus(double valor){
		return this.totalBonus += valor * 1.5;
	}

}