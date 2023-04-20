package Exercice.P02encaptulation.P01ClassBoxDataValidation;

public class Box {
    //length: double
    //width:  double
    //height:  double

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {

        if (length <= 0){
            throw new IllegalStateException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalStateException("Width cannot be zero or negative.");
        }

        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalStateException("Height cannot be zero or negative.");
        }
        this.height = height;
    }


    //calculateSurfaceArea (): double
    public double calculateSurfaceArea(){
        //Surface Area = 2lw + 2lh + 2wh
        return (2*length*width) + (2*length*height)+(2*width*height);
    }
    //calculateLateralSurfaceArea (): double
    public double calculateLateralSurfaceArea (){
        //Lateral Surface Area = 2lh + 2wh
        return (2* length * height) + (2 * width * height);
    }
    //calculateVolume (): double
    public double calculateVolume(){
        //Volume = lwh
        return length * width * height;
    }
}
