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
public class CritereMarque implements Critere{
  
    private String marque;

    public CritereMarque(String marque) {
        this.marque = marque;
    }
    
    
    
    @Override
    public boolean estSatisfaitPar(Voiture v) {
        return v.getMarque().equals(marque);
            
    }
    
}
