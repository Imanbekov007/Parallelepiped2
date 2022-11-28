import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Shape shape=new Shape(12,12,12);
    try {
        if(shape.getHeight()>20 || shape.getWeight()>20 || shape.getWidth()>20 || shape.getHeight()<0 || shape.getWeight()<0 || shape.getWidth()<0){
            throw new Exception();
        }else {
            System.out.println(shape);
            System.out.print("area of the parallelepiped : ");shape.Area();
            System.out.print("volume of the parallelepiped :");shape.Volume();

        }
    } catch (Exception e) {
        System.out.println("it can't be more than 20 or negative number");
    } catch (InputMismatchException e){
        System.out.println("it can't be letter or symbol");
    }
    }
        }

