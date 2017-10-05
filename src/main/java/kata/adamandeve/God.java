package kata.adamandeve;

public class God {

    public static void main(String args[]){

        Human[] creation = God.create();
        for (int i = 0; i < creation.length; i++){

            System.out.print(creation[i].toString());
            System.out.println(" and " + creation[i].action());
        }
    }

    public static Human[] create() {

        return new Human[]{new Man(), new Woman(), new Abel(), new Cain()};
    }
}

abstract class Human {

    @Override
    public String toString() {
        return "I am " + getClass().getSimpleName();
    }

    abstract String action();


}

class Man extends Human {

    @Override
    String action() {
        return "Gave gave my rib";
    }
}

class Woman extends Human {

    @Override
    String action() {
        return "Spoke to snake.";
    }
}

class Abel extends Man {

    @Override
    String action() {
        return "Got God's favor.";
    }

}

class Cain extends Man {

    @Override
    String action() {
        return "Killed my brother";
    }

}



