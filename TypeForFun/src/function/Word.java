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
        "precarious", "trickle", "tarnished", "malign", "vacillation", "chary", "parsimonious", "deprave", "summarily", "odium", 
        "ineffable", "stride", "vestige", "intrepid", "legacy", "toady", "thrift", "flout", "abet", "moderation", "insurrection", 
        "quirk", "facetious", "savor", "paucity", "precepts", "waffle", "viscous", "perspicacity", "fringe", "ingenuous", "trifling",
        "imprecation", "elicit", "repast", "antithetical", "gush", "prolix", "exoneration", "fledged", "preponderance", "implosion", 
        "euphoria", "quandary", "disdain", "middling", "penitent", "phlegmatic", "arrant", "diffidence", "engrave", "ameliorate", 
        "lionize", "foil", "empirical", "preclude", "veneer", "slake", "curtail", "cumbersome", "sinuous", "indelible", "elaborate", 
        "acarpous", "fulsome", "dupe", "feud", "desuetude", "fragrant", "stickler", "reconcile", "sluggard", "irrevocable", 
        "vivacious", "sordid", "insouciant", "valorous", "extort", "nadir", "serration", "argot", "fatuous", "protracted",
        "expatiate", "apostate", "aversion", "evoke", "blandness", "cogitate", "sophisticated", "smolder", "congeal", "invincible", 
        "coy", "lithe", "frenetic", "figurehead", "desiccant", "transient", "truce", "gust", "perilous", "flop", "duress", "descry",
        "sycophant", "erudite", "covert", "corroboration", "drowsiness", "liberality", "tangential", "partisan", "piquant", "grave", 
        "peregrination", "odor", "philistine", "divergence", "profligacy", "invective", "fragile", "discern", "matriculation", 
        "misanthrope", "myriad", "recluse", "enmity", "efficacy", "infuriate", "precursory", "slack", "divulge", "arboreal", "garment",
        "presumption", "hypocrisy", "subpoena", "nascent", "inept", "extempore", "discrete", "arduous", "insipid", "incredulous", 
        "weigh", "puissance", "hone", "reproach", "clinch", "abut", "breach", "prevaricate", "preternatural", "dislodge", "germane",
        "portent", "disallow", "dud", "volatile", "servile", "slur", "supplicate", "eulogy", "aspersion", "repine", "fidget", "egress",
        "gnaw", "pest", "squat", "redoubtable", "baleful", "indigence", "inferno", "dissemble", "palliate", "impromptu", "torment", 
        "pugnacious", "verve", "discourse", "evasive", "profuse", "irascible", "refulgent", "incite", "dwarf", "mercurial", "barrage", 
        "unscathed", "daunt", "prone", "rapacious", "oblivious", "correlate", "buoyant", "lumber", "waft", "propagation", "drawl", 
        "accolade", "rancorous", "ire", "tout", "castigate", "fleet", "effrontery", "conceal", "verdant", "forage", "ignoble", 
        "disparate", "recompense", "conspicuous", "salubrious", "idyll", "disproof", "vilify", "coalescing", "profligate", "noxious",
        "grandiloquent", "resort", "statement", "compunction", "inclined", "pusillanimous", "contrite", "pious", "exuberance", "tamp", 
        "tawdry", "derivative", "disconcert", "sobriety", "malinger", "debacle", "sequence", "halcyon", "flak", "entice", 
        "verisimilitude", "ubiquitous", "stray", "approbation", "pundit", "hoax", "imperative", "transitory", "obfuscate", "plod", 
        "strut", "sermon", "splenetic", "idolatry", "raconteur", "ambiguous", "exorbitant", "indomitable", "suborn", "proscribe", 
        "aloof", "neophyte", "sawdust", "deplete", "poignant", "vitiate", "labyrinthine", "resilience", "scent", "coeval", "grovel", 
        "swerve", "perfidious", "ebullience", "pedantic", "fracas", "engender", "clot", "loquacious", "sidestep", "shrewd", "rave",
        "enigma", "barren", "raffish", "esoteric", "quack", "suppliant", "dawdler", "recalcitrant", "hoi", "prune", "pinch", "scabbard",
        "resuscitation", "macabre", "embezzle", "predominate", "incise", "impute", "ecumenical"};

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
