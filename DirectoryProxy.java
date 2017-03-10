import java.util.*;

public class DirectoryProxy implements Directory {
	
	private MainDirectory md = new MainDirectory();
	
	public void add(ArrayList<Employee> employees) {
		sort(employees);
		add(employees);
	}
	
	public void print() {
		md.print();
	}
	
	public void clear() {
		md.clear();
	}
	
	public void sort(List<Employee> employees) {
		   Collections.sort(employees, new Comparator<Employee>() {
		       public int compare(Employee p1, Employee p2) {
		            int res =  p1.getLastName().compareToIgnoreCase(p2.getLastName());
		            if (res != 0)
		                return res;
		            return p1.getFirstName().compareToIgnoreCase(p2.getFirstName());
		       }
		   });
	}

}
