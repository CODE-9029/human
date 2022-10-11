/**
 * Class Family: you will need to define various methods in Human and Pet 
 * before using this class and uncomment the relevant lines of code below.
 */

public class Family
{
    private Human elspeth;
    private Human fatima;
    private Human susan;
    private Human jane;
    private Human john;
    private Human mary;

    public Family()
    {
        elspeth = new Human("Elspeth", 96);
        fatima = new Human("Fatima", 65);
        john = new Human("John", 31);
        mary = new Human("Mary", 30);
        jane = new Human("Jane", 29);
        susan = new Human("Susan", 67);

        fatima.setMother(elspeth);
        susan.setMother(elspeth);
        jane.setMother(fatima);
        john.setMother(fatima);
        mary.setMother(fatima);

    }
   
    public void test()
    {
        susan.getMother().birthday();
        System.out.println(fatima.getMother().getAge());
    }

}
