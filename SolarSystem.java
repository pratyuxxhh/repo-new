import java.util.Scanner;
class Galaxy{
        public String[] planetNames = { "mercury", "venus", "earth ", "mars", "jupiter", "saturn", "uranus ", "neptune" };
        public int[] diameter = { 4879, 12100, 12756, 6794, 142984, 120536, 51118, 49528 };
        public float[] AvgDistFromSun = { 57.9f, 108.2f, 149.6f, 227.9f, 778.4f, 1426.7f, 2871.0f, 4498.2f };
        public String[]TimeTakenInOneRotation = {" 58.64 days "," 243 days "," 23hr 56 mins "," 24hr 37 mins "," 9hr 55 mins "," 10hr 39mins "," 17hr 14mins "," 16hr 7mins "};
        public String[]rev = {" 87.97 days "," 224.7 days "," 365.24 days "," 1.88 years ","11.86 years "," 29.4 years "," 84.02 years "," 164.79 years "};
        public float[]mass = {0.05f,0.82f,1.0f, 0.108f,318.0f, 95.16f,14.54f,17.14f};
        public int[]moons = {0,0,1,2,62,60,27,13};
    Galaxy(){
        System.out.println("welcome to milky way galaxy ....");
        System.out.println("i have 8 planets , if you want to know about them ,then choose a no. between 1 to 8. ");
    }
}
class InnerSolarSystem extends Galaxy{

    public void printInfo(int i) {
            System.out.println("you are on " + planetNames[i]);
            System.out.println("it's diameter is : " + diameter[i]+"kms");
            System.out.println("it's avg distance from sun is : " + AvgDistFromSun[i]+" million kms");
            System.out.println("it takes"+TimeTakenInOneRotation[i]+"to complete one rotation.");
            System.out.println("it takes"+rev[i]+"to revolve around the sun .");
            System.out.println("it has a mass of "+mass[i]+ " times the earth's mass .");
            System.out.println("it has "+moons[i]+" moons");

    }
}

public class SolarSystem {
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        InnerSolarSystem iss = new InnerSolarSystem();
        clearScreen();
        Galaxy galaxy  = new Galaxy();
        System.out.println();
        while (true) {
            
            System.out.println("enter a number from 1 to 8");

            int n = (int) sc.nextInt();
            while (true) {
                if (n>0&&n<9) {
                    break;
                }
                else{
                System.out.println("please enter number between 1 to 8 .");
                n = sc.nextInt();
                }
            }
            clearScreen();
            iss.printInfo(n - 1);
            System.out.println();
            System.out.println();
        }
    }
}

// inheritance concept (which is also useless in this code )
// but i  made it just for fun .