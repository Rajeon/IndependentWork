package chapter12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class CollectionsDemo {
    public static void main(String[] args) {
        setDemo();
//        listDemo
//        queueDemo
        mapDemo();
    }
    public static void setDemo(){
        Set<String> fruit = new HashMap();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
//        4 SOUT
        System.out.println(fruit.size());
//        [banana, orange, apple, lemon]
        System.out.println(fruit);

        var i = fruit.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        for(String item: fruit){
            System.out.println(item);
        }
        fruit.forEach(System.out::println);
    }
    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("lemon"));
        fruitCalories.remove("orange");
        for(var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
