package aaaa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aa a;
		Vector<String> vec = new Vector<String>();
		HashMap<String,String> map = new HashMap<String,String>();
		String arr[];
		List<String> list = new ArrayList<String>();
		list.add("Hola");


		int nFilas = 5;

		int nColumnas = 4;

		int [][] matriz = new int[nFilas][nColumnas];

		for (int i=0;i<nFilas;i++){

		  for (int j=0;j<nColumnas;j++){

		   System.out.println("Elemento i:"+i+"-Elemento j:"+j+"->:"+matriz[i][j]);

		 }

		}
	}

}
