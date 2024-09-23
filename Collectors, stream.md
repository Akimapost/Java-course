```java
// Collectors: java.util.stream.Collectors

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        shopsItems.add("Glass table");        
        shopsItems.add("Wooden table");
        shopsItems.add("Round table");
        shopsItems.add("Doors");
        shopsItems.add("Trapdoor");
        shopsItems.add("Couch");
        shopsItems.add("Bed");
        shopsItems.add("Sofa");

        var filteredShopsItems = new ArrayList<String>();
        for(var item: shopsItems){
            if(item.contains("table")){
                filteredShopsItems.add(item);
            }
        }
        System.out.println(filteredShopsItems);
    }
}
```
```java
// Streams

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        shopsItems.add("Glass table");        
        shopsItems.add("Wooden table");
        shopsItems.add("Round table");
        shopsItems.add("Doors");
        shopsItems.add("Trapdoor");
        shopsItems.add("Couch");
        shopsItems.add("Bed");
        shopsItems.add("Sofa");

      var filteredShopsItems = shopsItems
        .stream()
        .filter(item -> item.contains("table")) //if true, item will be returned; searching field
        .collect(Collectors.toList());
        System.out.println(filteredShopsItems);
    }
}
```
```java
/*
      var filteredShopsItems = shopsItems
        .stream()
        // HERE we can do actions: 
        // .skip(3) 
        // .limit(2)
        // .filter(item -> item.contains("table"))
 	// .forEach(x -> System.out.println("Test " + x))
 	.collect(Collectors.toList());

        System.out.println(filteredShopsItems);

*/

/*
        shopsItems
                .stream()
                .filter(x -> x.contains("table")) //if x (items) contains "table"...
                .forEach(x -> Print("TEST " + x)); //so print...
    }
      public static void Print(String text) {
        System.out.println();
        System.out.println(text);
      }
}
*/
```



