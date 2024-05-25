package Project1;

/*Create a Java class named Employee with the following attributes:

        - name (String)
        - id (int)
        - department (String)
        Make id a final variable.
        Include a constructor to initialize the attributes.
        Create a method display() that prints the employee details (name, id, department).*/
public class Employee {
    String name;
    public final int id; //Make id a final variable.
    String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.department = department;
        this.id = id;
    }

    public void display() {
        System.out.println(name + " " + id + " " + department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Hien", 12, "H");
        e.display();
        e.setName("Nhu"); // need get and set method to set Name
        e.display();
    }
}
