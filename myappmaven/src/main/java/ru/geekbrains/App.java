package ru.geekbrains;

public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person("Николай", "Николаев", 16);
        System.out.println(person.toString());
        person.Serialize();
        person.Deserialize();
    }
}
