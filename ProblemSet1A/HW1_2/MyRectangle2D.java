public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;


    //////////////////
    // Constructors //
    //////////////////
    // The no-arg Constructor
    // Extra note: There is 2 ways to define a class instance in the main code without any parameters
    // 1. Define a no-arg Constructor
    // 2. By default, if no Constructors is defined in the class, then class instances are automatically
    //    set to be defined without any parameters
    public MyRectangle2D(){
        System.out.println("MyRectangle2D No-Arg Constructor");
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    // The 4-arg Constructor
    public MyRectangle2D(double x, double y, double width, double height){
        System.out.println("MyRectangle2D 4-Arg Constructor");
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    /////////////////////////////
    // Accessor/getter methods //
    /////////////////////////////
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }


    /////////////////////////////
    // Mutuator/setter methods //
    /////////////////////////////
    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }


    //////////////////////
    // Instance Methods //
    //////////////////////
    public double getArea(){
        return getHeight() * getWidth();
    }

    public double getPerimeter(){
        return getHeight() * 2 + getWidth() * 2;
    }

    public boolean contains(double x, double y){
        if ((this.x - (this.width / 2.0) < x && x < this.x + (this.width / 2.0)) && (this.y - (this.height / 2.0) < y && y < this.y + (this.height / 2.0))){
            return true;
        } else{
            return false;
        }
    }

    public boolean contains(MyRectangle2D r){
        if ((this.x - (this.width / 2.0) < r.x - (r.width / 2.0) && r.x + (r.width / 2.0) < this.x + (this.width / 2.0)) && (this.y - (this.height / 2.0) < r.y - (r.height / 2.0) && r.y + (r.height / 2.0) < this.y + (this.height / 2.0))){
            return true;
        } else{
            return false;
        }
    }

    public boolean overlaps(MyRectangle2D r) {
        return !(this.x + this.width / 2.0 <= r.x - r.width / 2.0 || // No overlap in x-direction
                r.x + r.width / 2.0 <= this.x - this.width / 2.0 || // No overlap in x-direction
                this.y + this.height / 2.0 <= r.y - r.height / 2.0 || // No overlap in y-direction
                r.y + r.height / 2.0 <= this.y - this.height / 2.0); // No overlap in y-direction
    }
}
