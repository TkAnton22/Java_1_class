class HomeWork5 {
    public static void main(String[] args) {

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Vasya Pupkin", "boss", "VasyaBoss@inemail.com", "89112223344", 100000, 65);
        employee[1] = new Employee("Petya Ivanov", "head manager", "PetyaIvanov@mailbox.com", "89113334455", 80000, 60);
        employee[2] = new Employee("Ivan Sidorov ", "manager", "IvanSidorov@mailbox.com", "89114445566", 50000, 45);
        employee[3] = new Employee("Alexey Popov ", "secretary", "AlexeyPopov@mailbox.com", "89115556677", 30000, 35);
        employee[4] = new Employee("Mikhail Kuznetsov ", "driver", "MikhailKuznetsov@mailbox.com", "89116667788", 25000, 25);
        for(int i = 0; i < 5; i++) {
            if(employee[i].getAge() > 40) {
                System.out.println(employee[i]);
            }
        }
    }
}
