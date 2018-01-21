/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substrings;

/**
 *
 * @author Tom van Etten
 */
public class Substrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boek boekje = new Boek();
        String boek = boekje.boek1 + boekje.boek2_1 + boekje.boek2_2 + boekje.boek3;
        String pattern = "a";
       
        KnuthMorrisPratt zoeken = new KnuthMorrisPratt();
        int aantal = zoeken.KMPSearch(pattern, boek);
        System.out.println("Aantal KnuthMorrisPratt = " + aantal);
        System.out.println("Aantal Karakterverglijkingen = " + zoeken.getVerglijken());

        System.out.println();
        
        BoyerMoore zoek = new BoyerMoore(pattern);
        int index = zoek.search(boek);
        System.out.println("Aantal Boyer moore = " + index);
        System.out.println("Aantal Karakterverglijkingen = " + zoek.getTeller());
        
        
    }

}
