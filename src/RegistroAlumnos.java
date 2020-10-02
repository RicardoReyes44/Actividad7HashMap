import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class RegistroAlumnos {
	
	Map<Integer, Alumno> mapNombres;
	Scanner entrada = new Scanner(System.in);
	
	
	public RegistroAlumnos() {mapNombres = new HashMap<Integer, Alumno>();}


    public void vaciarLista() {
		mapNombres.clear();
	}
    
    
    public void llenarLista() throws InputMismatchException{
    	byte edad;
    	String nombre;
    	int folio;
    	String fecha = "";
    	
    	System.out.print("Introduce nombre: ");
		nombre = entrada.nextLine();


    	while(true) {
    		System.out.print("Introduce edad: ");
    		edad = entrada.nextByte();
    		
    		if(edad>0) {
    			break;
    		}else {
    			System.out.println("No puede ingresar esa edad, por favor vuelve a intentarlo");
    		}
    	}


    	if(mapNombres.isEmpty()) {
    		folio = 1;
    	}else {
    		folio = mapNombres.get(mapNombres.size()-1).getFolio()+1;
    	}


    	System.out.println("\nFecha de inscripcion");
    	while(true) {
    		    System.out.print("Introduce dia: ");
    		    int dia = entrada.nextInt();
    		    System.out.print("Introduce mes: ");
    		    int mes = entrada.nextInt();
    		    System.out.print("Introduce año: ");
    		    int año = entrada.nextInt();

    		    if(dia>0 && dia<32 && mes>0 && mes<13 && año>0) {
    			    fecha = dia + "/" + mes + "/" + año;
    		    	break;
    		    }else {
    		    	System.out.println("\nLa fecha no esta bien escrita, por favor prueba de nuevo");
    		    }
    	}
    	
    	mapNombres.put(folio, new Alumno(folio, nombre, edad, seleccionarCarrera(), fecha));
    	
    }

    
    public String seleccionarCarrera() {
    	String carreras[] = {"ISC", "IIA", "IM", "LA", "CP"};
    	byte opcion;
    	
    	System.out.println();
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
	
	
	public void mostrarInscritosDespues() {
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(mapNombres.values());

		for(Alumno al: listaAlumnos) {
			String fecha[] = al.getFechaInscripcion().split("/");
			if(Integer.parseInt(fecha[2])>2016) {
			    System.out.println(al);
			}else if(Integer.parseInt(fecha[2])==2016 && Integer.parseInt(fecha[1])>8) {
				System.out.println(al);
			}else if(Integer.parseInt(fecha[2])==2016 && Integer.parseInt(fecha[1])==8 && Integer.parseInt(fecha[0])>10) {
				System.out.println(al);
			}
		}
		
	}
	
}
