package corejava;
import Vehicle.VehicleS;

public class VehicleClint {
    public static void main(String[] args) {
        VehicleS vehicleservice = new VehicleS();

       vehicleservice.doService("honda");
       vehicleservice.doService("nissan");
       vehicleservice.doService("kia");

    }
}
