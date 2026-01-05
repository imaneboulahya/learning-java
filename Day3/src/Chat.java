public class Chat extends Animal{
    private String race;
    public Chat(String race, int poids, String nom){
        super(poids, nom);
        this.race = race;
    }
    public void setRace(String race){
        this.race = race;
    }
    public String getRace(){
        return this.race;
    }
    @Override
    public void manger(){
        System.out.println("Le chat mangedu Ronron");
    }
    @Override
    public String toString(){
        return super.toString()+", race = "+race;
    }
}
