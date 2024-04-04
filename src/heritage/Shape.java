package heritage;

import java.util.Scanner;

public class Shape {

    public double getArea(){
        return 0 ;
    }
}

class Rectagle extends  Shape {
    @Override
    public double getArea() {
        Scanner scan = new Scanner(System.in);
        double base;
        while (true) {
            System.out.println("Entre la base :");
            try {
                base = scan.nextDouble();
            } catch (Exception e) {
                System.out.println("Entre une valeur possible");
                continue;
            }
            break;

        }
        double hauteur;
        while (true) {
            System.out.println("Entre la hauteur :");
            try {
                hauteur = scan.nextDouble();
            } catch (Exception e) {
                System.out.println("Entre une valeur possible");
                continue;
            }
            break;

        }
        return base * hauteur;
    }
}

class Cercle extends Shape {
        @Override
        public double getArea() {

            Scanner scan = new Scanner(System.in);
            double rayon;
            while (true) {
                System.out.println("Entre la rayon :");
                try {
                    rayon = scan.nextDouble();
                } catch (Exception e) {
                    System.out.println("Entre une valeur possible");
                    continue;
                }
                break;

            }
            return Math.pow(rayon, 2) * Math.PI;
        }
    }
