public class Chien extends Animal{
    private String maitre;
    public Chien(int poids, String nom, String maitre) {
        super(poids, nom);
        this.maitre = maitre;
    }
    public String getMaitre(){
        return this.maitre;
    }
    public void setMaitre(String maitre){
        this.maitre = maitre;
    }
    @Override
    public void manger(){
        System.out.println("Le chien mange du Pal");
    }
    @Override
    public String toString(){
        return super.toString()+", maitre = "+maitre;
    }
}
