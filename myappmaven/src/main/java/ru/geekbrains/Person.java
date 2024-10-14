package ru.geekbrains;

import com.google.gson.Gson;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    @ToStringExclude
    private String json;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public void Serialize() {
        Gson gson = new Gson();
        json = gson.toJson(this);
        gson.toJson(this);
        System.out.println("Объект сериализован");
    }

    public void Deserialize() {
        Gson gson = new Gson();
        gson.fromJson(json, Person.class);
        System.out.println("Объект десериализован");
    }

}