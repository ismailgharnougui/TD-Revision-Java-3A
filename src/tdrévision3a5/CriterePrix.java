/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdrévision3a5;

/**
 *
 * @author sanabenfadhel
 */
public class CriterePrix implements Critere{
    private float prix;

    public CriterePrix(float prix) {
        this.prix = prix;
    }

    @Override
    public boolean estSatisfaitPar(Voiture v) {
        return v.getPrixLocation()>=prix;
    }
    
    
}
