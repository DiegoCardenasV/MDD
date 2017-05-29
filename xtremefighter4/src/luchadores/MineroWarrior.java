package luchadores;

public class MineroWarrior extends Luchador{

	public MineroWarrior(){
		this.nombre="MINERO WARRIORRR!!!";
	}
        @Override
	public String golpear(){

		return("PU�O DEL PIRQUINEROOOO!!!");
	}
	
        @Override
	public String patear(){

		return("PATADA DEL CATEADOOOOOOR!!!");
	}

        @Override
	public String saltar(){

		return("SALTO EXPLOSIVOOOOO!!!");
	}
        @Override
        public int getdmg(){
        return 50;
        }

 
	

}
