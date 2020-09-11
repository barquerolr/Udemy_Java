package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
    public void setAge(int setAge)
    {
        if( setAge < 0 || setAge > 100)
        {
            this.age = 0;
        }

        else
        {
            this.age = setAge;
        }
    }

    public int getAge()
    {
        return this.age;
    }

    public boolean isTeen()
    {
        boolean teen;

        if(this.age > 12 && this.age < 20)
        {
            teen = true;
        }

        else
        {
            teen = false;
        }

        return teen;
    }

    public String getFullName()
    {
        String name;

        if(this.firstName.isEmpty() && this.lastName.isEmpty())
        {
            name = "";
        }

        if(this.firstName.isEmpty())
        {
            name = lastName;
        }

        if(this.lastName.isEmpty())
        {
            name = firstName;
        }

        else
        {
            name = firstName + " " + lastName;
        }

        return name;
    }
}
