package TextBasedVideoGame;

import java.util.Scanner;
public class Oven extends Appliance { 
public Oven(String food, int health, int damage){
    super(food, health, damage);
}

public Oven() 
{ super("Unknown", 100, 0); 
}
Scanner input = new Scanner(System.in);
public void setFood() {
System.out.println("enter the food you want to cook for the oven");
String newFood = input.nextLine();
setFood(newFood);
}

public void setDamage() {
System.out.println("how many seconds to oven");
int damage = input.nextInt();
setDamage(damage);

int newHealth = getHealth() - damage;
setHealth(newHealth);

if (newHealth > 0) {
System.out.println( getFood() + " health "+ newHealth);
}
else { 
System.out.println("The food exploded!!");
System.out.println("You lost 25 health");
System.out.println("You lose.");
newHealth -=25;
}
if(newHealth <= 0){
    System.out.println("You lose!");
    lose = true;
    input.close();

}
}
}
 

   