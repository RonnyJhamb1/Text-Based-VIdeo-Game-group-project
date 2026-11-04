package TextBasedVideoGame;

import java.util.Scanner;
public class Microwave extends Appliance { 
private int health = 100;
private int damage;
Scanner input = new Scanner(System.in);
public void inputFood() {
System.out.println("enter the food you want to cook");
String food = input.nextLine();
}
public void microwaveFood() {
System.out.println("how many seconds to microwave");
String damage = input.nextInt();
int health -= damage;
}
if(health > 0) {
System.out.println( food + "health" + health);
public void move();
}
else { 
System.out.println(“The food exploded!!”);
}
}

