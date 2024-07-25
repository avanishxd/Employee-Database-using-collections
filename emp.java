package com.code2;
import java.util.*;


public class EmpProj {

	private int id;
	private String EmpName;
	private float sal;
	private String dept;
	private String post;
	private float exp;
	
	
	public EmpProj(int id, String EmpName, float sal, String dept, String post, float exp) {
		this.id = id;
		this.EmpName = EmpName;
		this.sal = sal;
		this.dept = dept;
		this.post = post;
		this.exp = exp;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	
	
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + EmpName + ", Salary: " + sal + ", Department: " + dept + ", Post: " + post + ", Work Experience: " + exp;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("-----------------Employee Data Mini Project-----------------");
		
		ArrayList <EmpProj> list = new ArrayList <> ();
		
		while (true) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\n\n_______________________________Operations:_______________________________");
			System.out.println("Choose: 1.Add Employee 2.View All Employees 3.Update Employee 4.Remove Employee 5.View Specific Employees 6.View Employee above certain salary 7.Exit");
			System.out.println("\nEnter choice: ");
			int ch = Integer.parseInt(sc.nextLine());
			
			switch(ch) {
			
			case 1:
				System.out.println("__________________________________Add Employee_______________________________________");
				System.out.println("\nEnter ID: ");
				int id = Integer.parseInt(sc.next());
				System.out.println("Enter Name: ");
				String EmpName = sc.next();
				System.out.println("Enter Salary: ");
				float sal = sc.nextFloat();
				System.out.println("Enter Department: ");
				String dept = sc.next();
				System.out.println("Enter Post: ");
				String post = sc.next();
				System.out.println("Enter Work Experience: ");
				float exp = sc.nextFloat();				
				list.add(new EmpProj(id,EmpName,sal,dept,post,exp));
				System.out.println("\n=========================Employee Details========================= ");
				
				for(EmpProj e: list) {
					System.out.println(e);
				}
				
				break;
				
			case 2:
				System.out.println("\n=========================Employee Details========================= ");
				
				for(EmpProj e: list) {
					System.out.println(e);
				}
				break;
				
			case 3:
				System.out.println("__________________________________Update Employee_______________________________________");
				System.out.println("\nEnter id of  which Employee data to be updated: ");
				int id1 = Integer.parseInt(sc.nextLine());
				for(EmpProj e: list) {
					if(e.getId()==id1) {
						System.out.println("Enter which field to be updated: ");
						System.out.println("1.ID 2.Name 3.Salary 4.Department 5.Post 6.Work Experience");
						int ch1 = Integer.parseInt(sc.nextLine());
						
						switch(ch1) {
						
						case 1:
							System.out.println("Enter updated ID: ");
							id = Integer.parseInt(sc.nextLine());
							e.setId(id);
							break;
							
						case 2:
							System.out.println("Enter updated Name: ");
							EmpName = sc.nextLine();
							e.setEmpName(EmpName);
							break;
							
						case 3:
							System.out.println("Enter updated Salary: ");
							sal = Integer.parseInt(sc.nextLine());
							e.setSal(sal);
							break;
							
						case 4:
							System.out.println("Enter updated Department: ");
							dept = sc.nextLine();
							e.setDept(dept);
							break;
							
						case 5:
							System.out.println("Enter updated Post: ");
							post = sc.nextLine();
							e.setPost(post);
							break;
							
						case 6:
							System.out.println("Enter updated Work Experience: ");
							exp = Integer.parseInt(sc.nextLine());
							e.setExp(exp);
							break;
							
						default:
							System.out.println("Invalid choice!");
							break;
						}
						
					}
					else {
						System.out.println("Employee ID not Found!");
					}
				}
				break;
				
			case 4:
				System.out.println("__________________________________Remove Employee_______________________________________");
				System.out.println("\nEnter Employee ID which has to be removed: ");
				int id2 = Integer.parseInt(sc.nextLine());
				for(EmpProj e: list) {
					if(e.getId()==id2) {
						list.remove(e);
						System.out.println("Employee successfully removed of ID - "+id2);
						break;
					}
				}
				break;
				
				
			case 5:
				System.out.println("__________________________________View Specific Employee_______________________________________");
				System.out.println("Enter Id of Employee you wish to view: ");
				int id3 = sc.nextInt();
				for(EmpProj e: list) {
					
					if(e.getId()==id3) {
						System.out.println("Employee Id: "+id3+" details:");
						System.out.println(e);
					}
				
				}
				break;
				
			case 6:
				System.out.println("__________________________________View Employees above certain salary_______________________________________");
				System.out.println("Enter Designated Salary: ");
				float sal1 = sc.nextFloat();
				for(EmpProj e: list) {
					if(e.getSal()>=sal1) {
						System.out.println("Employee above salary "+sal1+"/- are as follows:");
						System.out.println(e);
					}
				}
				break;
				
			case 7:
				System.out.println("=====Thank You!=====");
				return;
				
			default:
				System.out.println("Invalid Choice!");
				break;
				
			}
	
			
		}
	}
			
}
