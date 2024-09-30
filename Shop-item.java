import java.util.Scanner;

public class Main {
  private static Shop shop = new Shop();
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    
    while(true){
      displayMenu();
      int userInput = scanner.nextInt();
      
      if(userInput == 1){
        addItem();
      }else if(userInput == 2){
        removeItem();
              
      }else if(userInput == 3){
        updateItem();
              
      }else if(userInput == 4){
        addItemToCart();
              
      }else if(userInput == 5){
        checkout();
              
      }else if(userInput == 6){
        System.out.println("Exiting...");
        break;
      }else{
        System.out.println("Invalid option. Please try again.");
      }
    }
    scanner.close();
  }
  public static void displayMenu() {
    System.out.println("Press 1 to add item to the list");
    System.out.println("Press 2 to remove item from the list");
    System.out.println("Press 3 to update the data");
    System.out.println("Press 4 to add items to the cart");
    System.out.println("Press 5 for checkout");
    System.out.println("Press 6 to exit");
    
  }
  public static void addItem() {
      System.out.print("Enter item ID: ");
      int id = scanner.nextInt();
      scanner.nextLine();
      System.out.print("Enter item name: ");
      String name = scanner.nextLine();
      System.out.print("Enter item cost: ");
      int cost = scanner.nextInt();

      Item newItem = new Item(id);
      newItem.setName(name);
      newItem.setCost(cost);
      shop.addItem(newItem);
      System.out.println("Item added successfully.");
  }
  public static void removeItem() {
      System.out.print("Enter item ID to remove: ");
      int removeId = scanner.nextInt();
      shop.removeItem(removeId);
      System.out.println("Item removed successfully.");
  }
  public static void updateItem() {
      System.out.print("Enter item ID to update: ");
      int updateId = scanner.nextInt();
      scanner.nextLine(); 
      System.out.print("Enter new item name: ");
      String newName = scanner.nextLine();
      System.out.print("Enter new item cost: ");
      int newCost = scanner.nextInt();
      shop.updateItem(updateId, newName, newCost);
      System.out.println("Item updated successfully.");
  }
  public static void addItemToCart() {
    System.out.print("Enter item ID to add to cart: ");
    int addCartId = scanner.nextInt();
    Item itemToAdd = null;
    for (Item item : shop.getItems()) {
      if (item.getId() == addCartId) {
        itemToAdd = item;
        break;
      }
    }if (itemToAdd != null) {
      shop.addItemToCart(itemToAdd);
      System.out.println("Item added to cart.");
    }else{
      System.out.println("Item not found.");
    }
  }
  public static void checkout() {
    int totalCost = shop.checkout();
    System.out.println("Total cost: " + totalCost);
  }
}


public class Item{ //ID
  private int id;
  private String name; //item.name = "another name";
  private int cost; //Gold pieces

  public Item(int id){
    this.id = id;
  }

  public int getId(){
    return id;
  }

  public void setName(String name){
    //Do some logic here
    this.name = name;
    //Do some logic here
  }

  public String getName(){
    return name;
  }

  public void setCost(int cost){
// Check whether or not the user is a cashier, and if it is, then allow to change the cost.
    this.cost = cost;
  }

  public int getCost(){
    return cost;
  }
}


import java.util.ArrayList;
public class Shop{
  
  //ItemManager functionality:
  //AddItem
  //RemoveItem
  //UpdateItem

  //Shop functionality:
  //AddItemToCart
  //Get the item's list
  //RemoveItemFromCart
  //Checkout (get the totalPrice)
  private ArrayList<Item> items = new ArrayList<Item>();
  private ArrayList<Item> cart = new ArrayList<Item>();

  public ArrayList<Item> getItems(){
    return items;
  }  
  public void addItem(Item item){
    items.add(item);
  }
  public void removeItem(int id){
    for (var item : items){
      if (item.getId() == id){
        items.remove(item);
        return;
      }
    }
  }
  public void updateItem(int id, String name, int cost){ // comes from the frontend
    //find the item with id 
    //updete the name of item and it's cost
    for (var item : items){
      if(item.getId() == id){
        item.setName(name);
        item.setCost(cost);
        return;
      }
    }
  }
    public void addItemToCart(Item item){
      // items list, it would contain the amount of available items
      // Before we add item to the cart, we would check whether or not it is available
      cart.add(item);
    }
  public int checkout(){ //get  the total cost of all items in the cart
    int sum = 0;
    for(var item : cart){
      sum += item.getCost();
    }
    return sum;
  }
}

