public class Coordinates {
    private Long x; //Поле не может быть null
    private Float y;

    public Coordinates(){
        this.x = 0L;
        this.y = 0f;
    }

    public Long getX(){return this.x;}
    public Float getY(){return this.y;}

    public void setX(){this.x = x;}
    public void setY(){this.y = y;}
}