import java.text.NumberFormat;
class Job{
    protected String name;
    protected int salary;
    
    public Job(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String output;
        output=
                "Name=" + name  +
                ",Salary earned=" + NumberFormat.getCurrencyInstance().format(salary);
        return output;
    }
}
