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
        "chicanery", "malevolence", "forge", "transient", "foment", "idiosyncrasy", "stray", "discomfit", "spurn", "prosaic", 
        "regale", "diaphanous", "maul", "sober", "calipers", "felicitous", "doggerel", "dexterity", "punctilious", "visceral", 
        "effete", "probity", "harrow", "garrulous", "forswear", "conciliatory", "lope", "amalgamate", "guile", "elegy", "quixotic", 
        "shunt", "impede", "torpid", "hermetic", "abhor", "apprehensive", "stint", "turpitude", "mince", "obtain", "equanimity", 
        "bequest", "finical", "florid", "inscrutable", "cower", "defiance", "striated", "glean", "delineate", "mundane", 
        "prevalent", "graze", "impecunious", "inveterate", "conviction", "husk", "abstruse", "submerge", "spear", "deviance", 
        "ferocity", "recidivism", "bask", "pluck", "superimpose", "testiness", "insularity", "ail", "coagulation", "limn", 
        "obstreperous", "derision", "aberration", "craven", "implicate", "conceit", "propitiatory", "droll", "recreancy", "vagary", 
        "vex", "vituperate", "massacre", "recast", "fervid", "encapsulate", "alcove", "negligent", "taciturn", "luculent", 
        "countenance", "bewilder", "nonplused", "taut", "whimsical", "hospitable", "gouge", "stentorian", "convoluted", 
        "clientele", "avow", "incumbents", "inchoate", "commodious", "veneration", "opprobrious", "augury", "complaisance", 
        "insinuate", "fawn", "mendacity", "forbearance", "reiterate", "ambidextrous", "cant", "heed", "excoriation", "animosity", 
        "immutable", "obdurate", "abraded", "cravat", "cognizant", "synopsis", "veer", "contemn", "aver", "terse", "vanquish", 
        "colander", "pungency", "equilibrium", "equivocal", "intersperse", "volubility", "trudge", "accretion", "fluke", "plead", 
        "pariah", "paean", "pitfall", "extenuate", "immaculate", "pucker", "scribble", "sundry", "indulge", "palate", "espouse", 
        "lament", "welter", "burgeon", "allegiance", "disinter", "hirsute", "illicit", "sullied", "encomium", "thwart", "obtrusive", 
        "adorn", "ebullient", "calumny", "ascribe", "connoisseur", "enunciate", "valiant", "eloquence", "conjoin", "gist", 
        "obsequious", "recitals", "deposition", "discreet", "glut", "finesse", "lavish", "impassive", "petrified", "sanguine", 
        "petrify", "qualm", "abscond", "consummate", "boisterous", "sagacious", "putrefaction", "deluge", "incongruous", "mettlesome", 
        "stigmatize", "scurvy", "foppish", "gossamer", "soporific", "tenacity", "solvent", "judicious", "dynamo", "apprise", 
        "precarious", "trickle", "tarnished"};

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
