import extension.ExtenstionManager;

public class Main {

    public static void main(String[] args) {

        if(args[0] == null){
            System.out.println("No path provied");
        }else{
            new ExtenstionManager().chooseExtenstion(args[0]);
        }
    }
}
