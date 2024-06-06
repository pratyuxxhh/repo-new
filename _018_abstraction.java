abstract class Animal{
    abstract void walk();
    abstract void voice();
    String specialAbility;

}
class dog extends Animal{
    public void walk (){
        System.out.println("walks on 4 legs");

    }
    public void voice(){
        System.out.println("bhauu bhauuu");
    }
}
public class _018_abstraction {
    public static void main(String[] args) {
        dog dg = new dog();
        dg.walk();
        dg.voice();
        dg.specialAbility="smells well";
    }
}


// just few abstraction concepts