package command.impl.concrete;

/**
 * 宏命令，比如按下一个按钮同时打开音响和灯
 */
public class MacroCommand implements Command {

	private Command[] commands;

	public MacroCommand(Command... commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		for (Command command : commands) {
			command.undo();
		}
	}
}
