package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name  = "teleop1", group = "1")
public class teleop extends LinearOpMode {

    DcMotor r1;
    DcMotor r2;
    DcMotor l1;
    DcMotor l2;
    DcMotor intake;
    DcMotor shoot;

    double SpeedMultiplier = 0.75;

    @Override
    public void runOpMode() throws InterruptedException {

        r1 = hardwareMap.get(DcMotor.class,"r1");
        r2 = hardwareMap.get(DcMotor.class,"r2");
        l1 = hardwareMap.get(DcMotor.class,"l1");
        l2 = hardwareMap.get(DcMotor.class,"l2");
        intake = hardwareMap.get(DcMotor.class,"intake");
        shoot = hardwareMap.get(DcMotor.class,"shoot");

        waitForStart();
        while(!isStopRequested()) {
            //drive code forward and back
            r1.setDirection(DcMotorSimple.Direction.REVERSE);
            r2.setDirection(DcMotorSimple.Direction.REVERSE);
            //backward dpad
            if (gamepad1.dpad_down) {
                r1.setPower(1);
                r2.setPower(-1);
                l1.setPower(-1);
                l2.setPower(-1);
            } else {
                r1.setPower(0);
                r2.setPower(0);
                l1.setPower(0);
                l2.setPower(0);
            }
            //backward joystick
            if (gamepad1.left_stick_y<0) {
                r1.setPower(1);
                r2.setPower(-1);
                l1.setPower(-1);
                l2.setPower(-1);
            } else {
                r1.setPower(0);
                r2.setPower(0);
                l1.setPower(0);
                l2.setPower(0);
            }

            //forward dpad
            if (gamepad1.dpad_up) {
                r1.setPower(-1);
                r2.setPower(1);
                l1.setPower(1);
                l2.setPower(1);
            }
            else {
                r1.setPower(0);
                r2.setPower(0);
                l1.setPower(0);
                l2.setPower(0);
            }
            //forward joystick
            if (gamepad1.left_stick_y>0) {
                r1.setPower(-1);
                r2.setPower(1);
                l1.setPower(1);
                l2.setPower(1);
            }
            else {
                r1.setPower(0);
                r2.setPower(0);
                l1.setPower(0);
                l2.setPower(0);
            }

            //left turn joystick
            if (gamepad1.left_stick_x<0) {
                r1.setPower(-1);
                r2.setPower(1);
                l1.setPower(-1);
                l2.setPower(-1);
            } else {
                r1.setPower(0);
                r2.setPower(0);
                l1.setPower(0);
                l2.setPower(0);
            }
            //right turn dpad
            if (gamepad1.dpad_right) {
                r1.setPower(1);
                r2.setPower(-1);
                l1.setPower(1);
                l2.setPower(1);
            } else {
                r1.setPower(0);
                r2.setPower(0);
                l1.setPower(0);
                l2.setPower(-0);
            }
            //right turn joystick
            if (gamepad1.left_stick_x>0) {
                r1.setPower(1);
                r2.setPower(-1);
                l1.setPower(1);
                l2.setPower(1);
            } else {
                r1.setPower(0);
                r2.setPower(0);
                l1.setPower(0);
                l2.setPower(-0);


            }

            if (gamepad1.right_trigger_pressed) {
                intake.setPower(-1);
            } else {
                intake.setPower(0);
            }
            if (gamepad1.left_trigger_pressed) {
                shoot.setPower(1);
            } else {
                shoot.setPower(0);
            }
        }
    }


}