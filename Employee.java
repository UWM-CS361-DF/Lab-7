public class Employee {
	
	private String _lastName;
	private String _firstName;
	private String _phoneNumber;
	private String _department;
	
	public Employee(String firstName, String lastName, String phoneNumber, String department ) {
		_lastName = lastName;
		_firstName = firstName;
		_phoneNumber = phoneNumber;
		_department = department;
	}
	
	public void setName(String lastName) {
		_lastName = lastName;
	}
	
	public void setLastName(String firstName) {
		_firstName = firstName;
	}
	
	public String getLastName() {
		return _lastName;
	}
	
	public String getFirstName() {
		return _firstName;
	}
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}
	
	public void setDepartment(String department) {
		_department = department;
	}
	
	@Override
	public String toString() {
		return _lastName + ", " + _firstName + " " + _phoneNumber + " " + _department;
	}
	
	
}