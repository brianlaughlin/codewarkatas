package kata.kyu8.colorghost;

public class Ghost2 {
        private final String[] colors = {"white", "yellow", "purple", "red"};

        public Ghost2() {
        }

        public String getColor() {
            return colors[(int)(Math.random() * colors.length)];
        }
}
