package function;


import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Word {

    private String[] word = {"invincible", "libel", "exscind", "soot", "incipient", "deprave", "tamper", "felicitous", "garble",
        "phlegmatic", "limp", "abraded", "pine", "putrefaction", "tonic", "pied", "verve", "shard", "alcove", "morbid",
        "bilge", "disconcert", "effrontery", "inane", "glimmer", "deviance", "obloquy", "repulsive", "interdict", "unfeigned",
        "maverick", "ambivalent", "ineptitude", "warmonger", "edacious", "benefactor", "enthral", "slur", "stentorian",
        "visceral", "dilate", "acarpous", "graze", "hubris", "impede", "plead", "idyll", "lurk", "fetid", "enunciate", "inimical", 
        "insularity", "ascribe", "aloof", "swerve", "regicide", "regale", "incense", "vain", "divulge", "grievous", "jocular",
        "tassel", "elaborate", "contrite", "tenacity", "coddle", "illicit", "harrow", "reprobate", "flop", "inasmuch", "lithe",
        "exoneration", "sinuous", "perilous", "middling", "entice", "profuse", "rapacious", "pundit", "apartheid", "mince",
        "defiance", "ingest", "occluded", "deluge", "accretion", "vestige", "tenuous", "cognizant", "weigh", "accolade",
        "chicanery", "malevolence", "forge", "transient", "foment", "idiosyncrasy", "stray"};

    public String getRandom(String[] arr) {
        Random r = new Random();
        int rand = r.nextInt(arr.length);
        return arr[rand];
    }


    public String[] getWord() {
        return word;
    }

    public void setWord(String[] word) {
        this.word = word;
    }
}
