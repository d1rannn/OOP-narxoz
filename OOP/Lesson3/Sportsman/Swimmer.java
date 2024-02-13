package OOP.Lesson3.Sportsman;

public class Swimmer extends Sportman
{
    private String style;
    private double recordTime;

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(double recordTime) {
        this.recordTime = recordTime;
    }

    public String play() {
        return "Sportsman "+fullName+" from "+country+" "+age+" y.o. with "+style+" swam in "+recordTime+" ";
    }
}
