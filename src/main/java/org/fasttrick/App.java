package org.fasttrick;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Animal animal_mic=new Animal();
        animal_mic.age=7;
        animal_mic.fav_food="Wiskas";
        animal_mic.level_of_health=10;

        Veterinar_Doc doctor=new Veterinar_Doc();
        doctor.degree="Chirurug";
        doctor.name="David";

        AnimalFood  mancare=new AnimalFood();
        mancare.diponibility=4;
        mancare.name="Wiskas";
        mancare.price=200;

        Activity_of_Recreation activitate=new Activity_of_Recreation();
        activitate.name="Park";

        Adopter om=new Adopter();
        om.name="Alexandra";
        om.money=1200;
    }
}
