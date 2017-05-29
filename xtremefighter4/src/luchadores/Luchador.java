package luchadores;
import poderes.MovimientoEspecial;


public abstract class Luchador {
	public String nombre;
	public MovimientoEspecial miMovimiento;
        
   
	abstract public String golpear();
		
	abstract public String patear();
		
	abstract public String saltar();
		
	public String usarMovimientoEspecial(){
		return miMovimiento.ejecutarMovimientoEspecial();
	}
        public abstract int getdmg();
}
