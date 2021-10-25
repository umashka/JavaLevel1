public class Lesson5 {
    public static void main(String[] args){

        // Создать массив из 5 сотрудников.
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Karina Ivanova", 27, "CEO", "karina@gmail.com", "+79031234567", 900000.00);
        employees[1] = new Employee("Ivan Oliev", 41, "Product Manager", "ivan@gmail.com", "+79030987654", 500000.01);
        employees[2] = new Employee("Olga Petrova", 35, "Team Leader", "olga@gmail.com", "+79033459812", 300000.02);
        employees[3] = new Employee("Petr Sidorov", 53, "System Architect", "petr@gmail.com", "+79032397104", 350000.03);
        employees[4] = new Employee("Sidor Karinov", 65, "System Analyst", "sidor@gmail.com", "+79038532712", 400000.04);

        // С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (Employee e: employees) {
            if (e.Age > 40)
                System.out.println(e.toString());
        }

        // Выведено на консоль:
        // Ivan Oliev, 41, Product Manager, ivan@gmail.com, +79030987654, 500000.01
        // Petr Sidorov, 53, System Architect, petr@gmail.com, +79032397104, 350000.03
        // Sidor Karinov, 65, System Analyst, sidor@gmail.com, +79038532712, 400000.04
    }
}
