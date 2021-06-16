
public class Estoque {
	private int  idade;
	private String data, hora, localEmbarque, localDesembarque, poltrona, nomePassageiro;
	private static int viagensFeitas, numeroDaPassagem;
	private static int passagensRestantes;
	
	public Estoque() {
		setViagensFeitas(1);
		getNumeroDaPassagem();
	}
	
}
