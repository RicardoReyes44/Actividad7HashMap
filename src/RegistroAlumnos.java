import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroAlumnos {
	
	Map<Integer, Alumno> mapNombres;
	Scanner entrada = new Scanner(System.in);
	
	public RegistroAlumnos() {mapNombres = new HashMap<Integer, Alumno>();}
	
	public void limpiarMemoria(){
		entrada.nextLine();
	}
	
}
