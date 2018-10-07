package extension;

import CustomException.UnsupportedExtension;
import handler.GifHandler;
import handler.JpgHandler;
import handler.TxtHandler;

public class ExtensionManager {

    public void chooseExtenstion(String path){

        String pathLowerCase = path.toLowerCase();

        if(pathLowerCase.endsWith(ExtenstonType.txt.name())){
            new TxtHandler().handle(path);
        }else if(pathLowerCase.endsWith(ExtenstonType.jpeg.name()) || pathLowerCase.endsWith(ExtenstonType.jpg.name())){
            new JpgHandler().handle(path);
        }else if(pathLowerCase.endsWith(ExtenstonType.gif.name())){
            new GifHandler().handle(path);
        }else{
            throw new UnsupportedExtension("This type of exception is not handled");
        }

    }
}
