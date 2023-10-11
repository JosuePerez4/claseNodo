package previosPasados;

public class Vagon {
	
	private String id;
	// Si está disponible, significa que no está conectado al carrusel
	private boolean disponible;
	private int nivelDesgasteMaximo;
	
	public Vagon(String id, boolean disponible) {
		this.id = id;
		this.disponible = disponible;
		this.nivelDesgasteMaximo = 3000;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	public int getNivelDesgaste() {
		return nivelDesgasteMaximo;
	}

	public void setNivelDesgaste(int nivelDesgaste) {
		this.nivelDesgasteMaximo = nivelDesgaste;
	}

	// Implementaciones
	/*public void actualizarNivelDesgaste (int desgaste) {
		this.nivelDesgasteMaximo -= desgaste;
		if(nivelDesgasteMaximo <= 0) {
			setDisponible(true);
			this.nivelDesgasteMaximo = 3000;
		}
	}*/
	
	@Override
	public String toString () {
		return "Id: " + getId() + " Disponibilidad: " + isDisponible() + " Nivel de desgaste: " + getNivelDesgaste();
	}

	@Override
	public boolean equals(Object obj) {
		Vagon v = (Vagon) obj;
        return (this.getId().equals(v.getId()));
    }
}
