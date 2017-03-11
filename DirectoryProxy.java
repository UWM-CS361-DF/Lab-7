import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;

public class DirectoryProxy implements Directory {
	
	ArrayList<Employee> employees =new ArrayList<Employee>();
	private MainDirectory md = new MainDirectory();
	Gson g = new Gson();
	String json;
	
	public void add(String employees) {
		if(!employees.equals("END")){
			String[] input=employees.split(" ");
			this.employees.add(new Employee(input[0],input[1],Integer.parseInt(input[2]),input[3]));
			sort(this.employees);
		}
		else{
			json = g.toJson(this.employees);
			md.add(json);
		}
	}
	public void print() {
		md.print();
	}
	public void clear() {
		employees.clear();
		md.clear();
	}
	public void sort(List<Employee> employees) {
		   Collections.sort(employees, new Comparator<Employee>() {
		       public int compare(Employee p1, Employee p2) {
		            int res =  p1.getLastName().compareToIgnoreCase(p2.getLastName());
		            if (res == 0)
		            	return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
		            else
		            	return res;
		       }
		   });
	}

}
