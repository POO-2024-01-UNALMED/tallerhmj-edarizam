package futbol;
public class Portero extends Futbolista{
	
	public short golesRecibidos;
	public byte dorsal;
	
	//Constructor
	public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal2) {
		super(nombre, edad, posicion);
		this.golesRecibidos = golesRecibidos;
		dorsal = dorsal2;
	}
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal2) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		dorsal = dorsal2;
	}
	
	//Methods
	@Override
	public String toString() {
		return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() +
				" con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
	}
	
	public int compareTo(Portero portero) {
		int golesRecbidosDiff = this.golesRecibidos - portero.golesRecibidos;
		return (golesRecbidosDiff > 0) ? golesRecbidosDiff : -1 * golesRecbidosDiff;
	}
	
}
