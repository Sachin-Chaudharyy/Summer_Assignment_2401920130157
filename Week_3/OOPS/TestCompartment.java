import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}
class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment: Reserved for AC First Class ticket holders only";
    }
}
class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved for women passengers only";
    }
}
class General extends Compartment {
    public String notice() {
        return "General Compartment: Open for all passengers";
    }
}
class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: For parcels and goods";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] coaches = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < coaches.length; i++) {
            int type = rand.nextInt(4) + 1; 

            switch (type) {
                case 1:
                    coaches[i] = new FirstClass();
                    break;
                case 2:
                    coaches[i] = new Ladies();
                    break;
                case 3:
                    coaches[i] = new General();
                    break;
                case 4:
                    coaches[i] = new Luggage();
                    break;
            }
        }
        System.out.println("Train Coach Notices:\n");
        for (int i=0; i <coaches.length; i++) {
            System.out.println("Coach " + (i + 1) + coaches[i].notice());
        }
    }
}
