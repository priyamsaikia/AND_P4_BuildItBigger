package com.orchotech.java.library;

public class Comedian {
    String[] jokes = {"Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.\n",
            "My friend said he knew a man with a wooden leg named Smith. \nSo I asked him \"What was the name of his other leg?\"",
            "A: Hey, man! Please call me a taxi. \nB: Yes, sir. You are a taxi. ",
            "Customer: Excuse me, but I saw your thumb in my soup when you were carrying it. \nWaitress: Oh, that's okay. The soup isn't hot. ",
            "Bank Teller: How do you like the money? \nEnglish Student: I like it very much.",
            "A: When I stand on my head the blood rushes to my head, but when I stand on my feet the blood doesn't rush to my feet. Why is this?\nB: It's because your feet aren't empty. ",
            "A: Do you want to hear a dirty joke? \nB: Ok \nA: A white horse fell in the mud. ",
            "Police officer: \"Can you identify yourself, sir?\"\nDriver pulls out his mirror and says: \"Yes, it's me.\"\nMore jokes at: http://www.short-funny.com/funniest-jokes-2.php#ixzz4AcYUiLu0",
            "Did you hear about the blind carpenter who picked up his hammer and saw?",
            "If vegetarians eat vegetables, what do humanitarians eat?",
            "Friends wave red flags when you have a bad idea. Real friends pick up a camera."
    };

    public String sayAJoke(int position) {
        int randomJoke = (int) ((Math.random()) * 10);
        if (randomJoke <= jokes.length)
            return jokes[randomJoke];
        else {
            randomJoke = randomJoke / 10;
            if (randomJoke <= jokes.length)
                return jokes[randomJoke];
            else
                return jokes[position];
        }
    }

    public String perform() {
        return sayAJoke(1);
    }

    public static void sayHello(Object obj) {
        System.out.println(obj);
    }
}
