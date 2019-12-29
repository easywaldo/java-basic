package chapter5;

public class Person {
    private String Name;

    private int Age;

    private boolean IsMarried;

    private int ChildrenCount;

    public Person(
            String name,
            int age,
            boolean isMarried,
            int childrenCount)
    {
        this.Name = name;
        this.IsMarried = isMarried;
        this.ChildrenCount = childrenCount;
        this.Age = age;
    }

    public void ShowInfo()
    {
        System.out.println(String.format("이름 : %s \n 나이: %d \n 결혼여부: %s \n 자녀수: %d", this.Name, this.Age, this.IsMarried, this.ChildrenCount));
    }

    /*public static void main(String args[])
    {
        Person james = new Person("James", 40, true, 1);
        james.ShowInfo();
    }*/
}
