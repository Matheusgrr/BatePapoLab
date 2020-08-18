
public class Cliente {
	private static ConexaoSocket conexao=new ConexaoSocket();
	private static TrocaMensagens batePapo= new TrocaMensagens();
	
	public static void main(String[] args) {
		
		try {
			conexao.criarSocket(false);
			
			batePapo.iniciarBatePapo(conexao.getIn(), conexao.getOut());
			
			conexao.encerrarConexao(false);
			System.out.println("Servidor conexão encerrado");
			
			
		} catch (Exception e) {
			System.out.println("Deu ruim");
		}
	}
}
