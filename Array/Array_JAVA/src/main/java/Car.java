public class Car
{
    public String color;
    public String model;
    public int year;

    public Car (String color, String model, int year)
    {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public Car()
    {
        this.color = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    public void startEngine()
    {
        System.out.println("Engine started");
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }

    public String getModel()
    {
        return this.model;
    }

    public int getYear()
    {
        return this.year;
    }

    @Override
    public String toString()
    {
        return "Car [color=" + color + ", model=" + model + ", year=" + year + "]";
    }

    public void setModel(String model)
    {
        this.model = model;
    }
    public void setYear(int year)
    {
        this.year = year;
    }

    public String getCarDetails()
    {
        return "Car [color=" + color + ", model=" + model + ", year=" + year + "]";
    }
}

