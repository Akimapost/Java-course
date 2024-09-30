// inheritance = subclasses 

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<PaymentService>();

        var sebPaymentService1 = new SebPaymentService();
        list.add(sebPaymentService1);
        sebPaymentService1.currency = "$";
        var sebPaymentService2 = new SebPaymentService();
        list.add(sebPaymentService2);
        sebPaymentService2.currency = "€";

        var swedPaymentService1 = new SwedPaymentService();
        swedPaymentService1.currency = "$";
        list.add(swedPaymentService1);
        var swedPaymentService2 = new SwedPaymentService();
        swedPaymentService2.currency = "€";
        list.add(swedPaymentService2);

        for (var paymentService : list) {
            System.out.println(paymentService.currency);
            paymentService.sendPayment();
            paymentService.printInfo();
        }
    }
}




public class PaymentService{
  public String clientAddress;
  public int amount;
  public String description;
  public String currency;

  public void sendPayment(){
    System.out.println("This is a payment to some service.");
  }
  public void printInfo(){
    System.out.println("INFO");
  }
}



public class SebPaymentService extends PaymentService{

  @Override
  public void sendPayment(){
    System.out.println("This is a payment to SEB service.");
  }
  @Override
  public void printInfo(){
    System.out.println("This is SEB INFO");
  }
}



public class SwedPaymentService extends PaymentService{

  @Override
  public void sendPayment(){
    System.out.println("This is a payment to SWED service.");
  }
  @Override
  public void printInfo(){
    System.out.println("This is SWED INFO");
  }
}

///////////////////////

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Food> menu = new ArrayList<Food>();

        Pizza pizza = new Pizza("Margherita", 15.49f, "Large");
        menu.add(pizza);
        Burger burger = new Burger("Cheeseburger", 7.49f, "Beef");
        menu.add(burger);

        System.out.println("Menu:");
        for (Food item : menu) {
            item.sell();
        }
    }
}


public class Food {
    public String name;
    public float price;

    public Food(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void sell() {
        System.out.println("Selling " + name + " for €" + price);
    }
}



public class Pizza extends Food {
    public String size;

    public Pizza(String name, float price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void sell() {
        System.out.println("Selling " + size + " " + name + " pizza for €" + price);
    }
}



public class Burger extends Food {
    public String type;

    public Burger(String name, float price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void sell() {
        System.out.println("Selling " + type + " " + name + " burger for €" + price);
    }
}
