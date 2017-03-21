package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorFicheros {
	private File fichero;
	private FileWriter fW;
	private BufferedWriter bW;
	public EscritorFicheros(String ruta)
	{
		fichero=new File(ruta);
		crearFichero();
	}

	private void crearFichero()
	{
		try {
			fW=new FileWriter(fichero);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		private void escribirFichero(String linea)
		{

			import java.io.*;

			public class EscribeFichero
			{
			    public static void main(String[] args)
			    {
			        FileWriter fichero = null;
			        PrintWriter pw = null;
			        try
			        {
			            fichero = new FileWriter("c:/prueba.txt");
			            pw = new PrintWriter(fichero);

			            for (int i = 0; i < 10; i++)
			                pw.println("Linea " + i);

			        } catch (Exception e) {
			            e.printStackTrace();
			        } finally {
			           try {
			           // Nuevamente aprovechamos el finally para 
			           // asegurarnos que se cierra el fichero.
			           if (null != fichero)
			              fichero.close();
			           } catch (Exception e2) {
			              e2.printStackTrace();
			           }
			        }
			    }
			}
			
		}
}
