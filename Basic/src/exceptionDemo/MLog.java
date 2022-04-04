package exceptionDemo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// 
/**
 * 导入第三方包：
 *右键项目 -> 
 * build path ->
 * configure build path -> 
 * libraries -> 
 * add external jars
 */
// 
public class MLog {
	public static void main(String[] args) {
		Log log = LogFactory.getLog(MLog.class);
        log.info("start...");
        log.warn("end.");
	}
}
