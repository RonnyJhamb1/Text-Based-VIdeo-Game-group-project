package TextBasedVideoGame;
import java.util.Scanner;
public class DiningTable extends Appliance{
    public String f;
   public DiningTable(String food, int health, int damage){
    super(food, health, damage);
}

public DiningTable() 
{ super("Unknown", 100, 0); 
}

    public void eatFood(){
        Scanner input  = new Scanner(System.in);
        
if(health >0 && health <=50){
System.out.println("Do you want to drink the chug jug");
f = input.next();
if(f.equals("yes")){
    health +=20;
    System.out.println("You win!!");
    lose = true;
    input.close();
}
else if(f.equals("no")){
    System.out.println("You lost!");
    lose = true;
    input.close();
}
else{
    System.out.println("Invalid input. Enter yes or no.");
    if(f.equals("yes")){
    health +=20;
    }
    else if(f.equals("no")){
    System.out.println("You lost!");
    lose = true;
    input.close();
}
}
}

else{
    System.out.println("You win!!");
    lose = true;
    input.close();
}
    }
}
    



