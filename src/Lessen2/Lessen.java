package Lessen2;

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
        System.out.println(this);
    }



    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivan D", "Engineer", "ivan.d@mailbox.com", "8923768312",50000,41);
        empCorp[1] = new Employee("Petr B", "Creator", "petr.b@mailbox.com", "892367614",50000,32);
        empCorp[2] = new Employee("Pip P", "Water pot", "pip.p@mailbox.com", "892376715",10000,43);
        empCorp[3] = new Employee("Nadezda N", "Envelope", "nadezda.n@mailbox.com", "892534316",5000,18);
        empCorp[4] = new Employee("Rom F", "GrinderPencil", "rom.f@mailbox.com", "892314355",3000,21);
        for (Employee employee:empCorp) {
            if (employee.age > 40)
                System.out.println(employee);

        }
    }
}

