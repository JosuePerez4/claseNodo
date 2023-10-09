package previosPasados;

public class Vagon {
	
	private String id;
	// Si está disponible, significa que no está conectado al carrusel
	private boolean disponible;
	private int nivelDesgaste;
	
	public Vagon(String id) {
		this.id = id;
		this.disponible = true;
		this.nivelDesgaste = 3000;
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
		return nivelDesgaste;
	}

	public void setNivelDesgaste(int nivelDesgaste) {
		this.nivelDesgaste = nivelDesgaste;
	}
	
	public void actualizarNivelDesgaste (int desgaste) {
		this.nivelDesgaste -= desgaste;
		if(this.nivelDesgaste <= 0) {
			setDisponible(true);
			this.nivelDesgaste = 3000;
		}
	}

	@Override
	public boolean equals(Object obj) {
		Vagon v = (Vagon) obj;
        return (this.getId().equals(v.getId()));
    }
}
