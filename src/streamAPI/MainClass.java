package streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class MainClass {
    public static void main(String[] args) {

        // older way
        // Walkable obj = new WalkFast();
        // obj.walk(4);

//        Walkable obj = (steps, isEnabled) -> {
//            System.out.println("Walking fast " + steps + " steps.");
//            return 2 * steps;
//        };
//
//        Walkable obj2 =(steps,isEnabled) -> 2* steps;
//        obj.walk(4, true);


     List<String> fruits =List.of("Apple","Banana","Kiwi");
     Stream<String> stream = fruits.stream();
//     stream.forEach((fruit) -> {
//         System.out.println(fruits);
//     });

        List<Integer> fruitsList = fruits
                .stream()
                .map(fruit -> fruit.length())
                .collect(Collectors.toList());


        System.out.println(fruitsList);
    }
}

interface Walkable {
    int walk(int steps, boolean isEnabled);
}

class WalkFast implements Walkable {

    @Override
    public int walk(int steps, boolean isEnabled) {
        System.out.println("Walking fast " + steps + " steps.");
        return 2 * steps;
    }
}
