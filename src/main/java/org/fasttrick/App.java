package org.fasttrick;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Veterinar_Doc doctor;
        Animal pisica=new Animal("Mica",3,2, 1, 6,"Whiskas","Park");
        doctor=new Veterinar_Doc("David", "Chirurg");


        AnimalFood  mancare=new AnimalFood("Whiskas",100,3,12,5);


        Activity_of_Recreation activitate=new Activity_of_Recreation("Park");


        Adopter om=new Adopter("Alexandra",1200);

        om.food(pisica,mancare);
        om.activity(pisica,activitate);
    }
}
