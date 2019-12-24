package org.firstinspires.ftc.teamcode.ftc16072;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

class QQ_ActionRotateTo extends QQ_AutoAction {
    private double angleRadians;

    QQ_ActionRotateTo(double angle, AngleUnit angleUnit) {
        angleRadians = angleUnit.toRadians(angle);
    }

    @Override
    boolean run(Robot robot, double gameTime, Telemetry telemetry) {
        return robot.nav.rotateTo(angleRadians, AngleUnit.RADIANS);
    }
}
