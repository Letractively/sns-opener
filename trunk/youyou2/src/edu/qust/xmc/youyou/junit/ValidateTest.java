package edu.qust.xmc.youyou.junit;

import org.junit.Test;

public class ValidateTest {
	@Test
	public void test(){
		System.out.println(checkEmail("hmilym@gmail.com", "hmilym@gmail.com".length()));
	}
	/**
	 * 检查email输入是否正确
	 * 正确的书写格式为 username@domain
	 * @param value
	 * @return
	 */
	public boolean checkEmail(String value, int length) {
			return value.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")&&value.length()<=length;
	}
 
}
