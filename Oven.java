package TextBasedVideoGame;



    import java.util.Scanner;
public class Oven extends Appliance{
        private int damage;
       private boolean Oven;
       private String food;
       private int temperature;
       private String heatState;
       public Oven(damage,temperature, food, heatState){
          this. damage = damage;
            this.temperature =temperature;
              this.food  = food;
              this.heatState = heatState;
}
        public void acceptInput(){
                  Scanner input = new Scanner(System.in);
                  damage = input.nextInt();
                  temperature = input.nextInt();
                  food = input.nextLine();
                  heatState = input.nextLine();
}
   System.out.println("Enter temperature:");
  public String stateOfOven(String heatState){
   if(temperature == 0){
          heatState = "OFF";
          return heatState;
} else if(temperature <= 200 && temperature > 0){
           heatState = "LOW";
          return heatState;
}
else if(temperature < 0){
   return "impossible, try again";
}
else {
heatState = "MID";
return heatState;
}
}
public String getHeatState(){
    return heatState;
}
public String food(String food){
     if(getHeatState().equals("OFF")){
            food = "RAW";
            return food;
}
   if(getHeatState().equals("LOW")){
          food = "UNDERCOOKED";
          return food;
}
if(getHeatState().equals("MID")){
        food ="PERFECT";
        return food;
    }
          
 public int damage(int health){
        health = 1000;
        if(health == 1000){
               damage = 0;
              return damage;
         { 
         if(isTouching(Oven)){
                damage = health - 300;
                return damage;

}
         }
        }
    }
}

}