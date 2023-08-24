package org.fasttrick;

public class Animal {
    String name;
    int age;
    int level_of_health;
    int level_of_hungry;
    int level_of_state;
    String fav_food;
    String name_of_fav_activity;

    public Animal(String n,int a,int l , int lh,int ls,String f , String ac)
    {
        name=n;
        age=a;
        level_of_health=l;
        level_of_hungry=lh;
        level_of_state=ls;
        fav_food=f;
        name_of_fav_activity=ac;
    }
}
