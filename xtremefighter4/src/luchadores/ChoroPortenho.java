package luchadores;

public class ChoroPortenho extends Luchador{
        int dmg=0;
	public ChoroPortenho(){
		this.nombre="CHORO PORTENHO!!!!";		
	}
	
        @Override
	public String golpear(){
               dmg=50;
		return("ALETAZO MARINO!!!");
                
	}
	
        @Override
	public String patear(){
               dmg=50;
		return("PATADA DE LA JAIBAAAAA!!!");
	}

        @Override
	public String saltar(){
                dmg=50;
		return("PIQUERO INFERNAAAAAL!!!");
	}
        @Override
        public int getdmg(){
        return dmg;
        }
        

	
	

	
}
