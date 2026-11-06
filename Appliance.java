package TextBasedVideoGame;

import java.util.Scanner;

public class Appliance {


     private String food;
     protected int health = 100;
     private int damage;
     public static boolean lose = false;
public static void main(String[] args) {
    while(!lose){
        System.out.println("Welcome to the kitchen!");
        DiningTable table = new DiningTable();
        Microwave myMicrowave = new Microwave();
         Oven myOven = new Oven();
         AirFryer Fryer = new AirFryer();
          Toaster myToaster = new Toaster();
        myMicrowave.setFood();
        myMicrowave.setDamage();
        if(!lose){
            myMicrowave.getHealth();
            Fryer.setHealth(myMicrowave.getHealth());
       Fryer.setFood();
        Fryer.setDamage();
        }
        if(!lose){
             myOven.setHealth(Fryer.getHealth());
        myOven.setFood();
        myOven.setDamage();
       
        }
        if(!lose){
            myToaster.setHealth(myOven.getHealth());
        myToaster.setFood();
        myToaster.setDamage();
        
        }
        if(!lose){
            myToaster.getHealth();
            table.setHealth(myToaster.getHealth());
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

