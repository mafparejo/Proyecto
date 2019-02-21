package g;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
	
	
	public static void main(String[] args) {
		Logger log = (Logger) Logger.getInstance(Main.class);
		BasicConfigurator.configure();
		Persona p = new Persona();
		
		log.info("Bienvenido "+p.getNombre());

	}

}
