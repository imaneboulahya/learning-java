public class Personne {
    private int age;
    public Personne(){}
    public Personne(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age)throws AgeInvalideException {
        if(age < 0 || age > 130){
            throw new AgeInvalideException("Age invalide : "+age);
        }
        this.age = age;
    }
}
class AgeInvalideException extends Exception {
    public AgeInvalideException(String message){
        super(message);
    }
}
class Main{
    public static void main(String[] args){
        Personne p = new Personne();
        try{
            p.setAge(10);
            System.out.println(p.getAge());
        }
        catch(AgeInvalideException e){
            System.out.println(e.getMessage());
        }
    }
}