package principal;

public class Principal {

	public static void main(String[] args) {

		CartaoGold gold = new CartaoGold();
		gold.setNumero("1234 5678 9876 5432");
		gold.setTitular(new Titular("JULIO C CAVALCANTE B"));

		CartaoPlatinum platinum = new CartaoPlatinum();
		platinum.setNumero("1111 2222 3333 4444");
		platinum.setTitular(new Titular("ALANDSON MENDONCA R M"));

		CartaoUniversitario universitario = new  CartaoUniversitario();
		universitario.setNumero("0000 1000 2000 3000");
		universitario.setTitular(new Titular("LUIZ JACO B OLIVEIRA"));

		gold.calculaBonus(100);
		gold.calculaBonus(50);
		gold.calculaBonus(50);		

		platinum.calculaBonus(100);
		platinum.calculaBonus(50);
		platinum.calculaBonus(50);

		universitario.calculaBonus(500);
		universitario.calculaBonus(500);

 		CalculadoraDeBonus calc = new CalculadoraDeBonus();
		calc.somaBonus(gold);
		calc.somaBonus(platinum);
		calc.somaBonus(universitario);

		System.out.print("O total de cartão de bonus é " + calc.getTotal());

	}
}