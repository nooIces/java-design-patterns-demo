package adapter.classAdapter;

import adapter.Drive;
import adapter.DriveTruck;

public class DriveClassAdapter extends Drive implements DriveTruck {

    public String driveTruck() {
        return "drive a truck " + drive();
    }
}
