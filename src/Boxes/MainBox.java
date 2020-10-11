package Boxes;

import java.util.Arrays;

public class MainBox {

    public static void main(String[] args) {
        Box[] boxes=new Box[3];

        boxes[0]=new Box();
        boxes[1]=new Box(12);
        boxes[2]=new Box(15, 20, 13);

        System.out.println(Arrays.toString(boxes));
        boxes[2].SurfaceArea();
        boxes[2].Volume();

    }
}
