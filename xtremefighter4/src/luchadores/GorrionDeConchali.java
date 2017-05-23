package luchadores;

public class GorrionDeConchali extends Luchador{

	public GorrionDeConchali(){
		this.nombre="GORRION DE CONCHALI!!!!";		
	}
	
        @Override
	public String golpear(){
       
		return("PU�O CEBOLLERO!!!");
	}
	
        @Override
	public String patear(){
      
		return("PATADA LACRIMOGENA!!!");
	}

        @Override
	public String saltar(){
   
		return("PIQUERO ROMANTICO!!!");
	}
        @Override
        public int getdmg(){
        return 50;
        }

  

}
