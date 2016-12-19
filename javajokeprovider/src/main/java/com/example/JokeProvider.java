package com.example;

import java.util.Random;

public class JokeProvider {

    private static final String[] jokes = {
            "Yo' mama so stupid, she walked into an antique shop and asked, \"What's new?\"",
            "Yo mama so fat, she leaves stretch marks in the tub.",
            "Yo' Mama is so fat, instead lint in her belly button, she's gathered full sweaters.",
            "Yo' Mama is so stupid, she saw a sign that said, \"Airport Left,\" so she turned around and went home.",
            "Yo' Mama is so ugly, when she ran away from home, her parents called the dog catcher.",
            "Yo' Mama is so fat, she couldn't identify a picture of her feet.",
            "Yo' Mama is so fat, when she went skydiving, she caused an eclipse.",
            "Yo' Mama is so fat, when she left her home country, the population dropped by 10%.",
            "Yo' Mama is so poor, I saw her kicking a can down the street, and when I asked her what she was doing, she said, \"Moving.\"",
            "Yo' Mama is so stupid, she got locked in a bathroom and peed her pants."
    };

    public static String getJoke(){
        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }

}
