package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.lessons.java.christmas.pojo.Regalo;

public class Main {

	public static void main(String[] args) {
		
//		List<String> regali = new ArrayList<>();
//		
//		Scanner in = new Scanner(System.in);
//
//		while (true) {
//			
//			System.out.print("Inserisci il nome del regalo: ");
//            String regalo = in.nextLine();
//            
//            regali.add(regalo);
//            
//            System.out.println("Lunghezza della lista: " + regali.size());
//            
//            System.out.println("Vuoi inserire un altro regalo? ");
//            String altroRegalo = in.nextLine();
//            
//            if (altroRegalo.equals("no")) {
//				break;
//			}
//		}
//		
//		
//        Collections.sort(regali);
//
//        
//        System.out.println("Lista dei regali:");
//        for (String regalo : regali) {
//            System.out.println(regalo);
//        }
		
		List<Regalo> listaRegali = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);

		while (true) {
			
			System.out.print("Inserisci il nome del regalo: ");
            String nomeRegalo = in.nextLine();
            
            System.out.print("A chi è destinato il regalo? ");
            String destinatarioRegalo = in.nextLine();
            
            Regalo regalo = new Regalo( nomeRegalo, destinatarioRegalo );
            listaRegali.add(regalo);
            
            System.out.println("Lunghezza della lista: " + listaRegali.size());
            
            System.out.println("Vuoi inserire un altro regalo? ");
            String altroRegalo = in.nextLine();
            
            if (altroRegalo.equals("no")) {
				break;
			}
		}
		
		 System.out.print("Vuoi ordinare la lista per nome o per destinatario? ");
	     String modoOrdinamento = in.nextLine();
		
	     if (modoOrdinamento.equals("nome")) {
	            Collections.sort(listaRegali, Comparator.comparing(regalo -> regalo.getNome()));
	        } else if (modoOrdinamento.equals("destinatario")) {
	            Collections.sort(listaRegali, Comparator.comparing(regalo -> regalo.getDestinatario()));
	        }

        
        System.out.println("Lista dei regali:");
        for (Regalo regalo : listaRegali) {
            System.out.println("Nome: " + regalo.getNome() + ", Destinatario: " + regalo.getDestinatario());
        }
	}

}
