import java_vtb_Lesson2_HW.*;

public class MainApp {

    public static void main(String[] args) {


        Action [] subjects = {
                new Cat("Барсик"),
                new Cat("Bady"),
                new Human("Oleg"),
                new Human("<Andrey>"),
                new Robot("Max"),
                new Robot("XXX")
        };

        Let [] let = {
                new Treadmill(0.2),
                new Wall(2),
                new Treadmill(5),
                new Wall(1),
                new Treadmill(0.4),
                new Treadmill(0.2),
                new Wall(5),
                new Treadmill(15),
                new Treadmill(20),
                new Wall(3),
                new Treadmill(0.4),
                new Treadmill(0.2),
                new Wall(20),


        };


        for(Action a: subjects){
            for(Let b: let){

                a.action(b);
            }
        }







    }


}
