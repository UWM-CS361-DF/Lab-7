import java.util.ArrayList;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainDirectory implements Directory {
	
	private Gson gson = new Gson();
	ArrayList<Employee> mainDirectory = new ArrayList<Employee>();
	
	public MainDirectory() {}
	
	public void add(String employees) {
		mainDirectory = (gson.fromJson(employees, new TypeToken<Collection<Employee>>(){}.getType()));
	}
	
	public void print() {
		if(mainDirectory.isEmpty())
			System.out.println("<empty directory>");
		else{
			for (Employee pp: mainDirectory) {
				System.out.println(pp);
			}System.out.println();
		}
	}
	public void clear() {
		mainDirectory.clear();
	}
}