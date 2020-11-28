package code._4_student_effort;

public abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    abstract void eat();

    void walk()
    {
        System.out.println("This animal walk on " + legs+ " legs");
    }

}
