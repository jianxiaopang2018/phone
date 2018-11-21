package top.jianxiaopang.phone.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Utils {

	/**
	 * 把堆栈信息转成字符串
	 * @param t
	 * @return
	 */
	public static String printStackTraceToString(Throwable t) {
		StringWriter sw = new StringWriter();
		t.printStackTrace(new PrintWriter(sw, true));
		return sw.getBuffer().toString();
	}

}