package com.orchotech.java.library;

public class Comedian {

    public String sayAJoke(int position) {
        String[] jokes = {"Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.\n", "How do you keep a Baptist from drinking at your party/bar?\n" +
                "Invite two of them."};
        if (position <= jokes.length)
            return (jokes[position]);
        else
            return jokes[0];
    }

    public String perform() {
        String[] jokes = {"Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.\n", "How do you keep a Baptist from drinking at your party/bar?\n" +
                "Invite two of them."};
        return jokes[0];
    }

    public static void sayHello(Object obj) {
        System.out.println(obj);
    }
}
