package TextBasedVideoGame;
import java.util.Scanner;
public class DiningTable extends Toaster{

    public void eatFood(){
        Scanner input  = new Scanner(System.in);
        Toaster toaster  = new Toaster();
if(toaster.getHealth()<= 50 && toaster.getHealth() >0){
System.out.println("Do you want to drink the chug jug");
input.next();
if(input.equals("yes")){
    health +=20;
    System.out.println("You win!!");
}
else if(input.equals("no")){
    System.out.println("You lost!");
    lose = true;
    input.close();
}
else{
    System.out.println("Invalid input. Enter yes or no.");
    if(input.equals("yes")){
    health +=20;
    System.out.println("You win!!");
}
else if(input.equals("no")){
    System.out.println("You lost!");
    lose = true;
    input.close();
}
}
}
}
 }

