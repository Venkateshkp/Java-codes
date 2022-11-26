package OOPS;

public class Enum {
    enum Week{
        Sunday, Monday, Tuesday, Wednesday;
    }
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for(Week day: Week.values()){
            System.out.println(day);
        }
    }
}
