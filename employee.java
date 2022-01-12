class Employee 
{
    protected String name;
    protected int age;

    Employee(String n, int a) 
    {
        name = n;
        age = a;
    }

    void display()
    {
        // display the name and age
        System.out.println("Employee");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Worker extends Employee
{
    int hoursWorked;
    int salaryPerHour;

    Worker(String name, int age, int hw, int sph)
    {
        // call base class constructor
        super(name, age);
        // initialize hoursWorked and salaryPerHour
        hoursWorked = hw;
        salaryPerHour = sph;
    }

    int totalSalary() 
    {
        // calculate total salary
        // return total salary
        return hoursWorked * salaryPerHour;
    }

    void display() // override base class display method
    {
        super.display();
        System.out.println("Worker");
        System.out.println("Total Salary: " + totalSalary());
        // call base class display
        // display total salary
    }
}

class Manager extends Employee
{
    String dept;
    int salary;

    Manager(String name, int age, String dept, int salary)
    {
        super(name, age);
        this.dept = dept;
        this.salary = salary;
        //call base class constructor to initialize name and age
        //initialize the dept and salary 
    }

    void display() // override base class display method
    {
        super.display();
        System.out.println("Manager");
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
        // call base class display
        // display department and salary
    }
}

class Main
{
    public static void main(String[] args)
    {
        Employee e = new Employee("Jadu", 30);
        e.display();
        System.out.println();
        // create an object of Worker class
        Worker w = new Worker("Shyam", 30, 40, 100);
        // call display method of Worker class
        w.display();
        System.out.println();
        // create an object of Manager class
        Manager m = new Manager("Ram", 45, "Design", 50000);
        // call display method of Manager class
        m.display();
        System.out.println();
    }
}