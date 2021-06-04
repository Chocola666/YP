package com.mycompany.praktika;

public class Seller {
    int id = (3368);
        public int getID(){
            return id;
        }
        String FIO = ("Бондарь Антон Сергеевич");
        public String getFIO(){
            return FIO;
        }
         int date_start = (120622);
        public int getDate_start(){
            return date_start;
        }
         int date_end = (220626);
        public int getDate_end(){
            return date_end;
        }
        void SellerOut(){
            System.out.println("Имя продовца: " + FIO);
            System.out.println("Номер продовца: " + id);
            System.out.println("Дата начала работы: " + date_start);
            System.out.println("Дата истечения рабочего контракта: " + date_end);
            System.out.println("");
        } 
}
