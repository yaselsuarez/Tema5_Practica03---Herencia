
public class Principal {
	
	public static void main(String[] args) {	
		
		Repartidor repartidor = new Repartidor("Enrique", 22, 1000, "zona 3");		
		Comercial comercial = new Comercial("Maria", 35, 1000, 300);		

		/**
		 * Aplica plus si menor de 25 y reparte en la zona 3
		 */
		repartidor.aplicaPlus();
		
		/**
		 * Aplica el plus si es mayor que 30 años y cobra una comisión de mas de 200 euros
		 */
		comercial.aplicaPlus();

		/**
		 * Muestra el repartidor
		 */
		System.out.println(repartidor);
		
		/**
		 * Muestra el comercial
		 */
		System.out.println(comercial);
	}

}
