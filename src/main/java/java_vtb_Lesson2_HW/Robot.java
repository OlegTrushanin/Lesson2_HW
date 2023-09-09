package java_vtb_Lesson2_HW;

public class Robot implements Action{

    double wall_max = 5;
    double length_max = 20;

    String name;
    boolean stop;

    public Robot(String name){

        this.name = name;
        this.stop = true;
    }

    @Override
    public void action(Let let) {

        if (let instanceof Treadmill) {
            if (this.stop) {
                if (((Treadmill) let).length_track <= length_max) {
                    System.out.println("Робот " + this.name + " пробежал " + ((Treadmill) let).length_track + "  км.");
                } else {
                    System.out.println("Робот может пробежать не более " + length_max + " км.");
                    stop = false;
                }
            } else {
                System.out.println("Робот " + this.name + " сошел с дистанции");
            }

        } else {
            if (stop) {
                if (((Wall) let).wall_height <= wall_max) {
                    System.out.println("Робот " + this.name + " перепрыгнул препятствие " + ((Wall) let).wall_height + " м.");
                } else {
                    System.out.println("Робот может перепрыгнуть препятствие не более " + wall_max + " м.");
                    stop = false;
                }
            } else {
                System.out.println("Робот " + this.name + " сошел с дистанции");
            }
        }

    }



}
