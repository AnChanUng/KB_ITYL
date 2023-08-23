package spring01;

import org.springframework.beans.factory.annotation.Autowired;

import spring01.dto.MemberDto;

public class MemberService {
	@Autowired
	private MemberDao dao = null;
	
	public boolean login(String id, String passwd) {
		System.out.println("dao="+dao);
		return false;
	}
}