package luchadores;

public class HalconDeChicureo extends Luchador{

	public HalconDeChicureo(){
		this.nombre="HALCON DE CHICUREO!!!!";		
	}
	
        @Override
	public String golpear(){
   
		return("BRAZO BOOMERANG!!!");
	}
	
        @Override
	public String patear(){
    
		return("PATADA DE BIEN LEJOS!!!");
	}

        @Override
	public String saltar(){
          
		return("SALTO DEL AVION!!!");
	}
        @Override
        public int getdmg(){
        return 50;
        }

 
	

	
}
