package luchadores;

public class ChoroPortenho extends Luchador{
	public ChoroPortenho(){
		this.nombre="CHORO PORTENHO!!!!";		
	}
	
        @Override
	public String golpear(){
               
		return("ALETAZO MARINO!!!");
                
	}
	
        @Override
	public String patear(){
               
		return("PATADA DE LA JAIBAAAAA!!!");
	}

        @Override
	public String saltar(){
                
		return("PIQUERO INFERNAAAAAL!!!");
	}
        @Override
        public int getdmg(){
        return 50;
        }
        

	
	

	
}
