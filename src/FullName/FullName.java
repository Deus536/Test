package FullName;

public class FullName {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivan I", "Engineer", "ivan.i@mailbox.com", "892312564",50000,41);
        empCorp[1] = new Employee("Petr P", "Creator", "petr.p@mailbox.com", "8923123645",50000,32);
        empCorp[2] = new Employee("Sidr S", "Water pot", "sidr.s@mailbox.com", "892354315",10000,43);
        empCorp[3] = new Employee("Nadezda N", "Envelope", "nadezda.n@mailbox.com", "8923455316",5000,18);
        empCorp[4] = new Employee("Juk J", "GrinderPencil", "juk@mailbox.com", "892354517",3000,21);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}