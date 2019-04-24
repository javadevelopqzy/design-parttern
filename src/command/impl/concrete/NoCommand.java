package command.impl.concrete;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("do nothing");
	}

	@Override
	public void undo() {

	}
}
