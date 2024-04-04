package heritage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Animal[] zoo = {new Cat(),new Cat(),new Cat(), new Chien(),new Chien(),new Chien(),};
        //for (Animal val: zoo){
          //  val.makeSound();
       // }
        //Shape[] geo = {new Rectagle(), new Cercle()};
        //double area = 0;
        //for (Shape val: geo){
            //area += val.getArea();
        //}
        //System.out.println("Le total des aires est de : " + area);

        //System.out.println(new Employe("Maxime", "Fournier", "12345", "Enseignant"));

        Compagnie bell = new Compagnie();
        bell.ajouterEmploye(new Emp(3500));
        bell.ajouterEmploye(new Emp(1200));
        bell.CoutAnnuel();
        bell.CoutAnnuel();

    }



}