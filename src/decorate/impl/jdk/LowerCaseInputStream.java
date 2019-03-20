package decorate.impl.jdk;

import java.io.*;

/**
 * 实现读取文件时，大写转换为小写
 */
public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read(byte[] b) throws IOException {
		int c = super.read(b);
		return c == -1 ? c : Character.toLowerCase(c);
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i < off + result; i++) {
			b[i] = (byte) Character.toLowerCase(b[i]);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\1.txt");
		FileInputStream fileInputStream = new FileInputStream(f);
		LowerCaseInputStream lowerCaseInputStream = new LowerCaseInputStream(fileInputStream);
		byte[] b = new byte[8];
		int result = lowerCaseInputStream.read(b);
		System.out.println(result == -1 ? "" : new String(b));
	}
}
