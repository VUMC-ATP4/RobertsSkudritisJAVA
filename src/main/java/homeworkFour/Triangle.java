package homeworkFour;
import java.lang.Math;
import java.util.Scanner;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;
//    int height;
//    int lenght;
    double area;

    int sideD = 3;
    int sideE = 8;
    int sideF = 9;

    Triangle(){
        System.out.println("Veidojam trijstūri!");
    }

    public double getTriangleArea() {

        int halfPerimeter = (sideA + sideB + sideC)/2;
        return area = Math.sqrt(halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC));
    }

    public void equilateralTriangle(){
        boolean equilateral;
        if (sideA == sideB && sideB == sideC)
            equilateral = true;
                else equilateral = false;
        System.out.println("Vai trijstūris ir vienādmalu? "+equilateral);
    }

    public void isocelesTriangle(){
        boolean isoceles;
        if (sideA == sideB || sideB == sideC || sideC == sideA)
            isoceles  = true;
        else isoceles  = false;
        System.out.println("Vai trijstūris ir vienādsānu? "+isoceles);
    }

    public void generateNewTriangle(){
    int sideD = 3;
    int sideE = 8;
    int sideF = 4;
    sideA = sideD;
    sideB = sideE;
    sideC = sideF;
    getTriangleArea();
    isocelesTriangle();
    equilateralTriangle();
    }

    }
