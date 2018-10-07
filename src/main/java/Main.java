import extension.ExtenstionManager;

public class Main {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("No path provided");
        }else{
            new ExtenstionManager().chooseExtenstion(args[0]);
        }
    }
}
