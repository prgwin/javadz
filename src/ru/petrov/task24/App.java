package ru.petrov.task24;

import java.util.*;

//Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
//
//public Set<String> removeEvenLength(Set<String> set);
//Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
// метод вернет ["foo", "bar", "spoon", "!"]
public class App {
    public static void main(String[] args) {
        App app = new App();
        Set<String> setWords = new HashSet(Arrays.asList("foo", "buzz", "bar", "fork",
                "bort", "spoon", "!", "dude"));

        //app.run();
        System.out.println(app.removeEvenLength(setWords));
    }

    public Set<String> removeEvenLength(Set<String> set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            int length = element.length();
            if (length % 2 == 0) {
                iterator.remove();
            }
        }
        return set;
    }

    public void run() {
        Set<String> setWords = new HashSet(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
//        setList.add("foo");
//        setList.add("buzz");
//        setList.add("bar");

//        for (String key: setList ) {   //НЕ работает
//            int keySymbol =key.length();
//            if (keySymbol % 2 != 0) {
//                setList.remove(key);
//            }
//        }
        Iterator iterator = setWords.iterator();
        while (iterator.hasNext()) {
            String element = (String) iterator.next();
            int length = element.length();
            if (length % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(setWords);
//        int a = 1;
//        int b = 2;
//        int c = a / b;
//        System.out.println("a%b) "+a%b);
    }
}
