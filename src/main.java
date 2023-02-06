import java.util.Scanner;

public class main {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Ingrese el identificador o identificadores que quiera analizar separados por ';': ");
		String nombre = in.next();
		String [] nombres=nombre.split(";");
		
		
		
		
		Identificacion identi = new Identificacion();
		identi.Conectar();
		identi.getConection();
		BDPrestigio Prestigio = new BDPrestigio();
		Comunicacion Comunicacion= new Comunicacion();
		Prestigio.Conectar();
		Prestigio.getConection();
		Comunicacion.Conectar();
		Comunicacion.getConection();
		
		
		
		for(int i=0;i<nombres.length;i++) {
	

			int found =nombres[i].indexOf("//");
			int ult=nombres[i].lastIndexOf("/");
			int desde =found+2;
			
		
			String cadena=nombres[i].substring(desde, ult);
			int ultimo = cadena.indexOf("/");
			String cadenaFin=cadena.substring(0, ultimo);
			
			
			int Prest = Prestigio.portales(cadenaFin);
			int Com = Comunicacion.portales(cadenaFin);
			
			 
			String Iden=identi.portales(nombres[i]);
		     DatosApi ident= new DatosApi();
			 int[] datos=ident.datos(Iden);
			 
			 int Standard=2;
			 int Access=3;
		
	    System.out.println("Para el conjunto de datos " +nombres[i]);	 
			
		EvaluadorDataset meloda = new EvaluadorDataset(datos[0],datos[1],datos[2],datos[3],Access,Standard,Prest,Com);
	
		meloda.run();
		
		System.out.println("");
		
		
		}
		
		Prestigio.desconectar();
		Comunicacion.desconectar();
		identi.desconectar();
	
	
	}
	
}
