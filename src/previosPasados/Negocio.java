package previosPasados;

public class Negocio {

	public static void main(String[] args) {

		Carrusel carrusel = new Carrusel();
		// Creamos muchos vagones aleatorios
		for(int i=0; i<10;i++) {
			carrusel.crearVagon();
		}
		
		System.out.println("Abriendo el parque y encendiendo el carrusel...");
		carrusel.encenderCarrusel(5);
		System.out.println("Cerrando el parque...");
		carrusel.cerrarParque();
		carrusel.imprimirFinalDia();
		
		//System.out.println("Vagones del carrusel");
		//carrusel.imprimirCarrusel();
		//System.out.println("Vagones disponibles");
		//carrusel.imprimirVagonesDisponibles();

	}

}
