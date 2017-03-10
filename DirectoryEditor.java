import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;


public class DirectoryEditor {

	public static void main(String[] args){
		Scanner scIn;
		String stringInput;
		String[] input;

		ArrayList<Employee> employee =new ArrayList<Employee>();
		DirectoryProxy dp = new DirectoryProxy();
		
		try{
			if (args.length > 0 ){
				scIn = new Scanner(new File(args[0]));
			}
			else{
				scIn = new Scanner(System.in);
			}
			loop:while(scIn.hasNextLine()){
				try{
					if(args.length>0){
						stringInput=scIn.nextLine().trim();
						Thread.sleep(1000); //wait 1 second before next line is executed
					}
					else
						stringInput=scIn.nextLine();
					
					if(stringInput.equals("ADD")){
						while(!(stringInput=scIn.nextLine()).equals("END")){
							input=stringInput.split(" ");
							employee.add(new Employee(input[0],input[1],input[2],input[3]));
						}
						dp.add(employee);
					}
					else if(stringInput.equals("PRINT")){
						dp.print();
					}
					else if(stringInput.equals("CLR")){
						dp.clear();
						employee.clear();
					}
					else
						throw new Exception("Illegal Input");
				}catch(Exception e){
					System.out.println("Illegal Input");
					continue loop;
				}
			}
		}catch(FileNotFoundException e){
			System.out.println("Invalid Input File");
		}
	}
}