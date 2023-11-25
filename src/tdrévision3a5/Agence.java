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
public class Agence {

    private String nom;
    private ListVoitures parkVo;
    private Map<Client, ListVoitures> ClientVoitureLoue;

    public Agence(String nom) {
        this.nom = nom;
        parkVo = new ListVoitures();
        ClientVoitureLoue = new HashMap<>();

    }

    public void ajoutVoiture(Voiture v) throws VoitureException {

        parkVo.ajoutVoiture(v);

    }

    public void suppVoiture(Voiture v) throws VoitureException {

        parkVo.supprimeVoiture(v);
    }

    public void loueClientVoiture(Client cl, Voiture v) throws VoitureException {
        ListVoitures list = ClientVoitureLoue.get(cl);
        if (list == null) {
            list = new ListVoitures();
        }
        this.suppVoiture(v);
        list.ajoutVoiture(v);
        ClientVoitureLoue.put(cl, list);
    }

    public void retourClientVoiture(Client cl, Voiture v) throws VoitureException {

        ListVoitures list = ClientVoitureLoue.get(cl);

        list.supprimeVoiture(v);

        this.ajoutVoiture(v);
        ClientVoitureLoue.put(cl, list);
    }

    public List<Voiture> selectVoitureSelonCritere(Critere c) {

        ArrayList<Voiture> li = new ArrayList<>();

        for (Voiture v : parkVo.getVoitures()) {
            if (c.estSatisfaitPar(v)) {
                li.add(v);
            }
        }
        return li;
    }

    public Set<Client> ensembleClientsLoueurs() {

        return ClientVoitureLoue.keySet();
    }

    public Collection<ListVoitures> collectionVoituresLouees() {

        return ClientVoitureLoue.values();
    }

    public void afficheLesClientsEtLeursListesVoitures() {

        for (Map.Entry<Client, ListVoitures> mp : ClientVoitureLoue.entrySet()) {
            System.out.println("Client :" + mp.getKey());
            System.out.println("List Voitures :");
            mp.getValue().affiche();

        }

    }

    public Map<Client, ListVoitures> triCodeCroissant() {
        TreeMap<Client, ListVoitures> tre = new TreeMap<>();//Comparable
        tre.putAll(ClientVoitureLoue);
        return tre;
    }

    public Map<Client, ListVoitures> triNomCroissant() {
        TreeMap<Client, ListVoitures> tre = new TreeMap<>(new TriNom());
        tre.putAll(ClientVoitureLoue);
        return tre;
    }
}
