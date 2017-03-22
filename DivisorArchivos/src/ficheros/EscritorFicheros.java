package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EscritorFicheros {
	private FileWriter fichero;
	private PrintWriter pW;
	private BufferedWriter bW;
	private ArrayList<String> imprimible;
	public EscritorFicheros(String ruta,ArrayList<String> imprimible)
	{
		this.imprimible=imprimible;
		
		crearFichero(ruta);
	}

	private void crearFichero(String ruta)
	{
		try {
			fichero=new FileWriter(ruta);
			pW=new PrintWriter(fichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String linea : imprimible) {
			pW.println(linea);
		}
		try {
			fichero.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
