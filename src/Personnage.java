import java.awt.*;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author io366020
 */



public class Personnage {
    
    //les attributs
    
    private String famille;  //attribut famille
    private String nom;      //attribut nom
    
    private int valeur;      //attribut valeur de type int
    private Image photo;      //attribut photo de type image
    
    
    
    //Constructeur par defaut 
    public Personnage(){
        this.famille = "anonyme";
        this.nom = "anonyme";
        this.valeur = 0;
        this.photo = new ImageIcon(getClass().getResource("")).getImage();
    }
    
    // Constructeur standard avec 3 parametres
    public Personnage(String f, String n, int v){
        setFamille(f);
        setNom(n);
        setPhoto(n);
        setValeur(v);
    }
    
    
    //accesseur en lecture de nom
    public String getNom(){
        return this.nom;
    }
    
    
        //accesseur en lecture de famille
    public String getFamille(){
        return this.famille;
    }
    
    
   //accesseur en lecture de famille
    public int getValeur(){
        return this.valeur;
    }
    
  //accesseur en lecture de photo
    public Image getPhoto(){
        return this.photo;
    }
    
     //accesseur en ecriture de nom
    public void setNom(String nom){
        if(!nom.equals(""))
            this.nom = nom;
    }
    
     //accesseur en ecriture de famille
    public void setFamille(String famille){
        if(!famille.equals(""))
            this.famille = famille;
    }
    
    
         //accesseur en ecriture de valeur
    public void setValeur(int valeur){
        if(valeur >= 0)
            this.valeur = valeur;
    }
    
     //accesseur en ecriture de photo
    public void setPhoto(String nom){
        this.photo = new ImageIcon (getClass().getResource("/img/" + nom + ".jpg")).getImage();
    }
    
    //methode toString permet de recuperer toutes les informations d'un personnage sous la forme d'un texte
   public String toString(){
    
    String res="";
       res="\nNom"+this.nom;
       res+="\nFamille"+this.famille;
       res+="\nValeur"+this.valeur;
    
    return res;
}

    
}
