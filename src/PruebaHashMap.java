import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaHashMap {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		RegistroAlumnos ra = new RegistroAlumnos();
		boolean candado = true;
		int cont = 5;
		
		while(cont>0) {
			System.out.println("Debes de ingresar " + cont + " alumnos para poder empezar");
			try {
				ra.llenarLista();
				cont--;
				System.out.println();
			}catch(InputMismatchException error) {
				System.out.println("Error <" + error + "> valor invalido\n");
				ra.limpiarMemoria();
			}
		}
		
		candado = true;
		
		while(candado) {
			System.out.println("----------Menu principal-----------");
			System.out.println("1.- Llenar lista");
			System.out.println("2.- Vaciar lista");
			System.out.println("3.- Mostrar alumnos por carrera");
			System.out.println("4.- Calcular promedio de edades");
			System.out.println("5.- Mostrar los alumnos que se incribieron despues del (10/08/2016)");
			System.out.println("6.- Salir");
			System.out.print("Introduce opcion: ");
			
			try {
				
				byte opcion = entrada.nextByte();
				System.out.println();
				
				switch(opcion) {
				case 1:
					ra.llenarLista();
					break;
					
				case 2:
					ra.vaciarLista();
					break;
					
				case 3:
					ra.mostrarAlumnosCarrera();
					break;
					
				case 4:
					System.out.println("Promedio: " + ra.calcularPromedioEdades());
					break;
					
				case 5:
					ra.mostrarInscritosDespues();
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
				System.out.println("\nError en la entrada de datos<" + error + ">, regresaras al menu principal\n");
				entrada.nextLine();
				ra.limpiarMemoria();
			}
		}
		System.out.println("X.X");
	}

}
