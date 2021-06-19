
public class ControleDeOnibus {
	
    	public static void main(String[] args) {
    			Onibus Naguiri1 = new Onibus();
    			
    			Naguiri1.setNumeroDoOnibus(3025);
    			Naguiri1.setModeloDoOnibus("Volkswagen");
    			Naguiri1.setPlacaDoOnibus("A21B21");
    			Naguiri1.setChegouNoDestino(10);
    			System.out.println(Naguiri1.getNumeroDoOnibus());
    			System.out.println(Naguiri1.getModeloDoOnibus());
    			System.out.println(Naguiri1.getPlacaDoOnibus());
    			System.out.println(Naguiri1.getChegouNoDestino());
    			
                Onibus Naguiri2 = new Onibus();
    			
    			Naguiri2.setNumeroDoOnibus(1005);
    			Naguiri2.setModeloDoOnibus("Volkswagen");
    			Naguiri2.setPlacaDoOnibus("A21BCC");
    			Naguiri2.setChegouNoDestino(1);
    			System.out.println(Naguiri2.getNumeroDoOnibus());
    			System.out.println(Naguiri2.getModeloDoOnibus());
    			System.out.println(Naguiri2.getPlacaDoOnibus());
    			System.out.println(Naguiri2.getChegouNoDestino());
    	}
}
