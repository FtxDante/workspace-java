
public class Onibus {
	private boolean chegouNoDestino;	
	private int numeroDoOnibus;
	private String modeloDoOnibus, placaDoOnibus;
	
	
	public String getNumeroDoOnibus() {
		return "Número do Ônibus: " + numeroDoOnibus;
	}
	public void setNumeroDoOnibus(int numeroDoOnibus) {
		this.numeroDoOnibus = numeroDoOnibus;
	}
	public String getChegouNoDestino() {
		if(this.chegouNoDestino) {
			return "Chegou";
		}else {
			return "Não chegou";
		}
	}
	public void setChegouNoDestino(int chegouNoDestino) {
		boolean teste;
		if (chegouNoDestino == 1) {
			teste = true;
		}else {
			teste = false;
		}
		this.chegouNoDestino = teste;
	}
	public String getModeloDoOnibus() {
		return "Modelo: " + modeloDoOnibus;
	}
	public void setModeloDoOnibus(String modeloDoOnibus) {
		this.modeloDoOnibus = modeloDoOnibus;
	}
	public String getPlacaDoOnibus() {
		return "Placa: " + placaDoOnibus;
	}
	public void setPlacaDoOnibus(String placaDoOnibus) {
		this.placaDoOnibus = placaDoOnibus;
	}
	
}
