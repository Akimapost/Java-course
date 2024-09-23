
public class Main {
  public static void main(String[] args) {
// winter, spring, summer, autumn
// warm jacket, t-shirt, swimming suit, rain coat, 
//else if optimised the code - it stops, if the correct answer has been found
   String season = "summer";

    if (season == "winter") {
      System.out.println("Wear a warm jacket!");
    }
    else if (season == "spring") {
      System.out.println("Wear a T-shirt!");
    }
    else if (season == "summer") {
      System.out.println("Wear a swimming suite!");
    }
    else if (season == "autumn") {
      System.out.println("Wear a rain coat!");
    }
     else {
      System.out.println("I don't recognise this season");
    }
  }

}

//+5 wear super warm
//+5 to +15 warm
//+15 to 30 normal
//+30 and more you need cooling
//double - decimal numbers (2.565)
//int - single number (1 or 9 or -4)
//var - it gueses itself, what you mean


public class Main {
  public static void main(String[] args) {

    double temp = -15.0;

    if (temp <= 5) {
      System.out.println("Wear super warm");
    }
    else if (temp <= 15) {
      System.out.println("Wear warm");
    }
    else if (temp <= 30) {
      System.out.println("Wear normal");
    }
    else {
      System.out.println("You need cooling");
    }


    
  }
}
