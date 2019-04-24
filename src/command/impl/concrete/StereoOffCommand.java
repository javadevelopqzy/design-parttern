package command.impl.concrete;

import command.impl.receiver.*;

/**
 * 电灯的关命令，可以关闭电灯
 */
public class StereoOffCommand implements Command {

	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
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
