class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Demo {
public static void main(String[] args) {

	Std std1=new Std(2,"Arjun");
	Std std2=new Std(10,"Anil kumar");
	std1.display();
	std2.display();
		}
}
