import java.util.Scanner;

public class HomeAppliancesStore {
    static String namec;
    static String addressc;
    static int sum;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            Name namecObject = new Name();
            System.out.println("Type the name of the company: ");
            String namec = input.nextLine();
            namecObject.EmfanishName(namec);
        Scanner inpt = new Scanner(System.in);
            Address addresscObject = new Address();
            System.out.println("Type the address of the company: ");
            String addressc = inpt.nextLine();
            addresscObject.EmfanishAddress(addressc);

            if ((namec == null) || (addressc == null)) {
                System.out.println("Error: Null.");
            }
        }
}