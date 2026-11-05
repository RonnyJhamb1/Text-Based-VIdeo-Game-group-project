package TextBasedVideoGame;

import java.util.Scanner;

public class Appliance {


     private String food;
     protected int health = 100;
     private int damage;
     public static boolean lose = false;
public static void main(String[] args) {
    while(lose == false){
        DiningTable table = new DiningTable();
        Microwave myMicrowave = new Microwave();
        myMicrowave.setFood();
        myMicrowave.setDamage();
        if(lose == false){
        AirFryer myAirFryer = new AirFryer();
        myAirFryer.setFood();
        myAirFryer.setDamage();
        }
        if(lose == false){
        Oven myOven = new Oven();
        myOven.setFood();
        myOven.setDamage();
        }
        if(lose == false){
        Toaster myToaster = new Toaster();
        myToaster.setFood();
        myToaster.setDamage();
        }
        if(lose == false){
          table.eatFood();
            
        }
    }
}
    
      public  Appliance (String food, int health, int damage) {
             this.food = food;
             this.health = health;
             this.damage = damage;
      }
    
          public String getFood (){
       return food; 
    }
 

   public void setFood (String newFood){
       food = newFood; 
   }
    public int getHealth () {
 return health;
    }

public void setHealth (int newHealth) {
   health = newHealth;
}

public int getDamage () {
    return damage;
}
public void setDamage (int newDamage){
damage = newDamage; 


}
}

