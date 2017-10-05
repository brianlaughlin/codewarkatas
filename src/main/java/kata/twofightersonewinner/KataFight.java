package kata.twofightersonewinner;

public class KataFight {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        while (fighter1.health > 0 || fighter2.health > 0) {

            if (fighter1.name == firstAttacker) {
                Attack(fighter1, fighter2);
                if(fighter2.health <= 0) return fighter1.name;
                Attack(fighter2, fighter1);

                if(fighter1.health <= 0) return fighter2.name;
            } else {
                Attack(fighter2, fighter1);
                if(fighter1.health <= 0) return fighter2.name;
                Attack(fighter1, fighter2);
                if(fighter2.health <= 0) return fighter1.name;
            }
        }
        return null;
    }

    private static void Attack(Fighter fighter1, Fighter fighter2) {
        fighter2.health = fighter2.health - fighter1.damagePerAttack;
    }



    public static String declareWinnerBest(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter a=fighter1, b=fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2; b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) return a.name;  // a wins
            if ((a.health -= b.damagePerAttack) <= 0) return b.name;  // b wins
        }
    }


}


    class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }




