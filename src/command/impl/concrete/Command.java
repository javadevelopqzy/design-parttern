package command.impl.concrete;

/**
 * 每一个命令接口的实现都是一个"接收者"
 */
public interface Command {

	void execute();

	/**
	 * 撤销操作
	 */
	void undo();
}
