package spring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppContext2.class) 
public class AppContext { 
	@Autowired // 자동주입
	private MyLog log = null;
	
	@Bean
	public MyCalc mc() {
//		return new MyCalc(filelog()); // 생성자를 통한 DI
		
		MyCalc mc = new MyCalc();
		mc.setLog(log); //setter를 통한 DI
		return mc; // 생성자를 통한 DI
	}
	
	@Bean
	public HelloService hello() {
		return new HelloServiceEn();
	}
}
