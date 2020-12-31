package es.studium.HORASPRACTICA1;
import java.util.Scanner;
public class Saludo
{public static void main(String[] args)
{
	Scanner teclado=new Scanner(System.in);
	final int TAM=23;//Constante máximo tamaño que va a poder usar
	int hora;
	System.out.println("¿Qué hora es?\n(Escribe entre 0 y 23 horas)");//Preguntamos que hora es por pantalla
	hora=teclado.nextInt();
	teclado.close();
	if(hora==7)//Dependiendo de la hora indicada devuelve Buenos Días,Buenas Noches o Buenas tardes		
	{
		System.out.println("Buenos Días");	
	}
	else if(hora==8) 
	{System.out.println("Buenos Días");	
	}
	else if(hora==9) 
	{System.out.println("Buenos Días");	
	}
	else if(hora==10) 
	{System.out.println("Buenos Días");	
	}
	else if(hora==11) 
	{System.out.println("Buenos Días");	
	}
	else if(hora==12) 
	{System.out.println("Buenos Días");	
	}
	else if(hora==13) 
	{System.out.println("Buenas Tardes");	
	}
	else if(hora==14) 
	{System.out.println("Buenas Tardes");	
	}
	else if(hora==15) 
	{System.out.println("Buenas Tardes");	
	}
	else if(hora==16) 
	{System.out.println("Buenas Tardes");	
	}
	else if(hora==17) 
	{System.out.println("Buenas Tardes");	
	}
	else if(hora==18) 
	{System.out.println("Buenas Tardes");	
	}
	else if(hora==19) 
	{System.out.println("Buenas Tardes");	
	}
	else if(hora==20) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==20) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==21) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==22) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==23) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==0) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==1) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==2) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==3) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==4) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==5) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora==6) 
	{System.out.println("Buenas Noches");	
	}
	else if(hora>TAM)//Si el usuario supera el tamaño asignado se le muestra este mensaje
	{
		System.out.println("Usted se ha equivocado al leer");
	}
}

}
