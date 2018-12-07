package adapter.interfaceAdapter;

import adapter.Drive;

public abstract class DriveInterfaceAdapter implements DriveKind{

    protected Drive drive;

    public DriveInterfaceAdapter(Drive drive){
        this.drive = drive;
    }

    @Override
    public String driveTruck(){
        return drive.drive();
    }

    @Override
    public String driveBMW(){
        return drive.drive();
    }

    @Override
    public String driveAUDI(){
        return drive.drive();
    }
}
