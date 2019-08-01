package vehicle;

public class VehicleServices {
    public void doServices(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Honda")){
            System.out.println("First change  the tyre");
            System.out.println("Second change oil");
            }else if (vehicleType.equalsIgnoreCase("Nissan")){
            System.out.println("First change  the engine");
            System.out.println("Second change engine oil");
        }
    }
}
