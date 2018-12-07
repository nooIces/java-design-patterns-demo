package adapter;

import adapter.classAdapter.DriveClassAdapter;
import adapter.interfaceAdapter.DriveInterfaceAdapter;
import adapter.objAdapter.DriveObjAdapter;

public class AdapterTest {
    public static void main(String[] args) {
        // classAdapter
        Drive people = new DriveClassAdapter();
        System.out.println(((DriveClassAdapter) people).driveTruck());

        // objAdapter
        DriveTruck dr = new DriveObjAdapter(new Drive());
        System.out.println(dr.driveTruck());

        // interfaceAdapter
        DriveInterfaceAdapter bmw = new DriveInterfaceAdapter(new Drive()){
            @Override
            public String driveBMW(){
                return "drive a BMW " + drive.drive();
            }
        };
        System.out.println(bmw.driveBMW());
    }
}
