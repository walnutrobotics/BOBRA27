package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name = "park", group = "1")
@SuppressWarnings("unused") // The FTC SDK discovers this OpMode through its annotation.
public class auto extends LinearOpMode {
    public DcMotor r1 = null;
    public DcMotor r2 = null;
    public DcMotor l1 = null;
    public DcMotor l2 = null;

    public DcMotor gear;

    @Override
    public void runOpMode() {
        r1 = hardwareMap.get(DcMotor.class, "r1");
        r2 = hardwareMap.get(DcMotor.class, "r2");
        l1 = hardwareMap.get(DcMotor.class, "l1");
        l2 = hardwareMap.get(DcMotor.class, "l2");
        gear = hardwareMap.get(DcMotor.class, "gear");

        waitForStart();
        while(!isStopRequested()) {
            //drive code forward and back
            r1.setDirection(DcMotorSimple.Direction.REVERSE);
            r2.setDirection(DcMotorSimple.Direction.REVERSE);
            r1.setPower(-1);
            r2.setPower(1);
            l1.setPower(1);
            l2.setPower(1);
        }
    }
}

//fkldsfjklda



















































































































//this is a hidden message for future Aluminati members: Caleb^2 peace out and shoot ur shot