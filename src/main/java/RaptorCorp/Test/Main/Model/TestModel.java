package RaptorCorp.Test.Main.Model;

public class TestModel {
	
	private String name;
	private String TestData;
	private String role;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTestData() {
		return TestData;
	}
	public void setTestData(String testData) {
		TestData = testData;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "TestModel [name=" + name + ", TestData=" + TestData + ", role=" + role + "]";
	}

	
}
