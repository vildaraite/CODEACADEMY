package lt.codeacademy.first.project.examples.collection.list.tasks;

import java.util.ArrayList;

public class CordinateMain {
    public static void main(String[] args) {
        CordinateMain task = new CordinateMain();
        ArrayList<Coordinate> coordinateList = new ArrayList<>();

        coordinateList.add(new Coordinate(1, 5));
        coordinateList.add(new Coordinate(5, 9));
        coordinateList.add(new Coordinate(4, 0));
        coordinateList.add(new Coordinate(0, 0));
        coordinateList.add(new Coordinate(9, 1));

        task.printCoordinate(coordinateList);


    }

    private void printCoordinate(ArrayList<Coordinate> coordinateList) {
        System.out.println("Kordinates esancios sarase:");
        for (Coordinate cr : coordinateList) {
            System.out.printf("(%s, %s)%n", cr.getX(), cr.getY());
        }
    }

    private void whichInList(ArrayList<Coordinate> coordinateList, int x, int y) {
        for (Coordinate cr : coordinateList) {
            int xFromObject = cr.getX();
            int yFromObject = cr.getY();
            if (x == xFromObject && y == yFromObject) {
                System.out.printf("Koordinates (%s, %s) yra %s-os sarase%n", x, y, coordinateList.indexOf(cr));
                break;
                /*
            }else {
                System.out.println("Tokiu koordinaciu srase nera");
            } */ // nereikia eiti per visa sarasa, jei jau radome koordinate
            }
        }

    }

    private void changeCoordinate (ArrayList<Coordinate> coordinateList, int x, int y, int xTo, int yTo){
        for (Coordinate cr: coordinateList) {
            int xFromObject = cr.getX();
            int yFromObject = cr.getY();
            if (x == xFromObject && y == yFromObject) {
                cr.setX(xTo);
                cr.setY(yTo);
                System.out.printf("Kordinates (%s, %s) pakeistos i (%s, %s)%n", x, y, xTo, yTo);
                break;
            }else {
                System.out.println("Tokiu koordinaciu sarase nera");
            }
        }
    }
}
