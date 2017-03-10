import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainDirectory implements Directory {
	
	private Gson gson = new Gson();
	private String out;
	ArrayList<Employee> mainDirectory = new ArrayList<Employee>();
	
	public MainDirectory() {}
	
	public void add(ArrayList<Employee> employees) {
		out = gson.toJson(employees);
	}
	
	public void print() {
		System.out.println(out);
		ArrayList<Employee> mainDirectory = new ArrayList<Employee>();
		
	}
	
	public void clear() {
		out = null;
	}
}
