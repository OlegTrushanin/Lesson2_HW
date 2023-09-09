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
    public void run(int length_track){

        if(stop) {
            if (length_track <= length_max) {
                System.out.println("Человек " + this.name + " пробежал " + length_max + " км.");
            } else {
                System.out.println("Кот может пробежать не более " + length_max + " км.");
                this.stop = false;
            }
        }else{
            System.out.println("Человек " + this.name + " сошел с дистанции");
        }

        }





    @Override
    public void jump(int wall_height){

        if(wall_height <= wall_max){
            System.out.println("Человек " + this.name + " перепрыгнул препятствие " + wall_max + " м.");
        } else {
            System.out.println("Кот может перепрыгнуть препятствие не более " + wall_max + " м.");
        }


    }
}
