import apoyo.ElTarro;
import apoyo.Illuminatikid;
import apoyo.Nosepeleen;
import java.util.Scanner;

import poderes.Agarrador;
import poderes.AtacadorRapido;
import poderes.LanzaPoderes;
import poderes.MovimientoEspecial;
import luchadores.ChoroPortenho;
import luchadores.GorrionDeConchali;
import luchadores.HalconDeChicureo;
import luchadores.Luchador;
import luchadores.MineroWarrior;
import luchadores.PanchoDelSur;

public class FightEngine {
	public FightEngine(){
		String luchadorPlayer1;
                String luchadorapoyo1;
		String accionLuchadorIn;
		int accionLuchador;
                int dmg;
		String opcionChoroPortenho = new String("1");
		String opcionMineroWarrior = new String("2");
		String opcionHalconDeChicureo = new String("3");
		String opcionGorrionDeConchali= new String("4");
		String opcionPanchoDelSur = new String("5");
                String opcionElTarro= new String("6");
                String opcionIlluminati= new String("7");
                String opcionNosepeleen= new String("8");
		
	    System.out.println("Empieza el juego!!!");
		System.out.println("Selecciona tu luchador (1 o 2): 1-Choro Portenho 2-Minero Warrior  3-Halcon de Chicureo  4-Gorrion de Conchali  5-Pancho del Sur");
		
		Scanner seleccion = new Scanner(System.in);
		
		luchadorPlayer1 = seleccion.nextLine();
	
		System.out.println(luchadorPlayer1);
		
		
		MovimientoEspecial nuevoMovimiento=null;
		Luchador player1=null;
		if (luchadorPlayer1.equals(opcionChoroPortenho)){
			player1 = new ChoroPortenho();
			nuevoMovimiento = new LanzaPoderes();
		}
                else if (luchadorPlayer1.equals(opcionMineroWarrior)){
			player1 = new MineroWarrior();
			nuevoMovimiento = new LanzaPoderes();		
		}
                else if (luchadorPlayer1.equals(opcionHalconDeChicureo)){
			player1 = new HalconDeChicureo();
			nuevoMovimiento = new AtacadorRapido();
		}
                else if (luchadorPlayer1.equals(opcionGorrionDeConchali)){
			player1 = new GorrionDeConchali();
			nuevoMovimiento = new AtacadorRapido();
			}
                else if(luchadorPlayer1.equals(opcionPanchoDelSur)){
			player1 = new PanchoDelSur();
			nuevoMovimiento = new Agarrador();
			}
		
		player1.miMovimiento = nuevoMovimiento;
                
		System.out.println("Selecciona tu luchador de apoyo (6, 7 o 8): 6-El Tarro 7-Niño Illuminati  8-No se peleen");
		
		Scanner seleccion2 = new Scanner(System.in);
		
		luchadorapoyo1 = seleccion2.nextLine();
                System.out.println(player1.nombre);
                
                if (luchadorapoyo1.equals(opcionElTarro)){
			player1 = new ElTarro(player1);
		}
                else if (luchadorapoyo1.equals(opcionIlluminati)){
                        player1 = new Illuminatikid(player1);
                }
                else if(luchadorapoyo1.equals(opcionNosepeleen)){
                        player1 = new Nosepeleen(player1);
                }
		
                
		System.out.println(" inicia la batalla!");

				System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-LANZAR PODER");

				accionLuchadorIn =seleccion.nextLine();
				accionLuchador = Integer.parseInt(accionLuchadorIn);
				
				switch(accionLuchador) {
					case 1: System.out.println(player1.golpear());
							break;
					case 2: System.out.println(player1.patear());
							break;
					case 3: System.out.println(player1.saltar());
							break;
					case 4: System.out.println(player1.usarMovimientoEspecial());
							break;				
				}
		dmg=player1.getdmg();
                System.out.println(dmg);
		System.out.println("FIN DEL JUEGO. 2...");

	}

}
