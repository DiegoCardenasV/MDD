/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoyo;
import luchadores.Luchador;
/**
 *
 * @author Diego-PC
 */
public abstract class Luchapoyo extends Luchador {
        @Override
    public abstract String usarMovimientoEspecial();
     @Override
	public String golpear(){
		return null;
	}
	
        @Override
	public String patear(){
		return null;
	}

        @Override
	public String saltar(){
		return null;
	}
  
}