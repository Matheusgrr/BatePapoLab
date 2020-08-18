import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ConexaoSocket {
	private Socket socket;
	private InputStream input;
	private OutputStream output;
	private BufferedReader in;
	private PrintStream out;
	private ServerSocket server;
	
	public void criarSocket(boolean a) throws Exception{
		if(a) {
			server= new ServerSocket(2525);
			socket= server.accept();
			System.out.println("Iniciando servidor");
		}
		else {
			socket= new Socket("localHost",2525);
			System.out.println("Conexão estabelecida!");
		}
		input= socket.getInputStream();
		output= socket.getOutputStream();
		in= new BufferedReader(new InputStreamReader(input));
		out= new PrintStream(output);
		
	}
	public void encerrarConexao(boolean servidor) throws Exception {
		if(servidor) {
			server.close();
		}
		else {
			socket.close();
		}
		in.close();
		out.close();
	}
	

	public Socket getSocket() {
		return socket;
	}

	

	public InputStream getInput() {
		return input;
	}

	

	public OutputStream getOutput() {
		return output;
	}

	

	public BufferedReader getIn() {
		return in;
	}

	

	public PrintStream getOut() {
		return out;
	}

	
	
	public ServerSocket getServer() {
		return server;
	}
	
	
}
