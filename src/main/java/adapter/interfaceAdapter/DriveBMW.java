package adapter.interfaceAdapter;

import adapter.Drive;

public class DriveBMW extends DriveInterfaceAdapter {
    public DriveBMW(Drive drive){
        super(drive);
    }

    @Override
    public String driveBMW(){
        return "drive a BMW " + drive.drive();
    }
}
