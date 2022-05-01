public class Main {
    public static void main (String[] args) {

        boolean isRegistered = true;
        int amount = 5_000;
        int percent = isRegistered ? 3 : 1;
        int bonus = amount * percent / 100;

        if (bonus > 500) {
           bonus = 500;
        }
    }
}
