package clasesIMC;


public class IMCService {

	public static float calcula (float peso,float altura)
	{
		float imc = 0;
			
			imc = peso/(altura*altura);
		
		return imc;
	}
	
	public static String traduceIMC (float imc) 
	{
		String mensaje = null;
		
			if (imc<16)
				mensaje = "DESNUTRIDO";
			else if (imc>=16 && imc<18.5) 
					mensaje = "BAJOPESO";
				 else if (imc>=18.5 && imc < 25) 
					 	mensaje = "NORMAL";
				 	  else if (imc>=25 && imc < 31) 
				 		  	mensaje = "SOBREPESO";
				 	  else mensaje ="OBESO";
		
		return mensaje;
	}
	
	
}
