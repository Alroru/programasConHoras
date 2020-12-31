package es.studium.HORASPRACTICA1;

import java.util.Scanner;

public class CambiaFormatoHoras
{

	public static void main(String[] args)
	{
		Scanner teclado=new Scanner(System.in);;
		//Variables a usar
		int hora;
		int minutos;
		//Indicamos el rango del uso del programa
		System.out.println("¿Qué hora es?\n(Escribe entre 0 y 23 horas)");
		hora=teclado.nextInt();
		System.out.println("¿Y cuántos minutos?\n(Escribe entre 0 y 59 minutos)");
		minutos=teclado.nextInt();
		teclado.close();
		//Contemplamos todas las posibilidades
		if((hora>23)||(minutos>59))//Si el usuario no ha dado los datos correctos que se le han pedido se muestra este mensaje
		{
			System.out.println("Usted se ha equivocado al leer");
		}
		else if(hora==7)		
		{
			System.out.println("Son las "+hora+": "+minutos+" a.m");	
		}
		else if(hora==8) 
		{System.out.println("Son las "+hora+": "+minutos+" a.m");	
		}
		else if(hora==9) 
		{System.out.println("Son las "+hora+": "+minutos+" a.m");	
		}
		else if(hora==10) 
		{System.out.println("Son las "+hora+": "+minutos+" a.m");	
		}
		else if(hora==11) 
		{System.out.println("Son las "+hora+": "+minutos+" a.m");	
		}
		else if(hora==12) 
		{System.out.println("Son las "+hora+": "+minutos+" p.m");	
		}
		else if(hora==13) 
		{System.out.println("Son la 1: "+minutos+" p.m");	
		}
		else if(hora==14) 
		{System.out.println("Son las 2: "+minutos+" p.m");	
		}
		else if(hora==15) 
		{System.out.println("Son las 3: "+minutos+" p.m");	
		}
		else if(hora==16) 
		{System.out.println("Son las 4: "+minutos+" p.m");	
		}
		else if(hora==17) 
		{System.out.println("Son las 5: "+minutos+" p.m");	
		}
		else if(hora==18) 
		{System.out.println("Son las 6: "+minutos+" p.m");	
		}
		else if(hora==19) 
		{System.out.println("Son las 7: "+minutos+" p.m");	
		}
		else if(hora==20) 
		{System.out.println("Son las 8: "+minutos+" p.m");	
		}
		else if(hora==21) 
		{System.out.println("Son las 9: "+minutos+" p.m");	
		}
		else if(hora==22) 
		{System.out.println("Son las 10: "+minutos+" p.m");	
		}
		else if(hora==23) 
		{System.out.println("Son las 11: "+minutos+" p.m");	
		}
		else if(hora==0) 
		{System.out.println("Son las 00: "+minutos+" a.m");	
		}
		else if(hora==1) 
		{System.out.println("Son la 1: "+minutos+" a.m");
		}
		else if(hora==2) 
		{System.out.println("Son las 2: "+minutos+" a.m");	
		}
		else if(hora==3) 
		{System.out.println("Son las 3: "+minutos+" a.m");	
		}
		else if(hora==4) 
		{System.out.println("Son las 4: "+minutos+" a.m");	
		}
		else if(hora==5) 
		{System.out.println("Son las 5: "+minutos+" a.m");	
		}
		else if(hora==6) 
		{System.out.println("Son las 6: "+minutos+" a.m");	
		}
	}
}






