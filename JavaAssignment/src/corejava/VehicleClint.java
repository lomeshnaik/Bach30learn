package corejava;
import vehicle.VehicleServices;

public class VehicleClint {
    public static void main(String[] args) {
        VehicleServices vehicleservices = new VehicleServices();

       vehicleservices.doServices("honda");
      vehicleservices.doServices("nissan");
      vehicleservices.doServices("kia");

    }
}
