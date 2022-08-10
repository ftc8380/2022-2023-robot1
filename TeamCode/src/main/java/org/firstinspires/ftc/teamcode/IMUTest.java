package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IMUTest extends OpMode {
    private BNO055IMU imu;

    @Override
    public void init() {
        imu = hardwareMap.get(BNO055IMU.class, "imu");
        BNO055IMU.Parameters parameters = new BNO055IMU.Parameters();
        parameters.angleUnit = BNO055IMU.AngleUnit.DEGREES;

        imu.initialize(parameters);
    }

    @Override
    public void loop() {
        double heading = -imu.getAngularOrientation().firstAngle;
        telemetry.addData("Heading", heading);
    }
}
