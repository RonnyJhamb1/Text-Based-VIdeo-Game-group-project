package TextBasedVideoGame;
import java.util.Scanner;
public class AirFryer extends Appliance{
     private int damage;
    private String name;
    private String food;
    private int health;
    private Toaster toaster;
    private Microwave microwave;
    private Oven oven;

    public void inputFood(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input what food you want to cook. ");
       this.food=input.next();
       
    }
}
