import java.util.logging.Level;

public class Principal {

	public static void main(String[] args) {
		try {
			Log meuLogger = new Log("Log.txt");
			meuLogger.logger.setLevel(Level.WARNING);
			meuLogger.logger.info("Log de informa��o");
			meuLogger.logger.warning("Aviso o c�digo foi executado");
			meuLogger.logger.severe("Log Severo");
			

		} catch (Exception e) {
			

		}

	}

}
