// inheritance = subclasses 

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Item> items = new ArrayList<Item>();

        var cheese = new Cheese();
        items.add(cheese);
        cheese.price = 10;
        cheese.name = "Parmesan";

        System.out.println(cheese.price);

        var wine = new Wine();
        items.add(wine);
        wine.price = 7;
        wine.name = "Chardonay, Merlot";


        System.out.println("These are all the things I can sell to you:");
        for(var item : items){
            System.out.println(item.name);
            System.out.println(item.price);
            if(item instanceof Wine){
                //All the items that are Wine
                Wine wineInstance = (Wine)item;
                System.out.println(wineInstance.age);
            }else if(item instanceof Cheese){
                //All the items that are cheese
                Cheese cheeseInstance = (Cheese)item;
                System.out.println(cheeseInstance.cheeseType);

            }
        }
    }
}



public class Item{
  public float price;
  public String name;
}
//for private class, you should use setters and getters and they are reccomended to use
//public class in this case is for easer way


public class Cheese extends Item{ 
  public String cheeseType;
  public String cheeseColor;
}


public class Wine extends Item{
  //price
  //name
  public String type;
  public int age;
  public float alchPersentage;
  public String color;
}

