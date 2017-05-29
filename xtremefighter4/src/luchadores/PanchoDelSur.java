package luchadores;

public class PanchoDelSur extends Luchador{
        int dmg;
	public PanchoDelSur(){
		this.nombre="PANCHO DEL SUR!!!!";		
	}
	
        @Override
	public String golpear(){
                dmg=50;
		return("PU�O DEL HOCICON!!!");
	}
	
        @Override
	public String patear(){
                dmg=50;
		return("PATADA SATELITEEE!!!");
	}

        @Override
	public String saltar(){
                dmg=50;
		return("JOJOI!!!");
	}
        @Override
        public int getdmg(){
        return dmg;
        }


}
