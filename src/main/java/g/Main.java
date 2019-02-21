package g;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
	
	
	public static void main(String[] args) {
		Logger log = (Logger) Logger.getInstance(Main.class);
		BasicConfigurator.configure();
		Persona p = new Persona();
		int numero = p.getNumero(2);
		
		log.info("nivel info "+p.getNombre());
		log.info("nivel info "+ numero);
		log.info("nivel info "+p.getFrase("esta frase esta en info"));
		log.debug("nivel debug "+p.getNombre());

	}

}
