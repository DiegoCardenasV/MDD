package luchadores;

public class MineroWarrior extends Luchador{
        int dmg=0;
	public MineroWarrior(){
		this.nombre="MINERO WARRIORRR!!!";
	}
        @Override
	public String golpear(){
                dmg=50;
		return("PU�O DEL PIRQUINEROOOO!!!");
	}
	
        @Override
	public String patear(){
                dmg=50;
		return("PATADA DEL CATEADOOOOOOR!!!");
	}

        @Override
	public String saltar(){
                dmg=50;
		return("SALTO EXPLOSIVOOOOO!!!");
	}
        @Override
        public int getdmg(){
        return dmg;
        }

 
	

}
