public class Animal {
    private int poids;
    private String nom;
    public abstract void manger();
    public Animal(int poids){
        this.poids = poids;
    }
    public Animal(String nom){
        this.nom = nom;
    }
    public Animal(int poids, String nom){
        this.nom = nom;
        this.poids = poids;
    }
    public int getPoids(){
        return this.poids;
    }
    public String getNom(){
        return this.nom;
    }
    public void setPoids(int poids){
        this.poids = poids;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    @Override
    public String toString(){
        return "Animal{ poids = "+poids+", nom = "+nom+"}";
    }
}
