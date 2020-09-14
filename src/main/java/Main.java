public class Main {
    public static void main (String[] args) {
        BonusService service = new BonusService();

        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        System.out.println(passed);

        long bonus1;
        bonus1 = service.calculate (100060,  true);
        System.out.println(bonus1);

        float bonus2 = service.calculate(100060, false);
        System.out.println(bonus2);

        long bonus3 = service.calculate(100060, true);
        System.out.println(bonus3);

        long bonus4 = service.calculate(9223372036854775807L, true);
        System.out.println(bonus3);
    }
}

