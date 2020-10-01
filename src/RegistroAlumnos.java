import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroAlumnos {
	
	Map<Integer, Alumno> mapNombres;
	Scanner entrada = new Scanner(System.in);
	
	public RegistroAlumnos() {mapNombres = new HashMap<Integer, Alumno>();}


    public void vaciarLista() {
		mapNombres.clear();
	}

    
    public String seleccionarCarrera() {
    	String carreras[] = {"ISC", "IIA", "IM", "LA", "CP"};
    	byte opcion;
    	
    	while(true) {
    		System.out.println("1.- ISC");
    		System.out.println("2.- IIA");
    		System.out.println("3.- IM");
    		System.out.println("4.- LA");
    		System.out.println("5.- CP");
    		System.out.print("Selecciona una carrera: ");
    		opcion = entrada.nextByte();
    		
    		if(opcion<=5 && opcion>=1) {
    			break;
    		}else {
    			System.out.println("Opcion inexistente, por favor vuelve a intentarlo");
    		}
    	}
    	
    	return carreras[opcion-1];
	}


	public void limpiarMemoria(){
		entrada.nextLine();
	}
	
}
