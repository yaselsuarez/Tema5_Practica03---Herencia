/**
	 * Superclase que modela los atributos básicos 
	 * de un empleado
	 * 
	 * @author Yasel
	 * @version 1.0
	 */
public abstract class  Empleado {
	
	/**
	 * @nombre atributo que guarda el nombre del empleado
	 * @edad atributo que guarda la edad del empleado
	 * @salario atributo que guarda el salario del empleado
	 * @plus atributo de clase que guarda el plus aplicable a los empleados
	 */
	protected String nombre;
	protected int edad;
	protected double salario;
	protected static final double plus=300;
	
	/** 
	 * Constructor por defecto
	 */
	public Empleado() {}
	
	/**
	 * Constructor con parámetros
	 * @param nombre contiene el nombre del empleado
	 * @param edad	contiene la edad el empleado
	 * @param salario contiene el salario del empleado
	 */
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	/** Devuelve el nombre del empleado
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Establece el nombre del empleado
	 * @param nombre contiene el nombre del empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Devuelve la edad del empleado
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Establece la edad del empleado
	 * @param edad contiene la edad del empleado
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * Devuelve el salario del empleado
	 * @return salario contiene el salario del empleado
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * Establece el salario del empleado
	 * @param salario contiene el salario del empleado
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	/**
	 * Devuelve el plus del empleado
	 * @return plus
	 */
	public static double getPlus() {
		return plus;
	}

	/**
	 * Devuelve toda la informacion del Empleado
	 * @return Devuelve todos los datos del empleado
	 */
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}
		
}


