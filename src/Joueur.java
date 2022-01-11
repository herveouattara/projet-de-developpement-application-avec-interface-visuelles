/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rio366020
 */

import java.awt.*;
import javax.swing.*;

public class Joueur {
    //attributs
    private String famillePre; //attribut famillepre de type string
    private String nom; //attribut nom de type String
    private LesPersonnages paquet; //attribut paquet de type lespersonnages
    private ImageIcon photo;  //attribut photo de type ImageIcon
    
    //Constructeur par défaut
    public Joueur(){
        this.famillePre = "anonyme";
        this.nom = "anonyme";
        this.photo = new ImageIcon(getClass().getResource(""));
        this.paquet = null;
    }
    
    // Constructeur standard
    public Joueur(String nom, String famillePre){
        setFamillePre(famillePre);
        setNom(nom);
        this.paquet = new LesPersonnages();
        this.photo = new ImageIcon(getClass().getResource("/img/joueurDefaut.png"));
    }
     //accesseur en lecture des attributs
    public String getNom(){
        return this.nom;
    }
    
    public String getFamillePre(){
        return this.famillePre;
    }
    
     public ImageIcon getPhoto(){
        return this.photo;
    }
    //accesseur en ecriture des attributs
    public void setNom(String nom){
        if(!nom.equals(""))
            this.nom = nom;
    }
    
    public void setFamillePre(String famille){
        if(!famille.equals(""))
            this.famillePre = famille;
    }
     public void setPhoto(ImageIcon nom){
        this.photo= nom;   
    }
    
    //methode score permetttant de recupere le score des paquets
    public int getScore(){
        return this.paquet.getScore();
    }
    
   
  
     //accesseur en lecture de type lespersonnages 
    public LesPersonnages getPaquet(){
         return this.paquet;
     }
     
    //methode permettant d'ajoutant le paquet d un personnage passer en parametre
    
    public void ajoutePersoPaquet(Personnage p) {
        this.paquet.ajoutePerso(p);
    }
    
    //un joueur avec un ensemble de personnages dans son paquet est creer pour permettre l'affichage de ses informations dans la boite
    public void initPaquetTest(){
        ajoutePersoPaquet(new Personnage("communs", "assault-trooper", 10));
        ajoutePersoPaquet(new Personnage("communs", "commando", 20));
        ajoutePersoPaquet(new Personnage("rares", "absolute-zero", 10));
    }

     //methode tostring permettant de renvoyer les informations sous forme textuel
    public String toString(){
        return "Joueur : " + this.getNom() + "\nfamille préférée : " + this.getFamillePre() + "\nen possession des personnages : " + this.getPaquet().toString() + "\nscore : " + this.getScore();
    }
    
    
    
    
    
}
