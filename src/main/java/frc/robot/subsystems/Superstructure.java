package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.StringPublisher;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Superstructure extends SubsystemBase {
    
    public enum RobotState {
        DISABLED,
        GROUND_INTAKING,
        STATION_INTAKING,
        SHOOTING,
        PASSING;

        RobotState() {

        }

    }

    public RobotState robotState = RobotState.DISABLED;
    StringPublisher statePublisher = NetworkTableInstance.getDefault().getStringTopic("Subsystems/Superstructure/Robot State").publish();

    @Override
    public void periodic() {
        statePublisher.set(robotState.toString());
    }

}
