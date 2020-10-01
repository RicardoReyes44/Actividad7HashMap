import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaHashMap {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		RegistroAlumnos ra = new RegistroAlumnos();
		boolean candado = true;
		
		while(candado) {
			System.out.println("----------Menu principal-----------");
			System.out.println("1.- Llenar lista");
			System.out.println("2.- Vaciar lista");
			System.out.println("3.- Mostrar aumnos por carrera");
			System.out.println("4.- Calcular promedio de edades");
			System.out.println("5.- Mostrar los alumnos que se incribieron antes del (10/08/2016)");
			System.out.println("6.- Salir");
			System.out.print("Introduce opcion: ");
			
			try {
				
				byte opcion = entrada.nextByte();
				
				switch(opcion) {
				case 1:
					System.out.println(ra.seleccionarCarrera());
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 6:
					candado = false;
					break;
					
				default:
					System.out.println("Opcion inexistente, por favor prueba de nuevo\n");
					break;
					
				}
				System.out.println();
	
			}catch(InputMismatchException error) {
				System.out.println("\nError en la entrada de datos<" + error + ">, por favor pueba de nuevo\n");
				entrada.nextLine();
				ra.limpiarMemoria();
			}
		}

	}

}
