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
public class ElTarro extends Luchapoyo{
    Luchador luchador;
    int dmg=25;
    boolean mesp=false;
    String nombre="y ElTarro";
    public ElTarro(Luchador luchador){
    this.luchador=luchador; 
        System.out.println(this.nombre);
    }
     
    @Override
    public String usarMovimientoEspecial(){
                mesp=true;
		return luchador.usarMovimientoEspecial()+getPoderapoyo();
	}
    public String getPoderapoyo(){
        
        return " \n Se saco la chucha!";
    }
    @Override
    public String golpear(){
        return this.luchador.golpear();
    }
    @Override
    public String patear(){
        return this.luchador.patear();
    }
    @Override
    public String saltar(){
        return this.luchador.saltar();
    }
    @Override
    public int getdmg(){
         if(mesp==false){
            
            //dmg=0;
            return luchador.getdmg();
        }
        System.out.println("+"+dmg);
        return this.dmg+luchador.getdmg();
    }

}
