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
        Scanner ipt = new Scanner(System.in);
            Sum sumObject = new Sum();
            System.out.println("Type the sum of workers: ");
            String sum = ipt.nextLine();
            sumObject.EmfanishSum(sum);

            if ((namec == null) || (addressc == null)) {
                System.out.println("Error: Null.");
            }

        class Fridge{
            String manufacturer_name;
            String device_name;
            String device_type;
            String energy_consumption;
            double length;
            double height;
            double depth;

            int net_total_capacity;
            String energy_class;
            String cooling_type;
            String color;
            String total_capacity_range;

            private String getManufacturer_name()
            {
                return manufacturer_name;
            }
            public void setManufacturer_name(String newManufacturer_name) {
                this.manufacturer_name = newManufacturer_name;
            }
            private String getDevice_name()
            {
                return device_name;
            }
            public void setDevice_name(String newDevice_name) {
                this.device_name = newDevice_name;
            }
            private String getDevice_type()
            {
                return device_type;
            }
            public void setDevice_type(String newDevice_type) {
                this.device_type = newDevice_type;
            }
            private String getEnergy_consumption()
            {
                return energy_consumption;
            }
            public void setEnergy_consumption(String newEnergy_consumption) {
                this.energy_consumption = newEnergy_consumption;
            }
            private double getLength()
            {
                return length;
            }
            public void setLength(double newLength) {
                this.length = newLength;
            }
            private double getHeight()
            {
                return height;
            }
            public void setHeight(double newHeight) {
                this.height = newHeight;
            }
            private double getDepth()
            {
                return depth;
            }
            public void setDepth(double newDepth) {
                this.depth = newDepth;
            }

            public void StringValues() {
                manufacturer_name="Whirlpool";
                device_name="Whirlpool WT70E 831 X Aqua";
                device_type="Fridge";
                energy_consumption="376 kWh";
                energy_class="F";
                cooling_type="Full No Frost";
                color="Silver";
                total_capacity_range="Big (400 to 450lt)";
            }
            public void ArithmeticValues() {
                length=80;
                height=70;
                depth=72.5;
                net_total_capacity=435;
            }
            public void print() {
                System.out.println("Manufacture name: "+manufacturer_name);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

            }
        }
        class WashineMachine{
            String manufacturer_name;
            String device_name;
            String device_type;
            String energy_consumption;
            double length;
            double height;
            double depth;

            int tableware_capacity;
            String energy_class;
            String color_inox;
            String steam_program;
            int temperatures;

            private String getManufacturer_name()
            {
                return manufacturer_name;
            }
            public void setManufacturer_name(String newManufacturer_name) {
                this.manufacturer_name = newManufacturer_name;
            }
            private String getDevice_name()
            {
                return device_name;
            }
            public void setDevice_name(String newDevice_name) {
                this.device_name = newDevice_name;
            }
            private String getDevice_type()
            {
                return device_type;
            }
            public void setDevice_type(String newDevice_type) {
                this.device_type = newDevice_type;
            }
            private String getEnergy_consumption()
            {
                return energy_consumption;
            }
            public void setEnergy_consumption(String newEnergy_consumption) {
                this.energy_consumption = newEnergy_consumption;
            }
            private double getLength()
            {
                return length;
            }
            public void setLength(double newLength) {
                this.length = newLength;
            }
            private double getHeight()
            {
                return height;
            }
            public void setHeight(double newHeight) {
                this.height = newHeight;
            }
            private double getDepth()
            {
                return depth;
            }
            public void setDepth(double newDepth) {
                this.depth = newDepth;
            }

            public void StringValues() {
                manufacturer_name="Delonghi";
                device_name="DDW45X20 Inox";
                device_type="Washine Machine";
                energy_consumption="Null";
                energy_class="D";
                color_inox="Inox Silver";
                steam_program="No";
            }
            public void ArithmeticValues() {
                length=84.5;
                height=44.8;
                depth=63.5;
                tableware_capacity=10;
                temperatures=5;
            }
        }
        class Oven{
            String manufacturer_name;
            String device_name;
            String device_type;
            String energy_consumption;
            double length;
            double height;
            double depth;

            String energy_class;
            int oven_capacity;
            int baking_methods;
            String color;
            String pyrolysis;

            private String getManufacturer_name()
            {
                return manufacturer_name;
            }
            public void setManufacturer_name(String newManufacturer_name) {
                this.manufacturer_name = newManufacturer_name;
            }
            private String getDevice_name()
            {
                return device_name;
            }
            public void setDevice_name(String newDevice_name) {
                this.device_name = newDevice_name;
            }
            private String getDevice_type()
            {
                return device_type;
            }
            public void setDevice_type(String newDevice_type) {
                this.device_type = newDevice_type;
            }
            private String getEnergy_consumption()
            {
                return energy_consumption;
            }
            public void setEnergy_consumption(String newEnergy_consumption) {
                this.energy_consumption = newEnergy_consumption;
            }
            private double getLength()
            {
                return length;
            }
            public void setLength(double newLength) {
                this.length = newLength;
            }
            private double getHeight()
            {
                return height;
            }
            public void setHeight(double newHeight) {
                this.height = newHeight;
            }
            private double getDepth()
            {
                return depth;
            }
            public void setDepth(double newDepth) {
                this.depth = newDepth;
            }

            public void StringValues() {
                manufacturer_name="Neff";
                device_name="B47CR22G0";
                device_type="Oven";
                energy_consumption="Null";
                energy_class="A+";
                color="Graphite Grey";
                pyrolysis="No";
            }
            public void ArithmeticValues() {
                length=56.8;
                height=59.5;
                depth=55;
                oven_capacity=71;
                baking_methods=12;
            }
        }
        class AirCondition{
            String manufacturer_name;
            String device_name;
            String device_type;
            String energy_consumption;
            double length;
            double height;
            double depth;

            float rated_output;
            String cooling_energy_class;
            String connectivity;
            int temperature_efficiency;
            String ionizer;
            String heating_energy_class;

            private String getManufacturer_name()
            {
                return manufacturer_name;
            }
            public void setManufacturer_name(String newManufacturer_name) {
                this.manufacturer_name = newManufacturer_name;
            }
            private String getDevice_name()
            {
                return device_name;
            }
            public void setDevice_name(String newDevice_name) {
                this.device_name = newDevice_name;
            }
            private String getDevice_type()
            {
                return device_type;
            }
            public void setDevice_type(String newDevice_type) {
                this.device_type = newDevice_type;
            }
            private String getEnergy_consumption()
            {
                return energy_consumption;
            }
            public void setEnergy_consumption(String newEnergy_consumption) {
                this.energy_consumption = newEnergy_consumption;
            }
            private double getLength()
            {
                return length;
            }
            public void setLength(double newLength) {
                this.length = newLength;
            }
            private double getHeight()
            {
                return height;
            }
            public void setHeight(double newHeight) {
                this.height = newHeight;
            }
            private double getDepth()
            {
                return depth;
            }
            public void setDepth(double newDepth) {
                this.depth = newDepth;
            }

            public void StringValues() {
                manufacturer_name="Morris";
                device_name="Air Condition";
                device_type="WFIN-70160 Loft Inverter";
                energy_consumption="366 kWh";
                cooling_energy_class="A++";
                connectivity="WiFi";
                ionizer="Yes";
                heating_energy_class="A+";
            }
            public void ArithmeticValues() {
                length=1100;
                height=333;
                depth=222;
                rated_output=24000;
                temperature_efficiency=27150;
            }
        }
    }
}