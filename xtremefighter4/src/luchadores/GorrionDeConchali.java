package luchadores;

public class GorrionDeConchali extends Luchador{
        int dmg=0;
	public GorrionDeConchali(){
		this.nombre="GORRION DE CONCHALI!!!!";		
	}
	
        @Override
	public String golpear(){
                dmg=50;
		return("PU�O CEBOLLERO!!!");
	}
	
        @Override
	public String patear(){
                dmg=50;
		return("PATADA LACRIMOGENA!!!");
	}

        @Override
	public String saltar(){
                dmg=50;
		return("PIQUERO ROMANTICO!!!");
	}
        @Override
        public int getdmg(){
        return dmg;
        }

  

}
