package com.codingdojo.arteabstracto;

import java.util.ArrayList;
import java.util.Collections;

import com.codingdojo.arteabstracto.model.Arte;
import com.codingdojo.arteabstracto.model.Escultura;
import com.codingdojo.arteabstracto.model.Pintura;

public class Museo {

	public static void main(String[] args) {
		Pintura pintura1 = new Pintura("Pintura1", "Autor1", "Descripción1", "Tipo1");
		Pintura pintura2 = new Pintura("Pintura2", "Autor2", "Descripción2", "Tipo2");
		Pintura pintura3 = new Pintura("Pintura3", "Autor3", "Descripción3", "Tipo3");
		
		Escultura escultura1 = new Escultura("Escultura1", "Autor1", "Descripción1", "Material1");
		Escultura escultura2 = new Escultura("Escultura2", "Autor2", "Descripción2", "Material2");
		
		pintura1.verArte();
		pintura2.verArte();
		pintura3.verArte();
		
		escultura1.verArte();
		escultura2.verArte();
		
		System.out.println("\nBonus Ninja\n - - - - -");
		
		ArrayList<Arte> museo = new ArrayList<Arte>();
		museo.add(pintura1);
		museo.add(pintura2);
		museo.add(pintura3);
		museo.add(escultura1);
		museo.add(escultura2);
		
		Collections.shuffle(museo);
		
		for(Arte arte : museo) {
			arte.verArte();
		}
	}

}
