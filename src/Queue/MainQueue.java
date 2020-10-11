package Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue queue1=new Queue(5);
        Queue queue2=new Queue();

        System.out.println("The queue with maximum size");
        queue1.PushItem(6);
        queue1.PushItem(12);
        queue1.PushItem(3);

        queue1.PopItem();

        queue1.checkEmpty();
        queue1.checkFull();

        System.out.println("\nThe queue without maximum size");
        queue2.PushItem(45);
        queue2.PushItem(14);
        queue2.PushItem(1);

        queue2.PopItem();

        queue2.checkEmpty();
        queue2.checkFull();

    }
}
