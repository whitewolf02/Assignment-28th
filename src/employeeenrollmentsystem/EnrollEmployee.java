package employeeenrollmentsystem;

public class EnrollEmployee 
{
    public static void main(String[] args) 
    {
        BankEmployee bob = new BankEmployee("Bob", 10, 30, 30000, "SBSA");
        BankEmployee jerry = new BankEmployee("Jerry", 20, 20, 20000, "SBSA");
        BankEmployee tom = new BankEmployee("Tom", 30, 40, 50000, "SBSA");       
        
        bob.activateEmployee();
        jerry.activateEmployee();
        tom.activateEmployee();
        
        bob.displayEmployee();
        jerry.displayEmployee();
        tom.displayEmployee();
        
        bob.deactivateEmployee();
        
        BankEmployee newOne = bob;
        
        if (newOne.equals(bob)) 
        {
            System.out.println("newOne equal to bob!");
        }
        else
        {
            System.out.println("newOne not equal to bob!");
        }
        
        try{
            newOne.setSalary(10000);
        }catch(Exception e){System.out.println(e.getMessage());}
        
        try{
            tom.setSalary(40000);
        }catch(Exception e){System.out.println(e.getMessage());}
                
        try{
            jerry.setSalary(50000);
        }catch(Exception e){System.out.println(e.getMessage());}
                        
        try{
            jerry.setSalary(1000);
        }catch(Exception e){System.out.println(e.getMessage());}
        
        try{
            tom.setSalary(200000);
        }catch(Exception e){System.out.println(e.getMessage());}
        
        System.out.println(bob);
        System.out.println(jerry);
        System.out.println(tom);
        System.out.println(newOne);
    }
}
