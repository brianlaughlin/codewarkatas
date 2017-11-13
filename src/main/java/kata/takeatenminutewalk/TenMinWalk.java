package kata.takeatenminutewalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        int x = 0;
        int y = 0;
        if (walk.length != 10) return false;

        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n':
                    y++;
                    break;
                case 's':
                    y--;
                    break;
                case 'w':
                    x++;
                    break;
                case 'e':
                    x--;
                    break;
            }
        }
        if (x == 0 && y == 0) return true;
        return false;
    }

    public static boolean isValidStream(char[] walk) {
        String s = new String(walk);
        return s.chars().filter(p->p=='n').count()==s.chars().filter(p->p=='s').count()&&
                s.chars().filter(p->p=='e').count()==s.chars().filter(p->p=='w').count()&&s.chars().count()==10;
    }

}
