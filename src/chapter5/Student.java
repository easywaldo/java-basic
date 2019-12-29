package chapter5;

public class Student {
    private String Name;

    private String Address;

    public Student(String name, String address)
    {
        Name = name;
        Address = address;
    }

    public void ShowInfo()
    {
        System.out.println(String.format("이름은 %s  사는 곳은 %s", Name, Address ));
    }
}
