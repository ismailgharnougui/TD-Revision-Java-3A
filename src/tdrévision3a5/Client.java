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
public class Client implements Comparable<Client>{
 private int code; private
String nom;
private String
prenom;

    public Client(int code, String nom, String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }

public int getCode() { return code;
}
public void setCode(int code) {
this.code = code; }
public String getNom() { return nom;
}
public void setNom(String nom) {
this.nom = nom; }
public String getPrenom() { return prenom;
}
public void setPrenom(String prenom) {
this.prenom = prenom; }
//public int hashCode() { //à completer
//}

   


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        if (this.code != other.code) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "Client{" + "code=" + code + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public int compareTo(Client o) {
        return this.code-o.code;
    }
  
}
