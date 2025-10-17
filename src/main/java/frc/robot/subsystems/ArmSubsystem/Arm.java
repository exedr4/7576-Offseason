package frc.robot.subsystems.ArmSubsystem;

import java.lang.reflect.Type;

import com.ctre.phoenix6.signals.ReverseLimitTypeValue;
import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.ClosedLoopSlot;
import com.revrobotics.spark.SparkAbsoluteEncoder;
import com.revrobotics.spark.SparkBase.ControlType;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkClosedLoopController.ArbFFUnits;
import com.revrobotics.spark.SparkClosedLoopController;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.AlternateEncoderConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.ClosedLoopConfig.FeedbackSensor;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Arm extends SubsystemBase {
    private SparkMax MainMotor;
    private SparkMaxConfig MainMotorConfig;
    private SparkClosedLoopController angleClosedLoopController;
    private RelativeEncoder encoder;
    private double setpoint;



public Arm() {
    MainMotor = new SparkMax(Constants.MainMotorPort, MotorType.kBrushless);

    MainMotorConfig = new SparkMaxConfig();

    MainMotorConfig.alternateEncoder
    .inverted(true);

    MainMotorConfig
    .inverted(false)
    .idleMode(IdleMode.kBrake);
    }

}
