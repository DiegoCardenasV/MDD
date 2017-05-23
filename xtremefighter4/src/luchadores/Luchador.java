package luchadores;
import poderes.MovimientoEspecial;


public abstract class Luchador {
	public String nombre;
	public MovimientoEspecial miMovimiento;
        
    public String golpear;
	abstract public String golpear();//{
		//return "GOLPE POR DEFECTOOOO";
		//};
	abstract public String patear();//{
		//return "PATADA POR DEFECTOOO!";
		//}
	abstract public String saltar();//{
		//return "SALTO POR DEFECTOOOO";
		//}
	public String usarMovimientoEspecial(){
		return miMovimiento.ejecutarMovimientoEspecial();
	}
        public abstract int getdmg();
}
