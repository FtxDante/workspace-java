
public class TesteEstoque {

	public static void main(String[] args) {
		Estoque e = new Estoque();
		System.out.println(e.getViagensFeitas());
		System.out.println( e.getNumeroDaPassagem());
		e.setData("16-06-2021");
		e.setHora("18:24");
		e.setIdade(18);
		e.setLocalEmbarque("Fortaleza");
		e.setLocalDesembarque("São Paulo");
		e.setNomePassageiro("Paulo Sérgio Rodrigues");
		
	}

}
