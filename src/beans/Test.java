package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Test {

	public String name = "default";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void doStuff(){
		System.out.println("ostuff");
	}
	public void sayHello(){
		System.out.println(this.name);
		//return null;
	}
}
