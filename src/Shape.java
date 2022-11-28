public class Shape {
    private int height;
    private int length;
    private int width;

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", weight=" + length +
                ", width=" + width +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return length;
    }

    public void setWeight(int weight) {
        this.length = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Shape(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public void Volume(){
        System.out.println(height*length*width);
    }public void Area(){
        System.out.println(2*((height * length) + (length * width) + (height * width)));
    }
}
// 2*((height * length) + (length * width) + (height * width));