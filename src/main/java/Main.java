import extension.ExtensionManager;

public class Main {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("No path provided");
        }else{
            new ExtensionManager().chooseExtenstion(args[0]);
        }
    }
}
