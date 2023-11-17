package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<String> regali = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);

		while (true) {
			
			System.out.print("Inserisci il nome del regalo: ");
            String regalo = in.nextLine();
            
            regali.add(regalo);
            
            System.out.println("Lunghezza della lista: " + regali.size());
            
            System.out.println("Vuoi inserire un altro regalo? ");
            String altroRegalo = in.nextLine();
            
            if (altroRegalo.equals("no")) {
				break;
			}
		}
		
		// Ordina la lista dei regali
        Collections.sort(regali);

        // Stampa la lista dei regali
        System.out.println("Lista dei regali:");
        for (String regalo : regali) {
            System.out.println(regalo);
        }
	}

}
