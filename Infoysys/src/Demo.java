import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Yash",10000);
		Employee e2=new Employee(2,"Alok",49900);
		Employee e3=new Employee(3,"Amit",10700);
		Employee e4=new Employee(4,"Aditi",15000);
		Employee e5=new Employee(5,"Drshiti",60000);
		Employee e6=new Employee(6,"Prashant",50000);
		Employee e7=new Employee(6,"Bala",50500);
		ArrayList<Employee>al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		al.add(e7);
		al.add(1,e5);
		al.set(1,e6);
		System.out.println(al);
		for(Employee e:al)
			System.out.println(e);
		System.out.println("using for loop");
		System.out.println();
		for(int i=0;i<=al.size();i++)
			System.out.println(al.get(i));
		System.out.println("using the loop in backward iteration");
		System.out.println();
		for(int i=al.size()-1;i>=0;i--)
			System.out.println(al.get(i));
	}
}
