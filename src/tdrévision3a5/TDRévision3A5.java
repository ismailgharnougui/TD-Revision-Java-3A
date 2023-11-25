/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdrévision3a5;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanabenfadhel
 */
public class TDRévision3A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agence ag=new Agence("tunis");
        
        Voiture v1=new Voiture(1222, "fiat", 70);
        Voiture v2=new Voiture(1245, "fiat", 70);
        Voiture v3=new Voiture(1233, "peugot", 100);
        Voiture v4=new Voiture(1233, "", 100);
        Client cl1=new Client(1, "nom1", "prenom1");
        
        
        try {
            ag.ajoutVoiture(v1);
        } catch (VoitureException ex) {
            System.out.println(ex);
        }
        try {
            ag.ajoutVoiture(v2);
        } catch (VoitureException ex) {
            System.out.println(ex);
        }
        try {
            ag.ajoutVoiture(v3);
        } catch (VoitureException ex) {
            System.out.println(ex);
        }
        try {
            ag.ajoutVoiture(v4);
        } catch (VoitureException ex) {
            System.out.println(ex);
        }
        
        
//        try {
//            ag.loueClientVoiture(cl1, v1);
//        } catch (VoitureException ex) {
//            System.out.println(ex);
//        }
//        try {
//            ag.loueClientVoiture(cl1, v2);
//        } catch (VoitureException ex) {
//            System.out.println(ex);
//        }
//        try {
//            ag.loueClientVoiture(cl1, v3);
//        } catch (VoitureException ex) {
//            System.out.println(ex);
//        }
//        try {
//            ag.loueClientVoiture(cl1, v1);
//        } catch (VoitureException ex) {
//            System.out.println(ex);
//        }
//        
        
        ag.afficheLesClientsEtLeursListesVoitures();
        
        
        List<Voiture> li1=ag.selectVoitureSelonCritere(new CritereMarque("fiat"));
        System.out.println(li1);
        List<Voiture> li2=ag.selectVoitureSelonCritere(new CriterePrix(100));
        
        System.out.println(li2);
        
        
         List<Voiture> li3=ag.selectVoitureSelonCritere((Voiture v)->{return v.getMarque().equals("peugot")&&v.getPrixLocation()>=90;});
        
         
        System.out.println(li3);
        
        
        List<Voiture> list=new ArrayList<>();
        list.add(v1);
        list.add(v2);
        list.add(v3);
        
        System.out.println("list filté");
        list.stream().filter(v->v.getMarque().equals("fiat")).
                forEach(e->{System.out.println(e);});
    }
    
}
