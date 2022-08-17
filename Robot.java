public class Robot{
    public void walk(){
        System.out.println("Walk straight.");
    }
    public void posture(int angle){
        System.out.println("Robot stands straight at " + angle);
    }
    public static void main(String[] args){
        Robot controller = new Robot();
        controller.walk();
        controller.posture(90);
    }
}