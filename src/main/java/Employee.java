import org.omg.PortableInterceptor.ServerRequestInfo;

// Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
// Конструктор класса должен заполнять эти поля при создании объекта.
// Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
public class Employee {
    public String Name;
    public int Age;
    public String Position;
    public String Email;
    public String Phone;
    public Double Salary;

    public Employee(String name, int age, String position, String email, String phone, double salary){
        this.Name = name;
        this.Age = age;
        this.Phone = phone;
        this.Position = position;
        this.Email = email;
        this.Salary = salary;
    }

    public String toString(){
        String s = Name + ", " + Age  + ", " + Position + ", " + Email + ", " + Phone + ", " + Salary;
        return s;
    }
}
