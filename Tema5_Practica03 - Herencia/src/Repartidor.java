
public class Repartidor extends Empleado{
	private String zona;
	
	/**
	 * Constructor por defecto
	 */
	public Repartidor() {}
	
	/**
	 * Constructor con parámetros
	 * @param nombre atributo que guarda el nombre del repartidor
	 * @param edad atributo que guarda la edad del repartidor
	 * @param salario atributo que guarda el salario del repartidor
	 * @param zona atributo que guarda la zona a repartir
	 */
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	// Métodos Get y Set
	/**
	 * @return devuelve la zona a repartir
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * 
	 * @param zona establece la zona del repartidor
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}

	// Método Plus
	/**
	 * Aplica el plues si la edad es menor que 25 y la zona es igual a zona 3
	 */
	public void aplicaPlus() {
		if (edad < 25 && zona.equals("zona 3")) {
			salario = salario + plus;
		}
	}
	
	// Método toString
	@Override
	/**
	 * @return devulve los datos del repartidor
	 */
	public String toString() {
		return "Repartidor " + nombre + "\n Salario: "+ salario +"\n";
	}
	
	
}
