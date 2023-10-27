package previosPasados;

public class Negocio {

	public static <E> void main(String[] args) {

		Carrusel <E> carrusel = new Carrusel <E> ();
		// Creamos muchos vagones aleatorios
		for(int i=0; i<10;i++) {
			carrusel.crearVagon();
		}
		
		System.out.println("Abriendo el parque y encendiendo el carrusel...");
		System.out.println("Inicimos a dar las vueltas");
		int vueltas=5;
		carrusel.encenderCarrusel(vueltas);
		System.out.println("Cerrando el parque...");
		carrusel.cerrarParque();
		carrusel.imprimirFinalDia();
		
		//System.out.println("Vagones del carrusel");
		//carrusel.imprimirCarrusel();
		//System.out.println("Vagones disponibles");
		//carrusel.imprimirVagonesDisponibles();

	}

}
