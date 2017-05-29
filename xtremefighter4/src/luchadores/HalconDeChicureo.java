package luchadores;

public class HalconDeChicureo extends Luchador{
        int dmg;
	public HalconDeChicureo(){
		this.nombre="HALCON DE CHICUREO!!!!";		
	}
	
        @Override
	public String golpear(){
                dmg=50;
		return("BRAZO BOOMERANG!!!");
	}
	
        @Override
	public String patear(){
                dmg=50;
		return("PATADA DE BIEN LEJOS!!!");
	}

        @Override
	public String saltar(){
                dmg=50;
		return("SALTO DEL AVION!!!");
	}
        @Override
        public int getdmg(){
        return dmg;
        }

 
	

	
}
