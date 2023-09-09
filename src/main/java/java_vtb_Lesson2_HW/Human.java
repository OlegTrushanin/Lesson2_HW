package java_vtb_Lesson2_HW;

public class Human implements Action{

    double wall_max = 3;
    double length_max = 10;

    String name;
    boolean stop;

    public Human(String name){

        this.name = name;
        this.stop = true;
    }

    @Override
    public void action(Let let) {

        if (let instanceof Treadmill) {
            if (stop) {
                if (((Treadmill) let).length_track <= length_max) {
                    System.out.println("Человек " + this.name + " пробежал " + length_max + "  км.");
                } else {
                    System.out.println("Человек может пробежать не более " + length_max + " км.");
                }
            } else {
                System.out.println("Человек " + this.name + " сошел с дистанции");
            }

        } else {
            if (stop) {
                if (((Wall) let).wall_height <= wall_max) {
                    System.out.println("Человек " + this.name + " перепрыгнул препятствие " + wall_max + " м.");
                } else {
                    System.out.println("Человек может перепрыгнуть препятствие не более " + wall_max + " м.");
                }
            } else {
                System.out.println("Человек " + this.name + " сошел с дистанции");
            }
        }

    }
}
