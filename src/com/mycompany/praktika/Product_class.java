package com.mycompany.praktika;

public class Product_class {
   String cost=("от 500 до 15000");
        public String getCost(){
            return cost;
        }
        String product =("золото,серебро,позолото");
        public String getproduct(){
            return product;
        }
         String nazvaniye = ("кольцо,серьги,цепочки,");
        public String getNazvaniye(){
            return nazvaniye;
        }
        int date_issue = (300419);
        public int getDate_issue(){
            return date_issue;
        }
        int date_end=(300519);
        public int getDate_end(){
            return date_end;
        }
        void  Product_classOut(){
            System.out.println("Тип товара: " + nazvaniye);
            System.out.println("Вид товара: " + product);
            System.out.println("Стоимость: " + cost);
            System.out.println("дата выдачи:" + date_issue);
            System.out.println("дата окончания:" + date_end);
            System.out.println("");
        } 
}
