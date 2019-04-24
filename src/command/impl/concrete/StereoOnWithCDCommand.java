package command.impl.concrete;

import command.impl.receiver.*;

/**
 * 电灯的关命令，可以关闭电灯
 */
public class StereoOnWithCDCommand implements Command {

	private Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		// 打开音响
		stereo.on();
		// 设置成CD
		stereo.setCD();
		// 设置音量为11
		stereo.setVolume(11);
	}

	@Override
	public void undo() {

	}

	public Stereo getStereo() {
		return stereo;
	}

	public void setStereo(Stereo stereo) {
		this.stereo = stereo;
	}
}
