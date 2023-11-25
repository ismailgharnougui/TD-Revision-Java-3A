/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdrévision3a5;

import java.util.*;

/**
 *
 * @author sanabenfadhel
 */
public class ListVoitures {

    private List<Voiture> voitures;

    public ListVoitures(List<Voiture> voitures) {

        this.voitures = voitures;
    }

    public ListVoitures() {

        voitures = new ArrayList<>();

    }

    public List<Voiture> getVoitures() {

        return voitures;
    }

    public void setVoitures(List<Voiture> voitures) {

        this.voitures = voitures;
    }

    public void ajoutVoiture(Voiture v) throws VoitureException {
        if (!voitures.contains(v)) {
            voitures.add(v);
        } else {
            throw new VoitureException("la voiture existe déjà");
        }

    }

    public void supprimeVoiture(Voiture v) throws VoitureException {
        if (voitures.contains(v)) {
            voitures.remove(v);
        } else {
            throw new VoitureException("la voiture n'existe pas");
        }
    }

    

    public int size() {
        return voitures.size();
    }

    public void affiche() { // à completer
//    for(Voiture v:voitures)
//    {
//        System.out.println(v);
//    }
    for(int i=0;i<size();i++)
    {
        System.out.println(voitures.get(i));
    }
    }
}
