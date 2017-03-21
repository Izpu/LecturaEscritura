package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorFicheros {
	private File fichero;
	private FileReader fr;
	private BufferedReader br;
	public LectorFicheros(String ruta)
	{
		cargarFichero(ruta);
		leerFichero();
		cerrarFichero();
	}
	private void cargarFichero(String ruta)
	{
		fichero=new File(ruta);
		try {
			fr=new FileReader(fichero);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Fin try catch
		br=new BufferedReader(fr);
	}
	private void leerFichero()
	{
		String linea;
		try {
			while((linea=br.readLine())!=null)
			{
				System.out.println(linea);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void cerrarFichero()
	{
		if(fr!=null)
		{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
