package introduction;

class TaskInMulti extends Thread{
    @Override
    public void run() {
        print();
    }

    public void print(){
        for(int i=1; i <= 1500; i++) {
            System.out.print("T");
        }
    }
}
public class MultiThreadSimpleExample {
    public static void main(String[] args) {
        TaskInMulti task = new TaskInMulti();
        task.start();
        for(int i=1; i<=1500; i++){
            System.out.print("M");
        }
    }

}
