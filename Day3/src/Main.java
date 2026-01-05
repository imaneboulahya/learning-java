public class Main {
    public static void main(){
        Chien ch1 = new Chien(15, "micho", "imane");
        Animal animal1 = new Animal(2, "miki");
        Chien ch2 = new Chien(10, "mich", "imane");
        Chien ch3 = new Chien(7, "mimi", "imane");
        Animal [] animaux = {ch1, ch2,ch3, animal1};
        for (Animal a : animaux){
            System.out.println(a);
        }
        for (Animal a : animaux){
            System.out.println(a.getNom());
        }
    }
}
