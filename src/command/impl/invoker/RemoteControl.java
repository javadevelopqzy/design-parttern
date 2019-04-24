package command.impl.invoker;

import java.util.*;

import command.impl.concrete.*;

/**
 * 遥控器类，包含了一组命令，按下按钮对应的命令会执行
 * 这是一个调用者
 */
public class RemoteControl {

	private Command[] onCommand;

	private Command[] offCommand;

	private Command undoCommand;

	public RemoteControl() {
		onCommand = new Command[3];
		offCommand = new Command[3];
		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 3; i++) {
			onCommand[i] = noCommand;
			offCommand[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommand[slot] = onCommand;
		this.offCommand[slot] = offCommand;
	}

	/**
	 * 按下开按钮
	 *
	 * @param slot
	 */
	public void onButtonPushed(int slot) {
		this.onCommand[slot].execute();
		// 记录上一个操作
		undoCommand = this.onCommand[slot];
	}

	/**
	 * 按下关按钮
	 *
	 * @param slot
	 */
	public void offButtonPushed(int slot) {
		this.offCommand[slot].execute();
		// 记录上一个操作
		undoCommand = this.offCommand[slot];
	}

	public void undoButtonPushed() {
		undoCommand.undo();
	}

	@Override
	public String toString() {
		return "RemoteControl{" +
				"onCommand=" + Arrays.toString(onCommand) +
				", offCommand=" + Arrays.toString(offCommand) +
				'}';
	}
}
