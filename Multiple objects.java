// multiple objects

//Main.java

public class Main {
    public static void main(String[] args) {
        var square1 = new Square(3);
        var square1Perimeter = square1.getPerimeter();
        System.out.println(square1Perimeter);

        var square2 = new Square(4);
        System.out.println(square2.getPerimeter());

        var square3 = new Square(100);
        var square3Perimeter = square3.getPerimeter();
        System.out.println(square3Perimeter);

        var square4 = new Square(1);
        var square4Perimeter = square4.getPerimeter();
        System.out.println(square4Perimeter);
    }
}

//Square.java

public class Square{
  public int sideLength; //sideLength = 7
  // new Square(7); 
  public Square(int sideLength){
    this.sideLength = sideLength;
  }

  public int getPerimeter(){
    return sideLength * 4;
  }
}

_____________________

//Main.java

public class Main {
    public static void main(String[] args) {
        var square1 = new Square(3);
        var square1Perimeter = square1.getPerimeter();
        var square1FieldSize = square1.getField();
       System.out.println(square1FieldSize);
       System.out.println(square1Perimeter);
    }
}


//Square.java

public class Main {
    public static void main(String[] args) {
        var square1 = new Square(3);
        var square1Perimeter = square1.getPerimeter();
        var square1FieldSize = square1.getField();
       System.out.println(square1FieldSize);
       System.out.println(square1Perimeter);
    }
}

______________________


//Main.java

// Fork has x amount of spikes
// Fork has a material (silver, wood, plastic)
// Fork has a sharpness in the spikes.0
// A fork can stab and whenever a fork stabs, it gets more dull
// Sharpness is gonna decrease by 0.1

public class Main {
    public static void main(String[] args) {
      var fork = new Fork(4, "Silver");
      System.out.println("Fork made out of " + fork.material);
      System.out.println("Fork has " + fork.spikeCount + " spike in total.");
       System.out.println("And the sharpness is " + fork.sharpness);

      for(int i = 0; i < 100; i++){
        fork.stab();
      }
      System.out.println("The sharpness after 100 stabs is " + fork.sharpness);
    }
}
 //Fork.java
public class Fork{
  public int spikeCount;
  public String material;
  public double sharpness = 1000;

  //new Fork(3, "wood")

  public Fork(int spikeCount, String material){
    this.spikeCount = spikeCount;
    this.material = material;
  }
  public void stab(){
   sharpness = sharpness - 1;
 }
}

________________________




