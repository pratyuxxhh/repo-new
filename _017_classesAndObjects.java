
/**
 * Players
 */
class Players {
    String playerName;
    int goals ;
    int age ;
    char foot;

    public void playerInfo(){
        System.out.println(this.playerName);
        System.out.println(this.goals);
        System.out.println(this.foot);
        System.out.println(this.age);
    }
}

public class _017_classesAndObjects {
    public static void main(String[] args) {
        Players p1 = new Players();
        Players p2 = new Players();

        {                              //ronaldo
        p1.playerName = "ronaldo";
        p1.age = 40;
        p1.goals = 100;
        p1.foot ='R';
        }
        {                              //messi
            p2.playerName="messi";
            p2.age=38;
            p2.foot='L';
            p2.goals = 127;

        }
        p1.playerInfo();

        p2.playerInfo();


    }
    
}
