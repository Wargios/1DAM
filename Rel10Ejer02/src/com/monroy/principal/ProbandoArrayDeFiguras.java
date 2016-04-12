package com.monroy.principal;
import java.text.DecimalFormat;

import com.monroy.figuras.ArraydeFiguras;
import com.monroy.figuras.Figura;
import com.monroy.figuras.FiguraException;


public class ProbandoArrayDeFiguras {

	private static final int NUM_FIGURAS = 7;

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		try
		{
			ArraydeFiguras vectorfig=new ArraydeFiguras(NUM_FIGURAS);
			DecimalFormat df = new DecimalFormat("0.00");
			Figura fmayor;
			
			
			System.out.println("Array de figuras:\n" + vectorfig);
			
			fmayor=vectorfig.figuraConAreaMayor();
			System.out.println( "La figura con area mayor es un " + fmayor.getClass().getName() + " y su area es " + df.format(fmayor.area()) + "\n");
			
		}
		catch( FiguraException e)
		{
			System.out.println(e.getMessage()); // este error nunca va a darse
		}
		

	}

}
