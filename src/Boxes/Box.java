package Boxes;

 class Box {
    public int height;
    public int width;
    public int depth;

    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;

    }

    public Box(int value) {
        this.height = value;
        this.width = value;
        this.depth = value;

    }

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;

    }

     @Override
     public String toString() {
         return "\nBox{" +
                 "height=" + height +
                 ", width=" + width +
                 ", depth=" + depth +
                 '}';
     }

     public void SurfaceArea(){
         System.out.println("\nThe surface area of the box is: "+(2*depth*width+2*depth*height+2*height*width));
     }
     public void Volume(){
         System.out.println("\nThe surface area of the box is: "+(height*width*depth));
     }

 }


