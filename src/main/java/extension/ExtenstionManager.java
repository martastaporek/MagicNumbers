package extension;

public class ExtenstionManager {

    public void chooseExtenstion(String path){

        if(path.endsWith(ExtenstionType.txt.name())){

        }else if(path.endsWith(ExtenstionType.jpeg.name()) || path.endsWith(ExtenstionType.jpg.name())){

        }else if(path.endsWith(ExtenstionType.gif.name())){

        }else{
            System.out.println("Unhandled type of extenstion");
            System.exit(1);
        }

    }
}
