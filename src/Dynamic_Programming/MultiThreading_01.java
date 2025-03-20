package Dynamic_Programming;


class MultiThreading extends Thread {

    public void run(){
    try {

        System.out.println(
                "Thread " + Thread.currentThread().getId()
                        + " is running");
    }
        catch (Exception e) {
        System.out.println("Exception is caught");
    }
}
}
public class MultiThreading_01 {
    public static void main(String[] args){

    }
}
