package com.mycompany.praktika;

public class Pawnshop {
   String place = ("филиал в Грузии");
        public String getPlace(){
            return place;
        }
        String name = ("Золотой клык");
        public String getName(){
            return name;
        }
        void PawnshopOut(){
            System.out.println("ИНФОРМАЦИЯ О ПОСЕЩЕНИИ");
            System.out.println("Расположение: " + place);
            System.out.println("Название ломбарда: " + name);
            System.out.println("");
        }
}
