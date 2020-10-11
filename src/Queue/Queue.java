package Queue;

public class Queue {
    public int max;
    public int length;
    public Node Front, Rear;

    public Queue(){
        this.max=Integer.MAX_VALUE;
        this.length=0;
        this.Front=null;
        this.Rear=null;
    }

    public Queue(int max) {
        this.max = max;
        this.length=0;
        this.Front=null;
        this.Rear=null;
    }

    public void PushItem(int value){

        if(length == max){
            return;
        }

        Node node=new Node(value);
        if(isEmpty()){
            Front=node;
        }
        else{
            Rear.setNextNode(node);
        }
        Rear=node;
        length++;
    }

    public void PopItem(){
        if(isEmpty()){
            System.out.println("The queue is empty!");
            return;
        }
        int result=Front.getValue();
        Front=Front.getNextNode();
        length--;
        if(isEmpty()){
            Rear = null;
        }
        System.out.println(result);
    }

    private boolean isEmpty() {
        return length==0;
    }
  public void checkEmpty(){
        if(length==0){
            System.out.println("The queue is emtpty");
        }
        else{
            System.out.println("The queue is not empty");
        }
  }
  public void checkFull(){
        if(max==Integer.MAX_VALUE){
            System.out.println("The queue is never full");
        }
        else if(max==length){
            System.out.println("The queue is full");
        }
        else{
            System.out.println("The queue is not full");
        }

  }
}
