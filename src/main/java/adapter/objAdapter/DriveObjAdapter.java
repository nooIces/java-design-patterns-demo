package adapter.objAdapter;

import adapter.Drive;
import adapter.DriveTruck;

public class DriveObjAdapter implements DriveTruck {
    private Drive drives;

    public DriveObjAdapter(Drive drive){
        drives = drive;
    }

    public String driveTruck() {
        return "drive a truck " + drives.drive();
    }
}
