package employeeenrollmentsystem;

public abstract class Employee implements IEmployee 
{
    private final String name;
    private final int employeeType;
    private final int age;
    private final int salary;
    private boolean active = false;

    public Employee(String name, int employeeType, int age, int salary) 
    {
        this.name = name;
        this.employeeType = employeeType;
        this.age = age;
        this.salary = salary;
        
    }
    
    @Override
    public void displayEmployee()
    {
        System.out.print("Name: " +this.name+ " EmpType: " +this.employeeType+ " Age: " +this.age+ " Salary: " +this.salary);
    }
    
    @Override
    public void activateEmployee()
    {
        active = true;
    }
    
    @Override
        public void deactivateEmployee()
    {
        active = false;
    }
        
    public void setSalary(int salary) throws Exception
    {
        if (salary < 10000) 
        {
            throw new IllegalArgumentException("salary too low");
        }
        else if (salary > 100000)
        {
            throw new IllegalArgumentException("salary too high");
        }
        else if (employeeType == MANAGER && salary < 20000)
        {
            throw new IllegalArgumentException("salary not enough");
        }
        else if(employeeType == DEVELOPER && salary > 30000)
        {
            throw new IllegalArgumentException("salary out of range");
        }
        else if(employeeType == EXECUTIVE && salary < 50000)
        {
            throw new IllegalArgumentException("salary not in range");
        }     
    }
    
    @Override
    public String toString()
    {
        String details = name + " "+ employeeType + " "+ age + " "+ salary + " "+ active;
        return details;
    }
    
    public boolean equals(Employee emp)
    {
        if(emp == this)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
