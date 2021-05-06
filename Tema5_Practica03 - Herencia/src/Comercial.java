
public class Comercial extends Empleado{
	private double comision;
	
	/**
	 * Constructor por defecto
	 */
	public Comercial() {}

	// Constructor con parámetros
	/**
	 * 
	 * @param nombre establece el nombre del comercial
	 * @param edad establece la edad del comercial
	 * @param salario establece el salario del comercial
	 * @param comision establece la comision del comercial
	 */
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	/**
	 * 
	 * @return devuelve la comision del comercial
	 */
	public double getComision() {
		return comision;
	}
	/**
	 * 
	 * @param comision establece la comision del comercial
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}

	/**
	 * Aplica el plus al comercial si la edad es mayor que 30 y la comision es mayor que 200
	 */
	public void aplicaPlus() {
		if(edad > 30 && comision > 200) {
			salario = salario + plus;
		}
	}
	
	// Método toString
	
	/**
	 * Muestra los datos del comercial
	 */
	@Override
	public String toString() {
		return "Comercial " + nombre + "\n Salario: "+ salario +"\n";
	}

	
	
	
	
	
}
