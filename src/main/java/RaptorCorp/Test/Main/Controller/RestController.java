package RaptorCorp.Test.Main.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import RaptorCorp.Test.Main.Model.TestModel;
import RaptorCorp.Test.Main.Model.TestModelPojo;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value="/test")
public class RestController {
	
	@RequestMapping(value="/all",method=RequestMethod.GET, consumes= "application/json",produces="application/json",headers="content-type=application/json")
	public TestModelPojo getTestModel() {
		TestModel tm1 = new TestModel();
		tm1.setName("nitin");
		tm1.setRole("developer");
		tm1.setTestData("Developing the application");
		TestModel tm2 = new TestModel();
		tm2.setName("Vangara");
		tm2.setRole("Tester");
		tm2.setTestData("Testing the application");
		TestModel tm3 = new TestModel();
		tm3.setName("Foxy");
		tm3.setRole("Support");
		tm3.setTestData("Supporting the application");
		TestModelPojo tmp = new TestModelPojo();
		TestModel tma[] = {tm1,tm2,tm3};
		tmp.setArrayModel(tma);
		System.out.println("test");
		return tmp;
		
	}
	
	@RequestMapping(value="/store",method=RequestMethod.POST,consumes= "application/json",produces={"application/json"})
	public String getPostTest(@RequestBody TestModel tm) {
		System.out.println(tm);
		return "Test model posted successfully";
	}
}
