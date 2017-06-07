package basharabum.shapelist;


public class Shape {

    String shapeType;
    String shapeColor;
    String shapeTitle;
    String shapeDescription;


    public Shape(String shapeType, String shapeColor, String shapeTitle, String shapeDescription) {
        this.shapeType = shapeType;
        this.shapeColor = shapeColor;
        this.shapeTitle = shapeTitle;
        this.shapeDescription = shapeDescription;
    }

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeTitle() {
        return shapeTitle;
    }

    public void setShapeTitle(String shapeTitle) {
        this.shapeTitle = shapeTitle;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }

    public void setShapeDescription(String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }
}

