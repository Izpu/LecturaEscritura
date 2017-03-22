package principal;

import java.util.ArrayList;
import java.util.Iterator;

import ficheros.EscritorFicheros;
import ficheros.LectorFicheros;

public class Principal {
private static int largoFichero;
private static String rutaGuardado, prefijo;
private static LectorFicheros lector;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largoFichero=10;
		rutaGuardado="D:\\Salida";
		prefijo="pr";
		lector=new LectorFicheros("C:\\bdlog.txt");
		dividirImprimir();
		}
private static void dividirImprimir()
{
	int totalLineas=lector.getLectura().size();
	int enteroDivision=(int)totalLineas/largoFichero;
	int posIni=0;
	ArrayList<String> sa=new ArrayList<String>(largoFichero);
	for (int i=0;i<enteroDivision;i++)
	{
		for(int k=0;k<largoFichero;k++)
		{
			sa.add(lector.getLectura().get(i+k));
		}
		new EscritorFicheros(rutaGuardado+"\\"+prefijo+i+".txt", sa);
		sa.clear();
	}
}
}
