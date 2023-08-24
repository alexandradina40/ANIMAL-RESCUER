package org.fasttrick;

public class AnimalFood {
    String name;
    double price;
    int quantity;
    int expiration_date;
    int diponibility;

    public AnimalFood(String n , double p ,int q, int e, int d)
    {
        name=n;
        price=p;
        quantity=q;
        expiration_date=e;
        diponibility=d;
    }
}
