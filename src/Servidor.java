
public class Servidor {
	private static TrocaMensagens batePapo= new TrocaMensagens();
	private static ConexaoSocket conexao= new ConexaoSocket();
	
	public static void main(String[] args) {
		 
		
		System.out.println("Iniciando servidor");
		try {
			conexao.criarSocket(true);
			
			batePapo.iniciarBatePapo(conexao.getIn(), conexao.getOut());
			
			conexao.encerrarConexao(true);
			System.out.println("Servidor conexão encerrado");
			
		} catch (Exception e) {
			System.out.println("Deu ruim");
		}
		
		
		
	}

}
