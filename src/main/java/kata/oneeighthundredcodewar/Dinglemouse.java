package kata.oneeighthundredcodewar;

import java.util.*;
import java.util.stream.IntStream;

public class Dinglemouse {
    public static Set<String> check1800(final String str) {

        HashSet<String> phoneNumbers = new HashSet<>();
        phoneNumbers.add("1-800-CODE-WAR");

        return phoneNumbers;
    }

    public static Set<String> checkNumber(int n){

        final Map<String, Integer> CODE = new HashMap<>();
        CODE.put("A", 2);
        CODE.put("B", 2);
        CODE.put("C", 2);

        HashSet<String> matching = new HashSet<>();

        if (!CODE.containsKey("")){
            matching.add(CODE.keySet().toString());
        }


        return matching;
    }


    public static List<String> letterCombinations(String digits) {
        HashMap<Character, char[]> phoneNumberMap = new HashMap<Character, char[]>();
        phoneNumberMap.put('2', new char[]{'a','b','c'});
        phoneNumberMap.put('3', new char[]{'d','e','f'});
        phoneNumberMap.put('4', new char[]{'g','h','i'});
        phoneNumberMap.put('5', new char[]{'j','k','l'});
        phoneNumberMap.put('6', new char[]{'m','n','o'});
        phoneNumberMap.put('7', new char[]{'p','q','r','s'});
        phoneNumberMap.put('8', new char[]{'t','u','v'});
        phoneNumberMap.put('9', new char[]{'w','x','y','z'});

        List<String> result = new ArrayList<String>();
        if(digits.equals(""))
            return result;

        helper(result, new StringBuilder(), digits, 0, phoneNumberMap);

        return result;

    }

    public static void helper(List<String> result, StringBuilder sb, String digits, int index, HashMap<Character, char[]> map){
        if(index>=digits.length()){
            result.add(sb.toString());
            return;
        }

        char c = digits.charAt(index);
        char[] arr = map.get(c);

        IntStream.range(0, arr.length)
            .forEachOrdered(i -> {
            sb.append(arr[i]);
            helper(result, sb, digits, index + 1, map);
            sb.deleteCharAt(sb.length() - 1);
        });
    }

    public static String convertToDigitis(String words){
        Map<Character, Integer> letterToNumberMap = new HashMap<>();

        letterToNumberMap.put('A', 2);
        letterToNumberMap.put('B', 2);
        letterToNumberMap.put('C', 2);
        letterToNumberMap.put('D', 3);
        letterToNumberMap.put('E', 3);
        letterToNumberMap.put('F', 3);
        letterToNumberMap.put('G', 4);
        letterToNumberMap.put('H', 4);
        letterToNumberMap.put('I', 4);
        letterToNumberMap.put('J', 5);
        letterToNumberMap.put('K', 5);
        letterToNumberMap.put('L', 5);
        letterToNumberMap.put('M', 6);
        letterToNumberMap.put('N', 6);
        letterToNumberMap.put('O', 6);
        letterToNumberMap.put('P', 7);
        letterToNumberMap.put('Q', 7);
        letterToNumberMap.put('R', 7);
        letterToNumberMap.put('S', 7);
        letterToNumberMap.put('T', 8);
        letterToNumberMap.put('U', 8);
        letterToNumberMap.put('V', 8);
        letterToNumberMap.put('W', 9);
        letterToNumberMap.put('X', 9);
        letterToNumberMap.put('Y', 9);
        letterToNumberMap.put('Z', 9);

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length(); i++){
            result.append(letterToNumberMap.get(words.charAt(i)));
        }

        return result.toString();
    }


    public static String[] PRELOADEDWORDS(){

        String s = "ACT\n" +
                "ADD\n" +
                "ALL\n" +
                "APE\n" +
                "AND\n" +
                "ANN\n" +
                "ANY\n" +
                "ANT\n" +
                "ARE\n" +
                "ART\n" +
                "ASS\n" +
                "BAD\n" +
                "BAR\n" +
                "BAT\n" +
                "BAY\n" +
                "BEE\n" +
                "BIG\n" +
                "BIT\n" +
                "BOB\n" +
                "BOY\n" +
                "BUN\n" +
                "BUT\n" +
                "CAN\n" +
                "CAR\n" +
                "CAT\n" +
                "COT\n" +
                "COW\n" +
                "CUT\n" +
                "DAD\n" +
                "DAY\n" +
                "DEW\n" +
                "DID\n" +
                "DIN\n" +
                "DOG\n" +
                "DON\n" +
                "DOT\n" +
                "DUD\n" +
                "EAR\n" +
                "EAT\n" +
                "EEL\n" +
                "EGG\n" +
                "ERR\n" +
                "EYE\n" +
                "FAG\n" +
                "FAR\n" +
                "FLY\n" +
                "FOR\n" +
                "FUN\n" +
                "FUR\n" +
                "GAY\n" +
                "GET\n" +
                "GOT\n" +
                "GUM\n" +
                "GUN\n" +
                "GUY\n" +
                "GUT\n" +
                "GYM\n" +
                "HAS\n" +
                "HAT\n" +
                "HER\n" +
                "HEY\n" +
                "HIM\n" +
                "HIS\n" +
                "HIT\n" +
                "HOW\n" +
                "HUG\n" +
                "HUN\n" +
                "ICE\n" +
                "INK\n" +
                "ITS\n" +
                "IVE\n" +
                "JAN\n" +
                "JET\n" +
                "JOB\n" +
                "JOT\n" +
                "JOY\n" +
                "KEY\n" +
                "LAP\n" +
                "LAY\n" +
                "LIE\n" +
                "LET\n" +
                "LOG\n" +
                "MAN\n" +
                "MAP\n" +
                "MAY\n" +
                "MEN\n" +
                "MOM\n" +
                "MUD\n" +
                "MUM\n" +
                "NAP\n" +
                "NEW\n" +
                "NOD\n" +
                "NOT\n" +
                "NOW\n" +
                "OAR\n" +
                "ODD\n" +
                "OFF\n" +
                "OLD\n" +
                "ONE\n" +
                "OUR\n" +
                "OUT\n" +
                "PAN\n" +
                "PAL\n" +
                "PAT\n" +
                "PAW\n" +
                "PEN\n" +
                "PET\n" +
                "PIG\n" +
                "PIT\n" +
                "POT\n" +
                "PRO\n" +
                "PUT\n" +
                "QUO\n" +
                "RAG\n" +
                "RAM\n" +
                "RAN\n" +
                "RAP\n" +
                "RAT\n" +
                "RED\n" +
                "RIP\n" +
                "ROD\n" +
                "ROT\n" +
                "RUN\n" +
                "RUT\n" +
                "SAT\n" +
                "SAW\n" +
                "SAY\n" +
                "SEA\n" +
                "SEE\n" +
                "SEX\n" +
                "SHE\n" +
                "SOY\n" +
                "SUN\n" +
                "SUX\n" +
                "TAN\n" +
                "TAT\n" +
                "TEA\n" +
                "THE\n" +
                "TIN\n" +
                "TIP\n" +
                "TIT\n" +
                "TON\n" +
                "TOP\n" +
                "TOO\n" +
                "TWO\n" +
                "URN\n" +
                "USE\n" +
                "VAN\n" +
                "VET\n" +
                "VIP\n" +
                "WAR\n" +
                "WAS\n" +
                "WAY\n" +
                "WED\n" +
                "WHO\n" +
                "WHY\n" +
                "WIN\n" +
                "WON\n" +
                "XXX\n" +
                "YAK\n" +
                "YAM\n" +
                "YAP\n" +
                "YOU\n" +
                "YUM\n" +
                "ZAP\n" +
                "ZIP\n" +
                "ZIT\n" +
                "ZOO\n" +
                "ABLE\n" +
                "ACED\n" +
                "AGOG\n" +
                "AHEM\n" +
                "AHOY\n" +
                "ALLY\n" +
                "AMEN\n" +
                "ANTI\n" +
                "ANTS\n" +
                "ANUS\n" +
                "APES\n" +
                "ARMY\n" +
                "ARSE\n" +
                "ARTY\n" +
                "AVID\n" +
                "AWED\n" +
                "BABY\n" +
                "BARS\n" +
                "BATS\n" +
                "BAYS\n" +
                "BEAR\n" +
                "BEES\n" +
                "BILL\n" +
                "BITE\n" +
                "BITS\n" +
                "BLOW\n" +
                "BLUE\n" +
                "BOLD\n" +
                "BONE\n" +
                "BOOB\n" +
                "BOOM\n" +
                "BOSS\n" +
                "BOYS\n" +
                "BUFF\n" +
                "BUNG\n" +
                "BUNS\n" +
                "BUMS\n" +
                "BURP\n" +
                "BUST\n" +
                "BUSY\n" +
                "BUZZ\n" +
                "CANS\n" +
                "CANT\n" +
                "CARS\n" +
                "CART\n" +
                "CATS\n" +
                "CHAP\n" +
                "CHIC\n" +
                "CHUM\n" +
                "CIAO\n" +
                "CLAP\n" +
                "COCK\n" +
                "CODE\n" +
                "COOL\n" +
                "COWS\n" +
                "COZY\n" +
                "CRAB\n" +
                "CREW\n" +
                "CURE\n" +
                "CULT\n" +
                "DADS\n" +
                "DAFT\n" +
                "DAWN\n" +
                "DAYS\n" +
                "DECK\n" +
                "DEED\n" +
                "DICK\n" +
                "DING\n" +
                "DOGS\n" +
                "DOTS\n" +
                "DOLL\n" +
                "DOLT\n" +
                "DONG\n" +
                "DOPE\n" +
                "DOWN\n" +
                "DRAW\n" +
                "DUCK\n" +
                "DUDE\n" +
                "DUMB\n" +
                "DUTY\n" +
                "EARL\n" +
                "EARN\n" +
                "EARS\n" +
                "EASY\n" +
                "EATS\n" +
                "EDGE\n" +
                "EELS\n" +
                "EGGS\n" +
                "ENVY\n" +
                "EPIC\n" +
                "EYES\n" +
                "FACE\n" +
                "FAGS\n" +
                "FANG\n" +
                "FARM\n" +
                "FART\n" +
                "FANS\n" +
                "FAST\n" +
                "FEAT\n" +
                "FEET\n" +
                "FISH\n" +
                "FIVE\n" +
                "FIZZ\n" +
                "FLAG\n" +
                "FLEW\n" +
                "FLIP\n" +
                "FLOW\n" +
                "FOOD\n" +
                "FORT\n" +
                "FUCK\n" +
                "FUND\n" +
                "GAIN\n" +
                "GEEK\n" +
                "GEMS\n" +
                "GIFT\n" +
                "GIRL\n" +
                "GIST\n" +
                "GIVE\n" +
                "GLEE\n" +
                "GLOW\n" +
                "GOLD\n" +
                "GOOD\n" +
                "GOSH\n" +
                "GRAB\n" +
                "GRIN\n" +
                "GRIT\n" +
                "GROT\n" +
                "GROW\n" +
                "GRUB\n" +
                "GUNS\n" +
                "GUSH\n" +
                "GYMS\n" +
                "HAIL\n" +
                "HAIR\n" +
                "HALO\n" +
                "HANG\n" +
                "HATS\n" +
                "HEAD\n" +
                "HEAL\n" +
                "HEIR\n" +
                "HELL\n" +
                "HELP\n" +
                "HERE\n" +
                "HERO\n" +
                "HERS\n" +
                "HIGH\n" +
                "HIRE\n" +
                "HITS\n" +
                "HOLY\n" +
                "HOPE\n" +
                "HOST\n" +
                "HUNK\n" +
                "HUGE\n" +
                "HUNG\n" +
                "HUNS\n" +
                "HURT\n" +
                "ICON\n" +
                "IDEA\n" +
                "IDLE\n" +
                "IDOL\n" +
                "IOTA\n" +
                "JAZZ\n" +
                "JERK\n" +
                "JESS\n" +
                "JETS\n" +
                "JINX\n" +
                "JOBS\n" +
                "JOHN\n" +
                "JOKE\n" +
                "JUMP\n" +
                "JUNE\n" +
                "JULY\n" +
                "JUNK\n" +
                "JUST\n" +
                "KATA\n" +
                "KEYS\n" +
                "KICK\n" +
                "KIND\n" +
                "KING\n" +
                "KISS\n" +
                "KONG\n" +
                "KNOB\n" +
                "KNOW\n" +
                "LARK\n" +
                "LATE\n" +
                "LEAN\n" +
                "LICE\n" +
                "LICK\n" +
                "LIKE\n" +
                "LION\n" +
                "LIVE\n" +
                "LOGS\n" +
                "LOCK\n" +
                "LONG\n" +
                "LOOK\n" +
                "LORD\n" +
                "LOVE\n" +
                "LUCK\n" +
                "LUSH\n" +
                "MAKE\n" +
                "MANY\n" +
                "MART\n" +
                "MATE\n" +
                "MAXI\n" +
                "MEEK\n" +
                "MIKE\n" +
                "MILD\n" +
                "MINT\n" +
                "MMMM\n" +
                "MOMS\n" +
                "MOOD\n" +
                "MOON\n" +
                "MOOT\n" +
                "MUCH\n" +
                "MUFF\n" +
                "MUMS\n" +
                "MUTT\n" +
                "NAPS\n" +
                "NAZI\n" +
                "NEAT\n" +
                "NECK\n" +
                "NEED\n" +
                "NEWS\n" +
                "NEXT\n" +
                "NICE\n" +
                "NICK\n" +
                "NOON\n" +
                "NOSE\n" +
                "NOTE\n" +
                "OARS\n" +
                "OATS\n" +
                "ONCE\n" +
                "ONLY\n" +
                "OPEN\n" +
                "ORGY\n" +
                "OVAL\n" +
                "OVER\n" +
                "PANS\n" +
                "PALS\n" +
                "PART\n" +
                "PAST\n" +
                "PATS\n" +
                "PAWS\n" +
                "PEAR\n" +
                "PERT\n" +
                "PENS\n" +
                "PETS\n" +
                "PHEW\n" +
                "PIPE\n" +
                "PIPS\n" +
                "PLAN\n" +
                "PLUM\n" +
                "PLUS\n" +
                "POET\n" +
                "POOF\n" +
                "POOP\n" +
                "POSH\n" +
                "POTS\n" +
                "PROS\n" +
                "PSST\n" +
                "PUKE\n" +
                "PUNK\n" +
                "PURE\n" +
                "PUSH\n" +
                "PUSS\n" +
                "QUAD\n" +
                "QUAK\n" +
                "QUID\n" +
                "QUIT\n" +
                "RANT\n" +
                "RAPE\n" +
                "RAPS\n" +
                "RAPT\n" +
                "RATE\n" +
                "RAMS\n" +
                "RATS\n" +
                "REAP\n" +
                "RICK\n" +
                "RING\n" +
                "RIPE\n" +
                "ROOT\n" +
                "ROSE\n" +
                "ROSY\n" +
                "ROTS\n" +
                "RUNT\n" +
                "RUTS\n" +
                "SAFE\n" +
                "SAGE\n" +
                "SANE\n" +
                "SAVE\n" +
                "SAWS\n" +
                "SEEK\n" +
                "SEXY\n" +
                "SHAG\n" +
                "SHIT\n" +
                "SICK\n" +
                "SIGH\n" +
                "SIRE\n" +
                "SLAG\n" +
                "SLIT\n" +
                "SLUT\n" +
                "SNAP\n" +
                "SNOG\n" +
                "SNUG\n" +
                "SOFT\n" +
                "SOON\n" +
                "SOUL\n" +
                "SOUP\n" +
                "SPRY\n" +
                "STIR\n" +
                "STUN\n" +
                "SUCK\n" +
                "SWAG\n" +
                "SWAY\n" +
                "TACT\n" +
                "TANK\n" +
                "TANS\n" +
                "THAT\n" +
                "THIS\n" +
                "TIME\n" +
                "TINS\n" +
                "TINY\n" +
                "TITS\n" +
                "TOES\n" +
                "TONS\n" +
                "TONY\n" +
                "TOPS\n" +
                "TOYS\n" +
                "UBER\n" +
                "URNS\n" +
                "USED\n" +
                "USER\n" +
                "USES\n" +
                "VAIN\n" +
                "VAMP\n" +
                "VARY\n" +
                "VEIN\n" +
                "VENT\n" +
                "VERY\n" +
                "VEST\n" +
                "VIEW\n" +
                "VIVA\n" +
                "VOLT\n" +
                "VOTE\n" +
                "WAFT\n" +
                "WAGE\n" +
                "WAKE\n" +
                "WALK\n" +
                "WALL\n" +
                "WANG\n" +
                "WANK\n" +
                "WANT\n" +
                "WARD\n" +
                "WARM\n" +
                "WARP\n" +
                "WARS\n" +
                "WART\n" +
                "WASH\n" +
                "WAVE\n" +
                "WEAR\n" +
                "WEDS\n" +
                "WEED\n" +
                "WEEN\n" +
                "WELD\n" +
                "WHAT\n" +
                "WHEE\n" +
                "WHEW\n" +
                "WHIP\n" +
                "WHIZ\n" +
                "WHOA\n" +
                "WIFE\n" +
                "WILL\n" +
                "WIND\n" +
                "WING\n" +
                "WINK\n" +
                "WINS\n" +
                "WIRE\n" +
                "WISH\n" +
                "WITH\n" +
                "WORD\n" +
                "WORK\n" +
                "WRAP\n" +
                "XMAN\n" +
                "XMEN\n" +
                "XRAY\n" +
                "XTRA\n" +
                "XXXX\n" +
                "YANK\n" +
                "YAKS\n" +
                "YAMS\n" +
                "YAPS\n" +
                "YARD\n" +
                "YARN\n" +
                "YELP\n" +
                "YERN\n" +
                "YOKE\n" +
                "YOLK\n" +
                "YULE\n" +
                "ZANY\n" +
                "ZAPS\n" +
                "ZIPS\n" +
                "ZITS\n" +
                "ZERO\n" +
                "ZOOM\n" +
                "ZOOS";

        String[] newString = s.split("\\n");

        return newString;
    }
}
