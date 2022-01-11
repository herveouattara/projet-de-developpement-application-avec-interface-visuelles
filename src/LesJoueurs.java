/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author io366020
 */
import java.util.ArrayList;

public class LesJoueurs {
    
    //Attributs
    private ArrayList<Joueur> lstJ;
    
    //Constructeur
    public LesJoueurs(){
        this.lstJ = new ArrayList<Joueur>();
    }
    
    //Accesseurs
    // Retourne le Joueur d'indice i passé en paramètre de la méthode ou null si l'indice dépasse la taille de l'ArrayList lstJ
    public Joueur getJoueur(int i){
        if (i>=0 && i<this.lstJ.size())
             return this.lstJ.get(i);
        else return null;
    }
    
    // Renvoie le nombre de Joueur contenus dans l'ArrayList lstJ
    public int getNbJoueurs() { 
         return this.lstJ.size(); 
     }
    
    
    //Méthodes de l'instance de la classe LesJoueurs
    // Ajoute un Joueur j passé en paramètre dans l'ArrayList lstJ
    public void ajouteJoueur(Joueur j){
        if(j!=null)
            this.lstJ.add(j);
    }
    
    // Retire le Joueur j, passé en paramètre, de l'ArrayList lstJ si son nom correspond à celui d'un Joueur de cette ArrayList
    public void supprimeJoueur(Joueur j)
    { 
        int i=0; 
        boolean trouve = false;
        while(i<getNbJoueurs() && !trouve){
          if (getJoueur(i).getNom().equals(j.getNom()))  
              trouve = true;
          else i++;
        }
        if(trouve)
            this.lstJ.remove(i);
    }
    
    // Renvoie l'indice du Joueur j passé en paramètre si celui-ci se trouve dans l'ArrayList lstJ sinon renvoie -1
    public int getIndiceJoueur(Joueur j){
        int i = 0;
        boolean trouve = false;
        while(i < getNbJoueurs() && !trouve){
            if(i==this.lstJ.indexOf(j))
                trouve = true;
            else i++;
        }
        if(!trouve)
            return -1;
        else
            return i;
    }
    
    // Renvoie un Joueur si son nom correspondant, passé en paramètre, est celui d'un Joueur de l'ArrayList lstJ sinon renvoie null
    public Joueur rechJoueur( String p){
        int i=0; 
        boolean trouve = false;
        while(i<getNbJoueurs() && !trouve){
          if (getJoueur(i).getNom().equals(p))
              trouve = true;
          else i++;
        }
        if(!trouve)
            return null;
        else
            return getJoueur(i);
    }
    
    // Renvoie dans une instance de la classe LesJoueurs référencée par la variable lst le nom du ou des gagnants du jeu du Memory en fonction de leur score respectif
    public LesJoueurs getGagnants(){
        // On stocke dans une variable max de type int le score du premier joueur de l'ArrayList lstJ
        int max=getJoueur(0).getScore();
        for(int i=1; i<getNbJoueurs(); i++)
        // On teste si le score du joueur suivant est plus grand que celui du premier joueur
            if (getJoueur(i).getScore()>max)
        // Si oui max contient maintenant le score du nouveau joueur et ainsi de suite
                max=this.getJoueur(i).getScore();
        // On crée une nouvelle instance nommée lst de LesJoueurs
        LesJoueurs lst=new LesJoueurs();
        for(int i=0; i<getNbJoueurs();i++)
        // Si le score du joueur i correspond au score max on l'ajoute dans l'ArrayList de l'objet lst et on retourne donc le joueur gagnant 
            if (getJoueur(i).getScore()==max)
                lst.ajouteJoueur(getJoueur(i));
        return lst;
    }
    
     
     //methode tostring permettant de renvoyer les informations sous forme textuel
    public String toString() {
        String s = "";
        for(int i=0; i<getNbJoueurs(); i++)
            s+=i+"- "+getJoueur(i).toString();
       return s;
    }   
}
