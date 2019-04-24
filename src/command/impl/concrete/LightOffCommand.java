package command.impl.concrete;

import command.impl.receiver.*;

/**
 * 电灯的关命令，可以关闭电灯
 */
public class LightOffCommand implements Command {

	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}
}
