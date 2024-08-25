package futbol;
public class Jugador extends Futbolista {
	
	//Attributes
	public short golesMarcados;
	public byte dorsal;
	
	//Constructor
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	//Methods
	public int compareTo(Futbolista futbolista) {
		int edadDiff = this.getEdad() - futbolista.getEdad();
		return (edadDiff > 0) ? edadDiff : -1 * edadDiff;
	}
	
	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() +
				" con el dorsal " + dorsal + ". Ha marcado" + golesMarcados;
	}
	
	@Override
	public boolean jugarConLasManos() {
		return false;
	}
	
	
	
	
	
}
