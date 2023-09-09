package java_vtb_Lesson2_HW;

public class Cat implements Action{

    double wall_max = 2.5;
    double length_max = 0.5;

    String name;
    boolean stop;

    public Cat(String name){

        this.name = name;
        boolean stop = true;
    }

    @Override
    public void run(int length_track){

        if(stop) {
            if (length_track <= length_max) {
                System.out.println("Кот " + this.name + " пробежал " + length_max + "  км.");
            } else {
                System.out.println("Кот может пробежать не более " + length_max + " км.");
            }
        }else{
            System.out.println("Кот " + this.name + " сошел с дистанции");
        }

    }



    @Override
    public void jump(int wall_height){
        if(stop) {
            if (wall_height <= wall_max) {
                System.out.println("Кот " + this.name + " перепрыгнул препятствие " + wall_max + " м.");
            } else {
                System.out.println("Кот может перепрыгнуть препятствие не более " + wall_max + " м.");
            }
        }else{
            System.out.println("Кот " + this.name + " сошел с дистанции");
        }


    }

}
