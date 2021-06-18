
public class TicketEmbarque {
	private int  idade;
	private String data, hora, localEmbarque, localDesembarque, poltrona, nomePassageiro;
	
	public void TickeEmbarque(String nome) {
		setNomePassageiro(nome);
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getLocalEmbarque() {
		return localEmbarque;
	}
	public void setLocalEmbarque(String localEmbarque) {
		this.localEmbarque = localEmbarque;
	}
	public String getLocalDesembarque() {
		return localDesembarque;
	}
	public void setLocalDesembarque(String localDesembarque) {
		this.localDesembarque = localDesembarque;
	}
	public String getPoltrona() {
		return poltrona;
	}
	public void setPoltrona(String poltrona) {
		this.poltrona = poltrona;
	}
	public String getNomePassageiro() {
		return nomePassageiro;
	}
	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}

}
