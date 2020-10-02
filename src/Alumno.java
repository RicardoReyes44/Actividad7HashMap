
public class Alumno {
	
	private String nombre;
	private int edad;
	private String carrera;
	private int folio;
	private String fechaInscripcion;
	
	public Alumno() {}
	public Alumno(int folio, String nombre, int edad, String carrera, String fechaInscripcion){
		this.nombre = nombre;
		this.folio = folio;
		this.edad = edad;
		this.carrera = carrera;
		this.fechaInscripcion = fechaInscripcion;
	}
	
	public int getFolio() {
		return folio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(String fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	
	@Override
	public String toString() {
		return "Alumno [folio=" + folio + ", nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", fechaInscripcion="
				+ fechaInscripcion + "]";
	}
	
}
