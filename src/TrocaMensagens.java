import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.Scanner;

public class TrocaMensagens {
	private Scanner reader= new Scanner(System.in);
	
	public void iniciarBatePapo(BufferedReader in, PrintStream out) throws Exception {
		while (true) {
			System.out.println("Digite uma mensagem aqui: ");
			String mensagem= reader.nextLine();
			
			out.println(mensagem);
			
			if("FIM".equals(mensagem)) {
				break;
			}
			mensagem= in.readLine();
			System.out.println("Mensagem enviada: "
					+ mensagem);
		}
	}
}
