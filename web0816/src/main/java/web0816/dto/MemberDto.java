package web0816.dto;

public class MemberDto {
	private String name; 
	private int age;
	
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberDto [name=" + name + ", age=" + age + "]";
	}
	
}
