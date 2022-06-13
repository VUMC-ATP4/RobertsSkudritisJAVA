package homeworkFour;

import classroomFour.Rinkis;

public class Main {

    public static void main(String[] args){

            Triangle trijsturis1 = new Triangle();
            trijsturis1.sideA = 5;
            trijsturis1.sideB = 5;
            trijsturis1.sideC = 7;
            trijsturis1.getTriangleArea();
            trijsturis1.equilateralTriangle();
            trijsturis1.isocelesTriangle();
            System.out.println("Trijstūra laukums ir " +trijsturis1.getTriangleArea());

            System.out.println("<---------------------------------->");

            Triangle trijsturis2 = new Triangle();
            trijsturis2.generateNewTriangle();

        }


    }

