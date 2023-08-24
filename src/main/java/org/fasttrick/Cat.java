package org.fasttrick;

public class Cat extends Animal{
    int age;
    int level_of_health;
    int level_of_hungry;
    int level_of_state;
    String fav_food;
    String name_of_fav_activity;
    int lives;

    public Cat(int a , int lh,int lhh,int ls,String f,String n,int liv)
    {
       age=a;
       level_of_health=lh;
       level_of_hungry=lhh;
       level_of_state=ls;
       fav_food=f;
       name_of_fav_activity=n;
       lives=liv;
    }
}
