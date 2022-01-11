import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author io366020
 */


public class LesPersonnages {
    
    private ArrayList<Personnage> persos; //attribut persos qui gere les personnages du jeu de type ArrayList <personnage>
       // private int valeur;

        
      
    //Constructeurs
    
    
    //constructeur par défaut
    
    
    public LesPersonnages() {
      this.persos = new ArrayList<Personnage>(); //creation d'une instance de la liste personnage
      
     }
    
    
    
     //Accesseurs en lecture de persos( methode)
    public ArrayList<Personnage> getPersos() {   
        return persos;
    }
    
    
     public int getTaille() {  //methode qui renvoie le nombre d'element de la collection
         return this.persos.size(); 
     }
     
     
     
     //methode qui cumule des valeurs de chacun des personnages de la collection 
     public int getScore(){   
        int sc = 0;
        for(int i=0; i<getTaille(); i++)
           sc += getPerso(i).getValeur();
        return sc;
    }
     
    
    //Méthodes de la classe LesPersonnages qui renvoie le ième Personnage s'il existe
    public Personnage getPerso(int i){
        if (i>=0 && i<this.persos.size())
             return this.persos.get(i);
        else return null;
    }
    
    //renvoie tous les personnages d'une famille donnée en parametre sous forme d'un objet de type <<les personnages>>
    public LesPersonnages getPersosFamille(String f)
    {   LesPersonnages lp = new LesPersonnages();
        for(int i=0; i<getTaille(); i++)
            if(getPerso(i).getFamille().equals(f))
                lp.ajoutePerso(getPerso(i));
        return lp;
    }
    
    
    //supprimer un personnage passée en parametre passe en parametre
    public void retirePerso(Personnage p)
    { 
        int i=0; 
        boolean trouve = false;
        while(i<getTaille() && !trouve){
          if (getPerso(i).getNom().equals(p.getNom()))  
              trouve = true;
          else i++;
        }
        if(trouve)
           this.persos.remove(i);
    }
    
    //supprimer tous les personnages d'une famille donnée en renvoyant la liste de ces personnages supprimés sous forme d'un objet de type <<LesPersonnages>>
    public LesPersonnages retirePersos(int n)
    { LesPersonnages lcr = new LesPersonnages();
        for (int i=0; i<=n; i++)
        {
            lcr.ajoutePerso(getPerso(0));
            this.persos.remove(0);  
        }
        return lcr;
    } 
    
    //supprime tous les personnages dont le nom de la famille est celui passé en paramètre
    public LesPersonnages retirePersosFamille(String f)
    { 
        LesPersonnages lcr = new LesPersonnages();
        int i = 0;
        while(i<getTaille()){
            if (getPerso(i).getFamille().equals(f)) {
                lcr.ajoutePerso(getPerso(i));
                this.persos.remove(i);  
            }
            else i++;
        }
        return lcr;
    }
     
    // Vide la collection persos
    public void retireCartes()
    { 
           persos.clear();
    }
    
    // Ajoute un Personnage passé en paramètre
    public void ajoutePerso(Personnage p){
        if(p!=null)
            persos.add(p);
    }
    
    //ajoute un ensemble de personnage passe en parametre sous la forme d'un objet de type <<LesPersonnages>>
    public void ajoutePersos(LesPersonnages lp){
        for(int i = 0; i < lp.getTaille(); i++){
            ajoutePerso(lp.getPerso(i));
        }
    }
    
    
    
    public LesPersonnages(int nc) {
        this.persos = new ArrayList<Personnage>();
        if (nc >= 4){ // 2 familles
            ajoutePerso(new Personnage("communs", "assault-trooper", 10));
            ajoutePerso(new Personnage("communs", "commando", 20));
            ajoutePerso(new Personnage("rares", "absolute-zero", 10));
            ajoutePerso(new Personnage("rares", "arctice-assassin", 20));
        }
        if (nc >= 10){ // 4 familles
            ajoutePerso(new Personnage("communs", "devestrator", 30));
            ajoutePerso(new Personnage("rares", "brawler", 30));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master", 10));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-can", 20));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace", 10));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-can", 20));
        }
        if (nc >= 18){ // 6 familles

            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-chn", 30));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-chn", 30));
            ajoutePerso(new Personnage("légendaires", "power-chord", 10));
            ajoutePerso(new Personnage("légendaires", "raptor", 20));
            ajoutePerso(new Personnage("légendaires", "raven", 30));
            ajoutePerso(new Personnage("épiques", "burnout", 10));
            ajoutePerso(new Personnage("épiques", "funk-ops", 20));
            ajoutePerso(new Personnage("épiques", "rex", 30));
        }
        if (nc == 32){ // 6 familles
            ajoutePerso(new Personnage("communs", "dominator", 40));
            ajoutePerso(new Personnage("communs", "highrise-assault-trooper", 50));
            ajoutePerso(new Personnage("communs", "jungle-scout", 60));
            ajoutePerso(new Personnage("communs", "pathfinder", 70));
            ajoutePerso(new Personnage("rares", "brilliant-striker", 40));
            ajoutePerso(new Personnage("rares", "brite-bomber", 50));
            ajoutePerso(new Personnage("rares", "circuit-breaker", 60));
            ajoutePerso(new Personnage("rares", "dazzle", 70));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-fra", 40));
            ajoutePerso(new Personnage("alpins-femmes", "mogul-master-gbr", 50));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-fra", 40));
            ajoutePerso(new Personnage("as-des-pistes", "alpine-ace-gbr", 50));
            ajoutePerso(new Personnage("légendaires", "red-knight", 40));
            ajoutePerso(new Personnage("épiques", "shadow-ops", 40));
        }
    }
     
   
	@Override
        
        //renvoie sous forme textuelle les informations sur tous les personnages
 
    public String toString() {
        String s = "";
        for(int i=0; i<getTaille(); i++)
            s+=i+"- "+getPerso(i).toString();
       return s;
    }
	
    
    
    
    
     
    /* public void setValeur(int v){
      
    this.valeur = v;  
  }  
    
    public int getValeur(){
        return this.valeur;
    }
    */
    
    
}

