import java.util.Scanner;
public class QueueApp {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Queue queue=new Queue();
        while(true){
            System.out.println("Enter 1 for INSERT");
            System.out.println("Enter 2 for DELETE");
            System.out.println("Enter 3 for DISPLAY");
            System.out.println("Enter Another AnyNumber to EXIT");
            System.out.print("Enetr Your choice:");
            int choice =scan.nextInt();
            System.out.println();
            switch(choice){
                case 1:
                   queue.insert();
                   break;
                case 2:
                   queue.delete();
                   break;
                case 3:
                   queue.display();
                   break;
                default:
                   System.exit(0 );         
            }
        }
    }
}
