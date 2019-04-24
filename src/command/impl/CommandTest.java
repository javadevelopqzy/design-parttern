package command.impl;

import command.impl.concrete.*;
import command.impl.invoker.*;
import command.impl.receiver.*;

public class CommandTest {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		// 实例化灯
		Light light = new Light();
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		LightOnCommand lightOnCommand = new LightOnCommand(light);

		// 实例化音响
		Stereo stereo = new Stereo();
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);

		MacroCommand macroCommand = new MacroCommand(lightOnCommand, stereoOnWithCDCommand);
		remoteControl.setCommand(2, macroCommand, null);
		remoteControl.onButtonPushed(2);
		remoteControl.undoButtonPushed();

		remoteControl.onButtonPushed(0);
		remoteControl.undoButtonPushed();
		remoteControl.onButtonPushed(1);
		remoteControl.offButtonPushed(0);
		remoteControl.offButtonPushed(1);
	}
}
