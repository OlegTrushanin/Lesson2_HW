package java_vtb_Lesson2_HW;

public class Robot implements Action{

    double wall_max = 5;
    double length_max = 20;

    String name;
    boolean stop;

    public Robot(String name){

        this.name = name;
        boolean stop = true;
    }

    @Override
    public void run(int length_track){

        if(stop) {
            if (length_track <= length_max) {
                System.out.println("Робот " + this.name + " пробежал " + length_max + "  м.");
            } else {
                System.out.println("Робот может пробежать не более " + length_max + " м.");
                this.stop = false;
            }
        }else {
            System.out.println("Робот " + this.name + " сошел с дистанции");
        }


    }



    @Override
    public void jump(int wall_height){

        if(stop) {
            if (wall_height <= wall_max) {
                System.out.println("Робот " + this.name + " перепрыгнул препятствие " + wall_max + " км.");
            } else {
                System.out.println("Робот может перепрыгнуть препятствие не более " + wall_max + " км.");
                this.stop = false;
            }
        }else{
                System.out.println("Робот " + this.name + " сошел с дистанции");
            }
        }



}
