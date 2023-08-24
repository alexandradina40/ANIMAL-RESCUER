package org.fasttrick;

public class Adopter {
    String name;
    int money;

    public Adopter(String n , int m)
    {
        name=n;
        money=m;
    }

    public void food(Animal animal,AnimalFood mancare)
    {
        System.out.println(name+" just have some "+mancare.name + " food to "+animal.name);
        animal.level_of_hungry=animal.level_of_state-1;
    }
    public void activity(Animal animal)
    {
        System.out.println(name+" has some fun activity with his owner");
        animal.level_of_state=animal.level_of_state+1;
    }
}
