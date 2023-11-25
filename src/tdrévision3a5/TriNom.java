/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdrévision3a5;

import java.util.Comparator;

/**
 *
 * @author sanabenfadhel
 */
public class TriNom implements Comparator<Client>{

    @Override
    public int compare(Client o1, Client o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
    
}
