import java.util.Scanner;
import java.util.function.Function;

public class HomeAppliancesStore {
    static String namec;
    static String addressc;
    static int sum;

    public boolean deviceStatus(boolean status){
        return status;
    }

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

        class Fridge {
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

            private String getManufacturer_name() {
                return manufacturer_name;
            }

            private String getDevice_name() {
                return device_name;
            }

            private String getDevice_type() {
                return device_type;
            }

            private String getEnergy_consumption() {
                return energy_consumption;
            }

            private double getLength() {
                return length;
            }

            private double getHeight() {
                return height;
            }

            private double getDepth() {
                return depth;
            }


            public void StringValues() {
                manufacturer_name = "Whirlpool";
                device_name = "Whirlpool WT70E 831 X Aqua";
                device_type = "Fridge";
                energy_consumption = "376 kWh";
                energy_class = "F";
                cooling_type = "Full No Frost";
                color = "Silver";
                total_capacity_range = "Big (400 to 450lt)";
            }

            public void ArithmeticValues() {
                length = 80;
                height = 70;
                depth = 72.5;
                net_total_capacity = 435;
            }

            class Device extends Fridge {
                boolean status;

                private boolean getStatus() {
                    return status;
                }
            }
        }
        class WashineMachine {
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

            private String getManufacturer_name() {
                return manufacturer_name;
            }

            private String getDevice_name() {
                return device_name;
            }

            private String getDevice_type() {
                return device_type;
            }

            private String getEnergy_consumption() {
                return energy_consumption;
            }

            private double getLength() {
                return length;
            }

            private double getHeight() {
                return height;
            }

            private double getDepth() {
                return depth;
            }

            public void StringValues() {
                manufacturer_name = "Delonghi";
                device_name = "DDW45X20 Inox";
                device_type = "Washine Machine";
                energy_consumption = "Null";
                energy_class = "D";
                color_inox = "Inox Silver";
                steam_program = "No";
            }

            public void ArithmeticValues() {
                length = 84.5;
                height = 44.8;
                depth = 63.5;
                tableware_capacity = 10;
                temperatures = 5;
            }

            class Device extends WashineMachine {
                boolean status;

                private boolean getStatus() {
                    return status;
                }
            }
        }
        class Oven {
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

            private String getManufacturer_name() {
                return manufacturer_name;
            }

            private String getDevice_name() {
                return device_name;
            }

            private String getDevice_type() {
                return device_type;
            }

            private String getEnergy_consumption() {
                return energy_consumption;
            }

            private double getLength() {
                return length;
            }

            private double getHeight() {
                return height;
            }

            private double getDepth() {
                return depth;
            }

            public void StringValues() {
                manufacturer_name = "Neff";
                device_name = "B47CR22G0";
                device_type = "Oven";
                energy_consumption = "Null";
                energy_class = "A+";
                color = "Graphite Grey";
                pyrolysis = "No";
            }

            public void ArithmeticValues() {
                length = 56.8;
                height = 59.5;
                depth = 55;
                oven_capacity = 71;
                baking_methods = 12;
            }

            class Device extends Oven {
                boolean status;

                private boolean getStatus() {
                    return status;
                }
            }
        }
        class AirCondition {
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

            private String getManufacturer_name() {
                return manufacturer_name;
            }

            private String getDevice_name() {
                return device_name;
            }

            private String getDevice_type() {
                return device_type;
            }

            private String getEnergy_consumption() {
                return energy_consumption;
            }

            private double getLength() {
                return length;
            }

            private double getHeight() {
                return height;
            }

            private double getDepth() {
                return depth;
            }

            public void StringValues() {
                manufacturer_name = "Morris";
                device_name = "Air Condition";
                device_type = "WFIN-70160 Loft Inverter";
                energy_consumption = "366 kWh";
                cooling_energy_class = "A++";
                connectivity = "WiFi";
                ionizer = "Yes";
                heating_energy_class = "A+";
            }

            public void ArithmeticValues() {
                length = 1100;
                height = 333;
                depth = 222;
                rated_output = 24000;
                temperature_efficiency = 27150;
            }

            class Device extends aircondition {
                boolean status;

                private boolean getStatus() {
                    return status;
                }
            }
        }
        class Device {
            String manufacturer_name;
            String device_name;
            String device_type;
            String energy_consumption;
            double length;
            double height;
            double depth;
            boolean status;

            int net_total_capacity;
            String energy_class;
            String cooling_type;
            String color;
            String total_capacity_range;

            public void setStatus(boolean newStatus) {
                this.status = newStatus;
            }
        }

        HomeAppliancesStore obj = new HomeAppliancesStore();
        boolean status = obj.deviceStatus(status);
        System.out.println("The device status is: " + status);
    }
}