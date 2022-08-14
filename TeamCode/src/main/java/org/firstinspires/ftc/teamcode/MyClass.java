package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class MyClass extends OpMode {
    private DcMotor myMotor;

    @Override
    public void init(){
        telemetry.addData("Starting","Initialization");
        myMotor = hardwareMap.get(DcMotor.class,"my_motor");
    }
    @Override
    public void loop(){
        if (gamepad1.dpad_up){
            myMotor.setPower(1.0);
        }
        else if (gamepad1.dpad_down){
            myMotor.setPower(-1.0);
        }
        else {
            myMotor.setPower(0.0);
        }
    }
}
