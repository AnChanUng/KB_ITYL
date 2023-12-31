package spring01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class MemberContext {
	
	@Bean
	public MemberDaoImpl membeDao() {
		return new MemberDaoImpl();
	}
	
	
	@Bean
	public MemberDaoMySqlImpl memberMySqlDao() {
		return new MemberDaoMySqlImpl();
	}
	
	@Bean
	MemberService memberService() {
		return new MemberService();
	}
}
