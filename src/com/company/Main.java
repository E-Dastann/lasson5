package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss1 = new Boss();
        boss1.setHealth(600);
        boss1.setDamage(50);
        boss1.setTipZashity("защита");

        System.out.println("boss " + boss1.getHealth() + "хп " + boss1.getDamage() + "урон " + boss1.getTipZashity() + "-способность ");

        
        Hero[]heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println( "урон героя-"+heroes[i].getDamage() + "жизнь героя-" + heroes[i].getHealth()+" защита"+heroes[i].getSuperPower());
            
        }

    }

    public static Hero[] createHeroes() {
        Hero hero1= new Hero(200,40);
        Hero hero2= new Hero(250,50);
        Hero hero3= new Hero(270,30,"магия");

        Hero[]heroes={hero1,hero3,hero2};
        return heroes;

    }
}
