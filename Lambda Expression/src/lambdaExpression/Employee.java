package lambdaExpression;

public class Employee {
	
	 private String empName;
	 private int empID;
	 private Boolean isPresent = true;

	 public String getEmpName() {
		 	return empName;
	 }
	 public void setName(String Name) {
		 empName = Name;
	 }
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public Boolean getIsPresent() {
		return isPresent;
	}
	public void setIsPresent(Boolean isPresent) {
		this.isPresent = isPresent;
		
	}
}
