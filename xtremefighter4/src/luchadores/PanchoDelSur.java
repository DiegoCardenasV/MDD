package luchadores;

public class PanchoDelSur extends Luchador{

	public PanchoDelSur(){
		this.nombre="PANCHO DEL SUR!!!!";		
	}
	
        @Override
	public String golpear(){

		return("PU�O DEL HOCICON!!!");
	}
	
        @Override
	public String patear(){

		return("PATADA SATELITEEE!!!");
	}

        @Override
	public String saltar(){

		return("JOJOI!!!");
	}
        public int getdmg(){
        return 50;
        }


}
