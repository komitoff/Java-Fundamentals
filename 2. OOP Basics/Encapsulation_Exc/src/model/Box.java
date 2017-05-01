package model;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box (double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getLength() {
        return length;
    }

    private void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    private void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    //2lw + 2lh + 2wh
    public double calcSurfaceArea() {
        double surfaceArea = (2 * this.getLength() * this.getWidth()) +
                (2 * this.getLength()*this.getHeight()) +
                (2 * this.getWidth() * this.getHeight());
        return surfaceArea;
    }

    //2lh + 2wh
    public double calcLateralSurfaceArea() {
        double lateralSurfaceArea = (2 * this.getLength() * this.getHeight()) +
                (2 * this.getWidth() * this.getHeight());
        return lateralSurfaceArea;
    }

    //wlh
    public double calcVolume() {
        return this.getHeight() * this.getWidth() * this.getLength();
    }
}
