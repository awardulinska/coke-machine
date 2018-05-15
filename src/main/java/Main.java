

public class Main {
    public static void main(String[] args) {

        AppControl calculate = new AppControl();

        System.out.println("Witaj. Puszka coli kosztuje 3zł. Wydajemy resztę.");
        System.out.println("\n");

        calculate.customerChoice();

        System.out.println("Odbierz puszkę, Twoja reszta to " + calculate.howBigIsTheRest() + " zł.");

    }


}
