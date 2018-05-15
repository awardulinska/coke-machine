import java.util.Scanner;

public class AppControl {

    double value;
    Cola cola = new Cola();

    public void customerChoice() {

        System.out.println("Wrzuć monetę/ banknot (podaj wartość)");

        Scanner input = new Scanner(System.in);
        value = input.nextDouble();

        while (value < cola.price) {
            System.out.println("Wrzuć monetę/ banknot (podaj wartość)");
            value = value + input.nextDouble();
        }

        input.close();
    }


    public double howBigIsTheRest() {

        if (value == cola.price) return 0;

        else {
            double rest = value - cola.price;
            return rest;
        }
    }

//    public int moneyBank(){
//
//    }

}
