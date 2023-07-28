package introduction;

class Task{
    public void print(){
        for(int i=1; i <= 1500; i++) {
            System.out.print("T");
        }
    }
}
public class SingleThreadSimpleExample {
    public static void main(String[] args) {
        Task task = new Task();
        task.print();
        for(int i=1; i<=1500; i++){
            System.out.print("M");
        }
    }


    }

