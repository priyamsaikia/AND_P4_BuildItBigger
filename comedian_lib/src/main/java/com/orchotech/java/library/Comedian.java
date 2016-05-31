package com.orchotech.java.library;

public class Comedian {
    public static void main(String args[]) {
        sayAJoke();
    }

    private static void sayAJoke() {
        String str = "How do you keep a Baptist from drinking at your party/bar?\n" +
                "Invite two of them.";
        sayHello(str);
    }

    public String perform(){
        String str = "How do you keep a Baptist from drinking at your party/bar?\n" +
                "Invite two of them.";
        return str;
    }
    public static void sayHello(Object obj) {
        System.out.println(obj);
    }
}
