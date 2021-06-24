public class TesteConexao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try (Conexao con = new Conexao()){
			con.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu Erro na conexão");
		}
		
	}

}
