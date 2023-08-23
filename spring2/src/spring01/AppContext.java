package spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppContext2.class)
public class AppContext { 
	@Autowired // �ڵ�����
	private MyLog log = null;
	
	@Bean
	public MyCalc mc() {
//		return new MyCalc(filelog()); // �����ڸ� ���� DI
		
		MyCalc mc = new MyCalc();
		mc.setLog(log); //setter�� ���� DI
		return mc; // �����ڸ� ���� DI
	}
	
	@Bean
	public HelloService hello() {
		return new HelloServiceEn();
	}
}
