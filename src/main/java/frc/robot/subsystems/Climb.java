// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climb extends SubsystemBase {
public final int motorid=20;
public final TalonFX motor;
  public Climb() {
    motor=new TalonFX(motorid);
    setDefaultCommand(Hold());
  }
public Command climbDown() {
  return this.run(()->{
    motor.set(1);
  });
}
public Command climbUp() {
  return this.run(()->{
    motor.set(-1);
  });
}
public Command Hold() {
  return this.run(()->{
    motor.set(0);
  });
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
