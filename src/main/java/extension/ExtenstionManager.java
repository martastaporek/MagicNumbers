package extension;

import CustomException.UnsupportedExtension;
import handler.GifHandler;
import handler.JpgHandler;
import handler.TxtHandler;

public class ExtenstionManager {

    public void chooseExtenstion(String path){

        String pathLowerCase = path.toLowerCase();

        if(pathLowerCase.endsWith(ExtenstionType.txt.name())){
            new TxtHandler().handle(path);
        }else if(pathLowerCase.endsWith(ExtenstionType.jpeg.name()) || pathLowerCase.endsWith(ExtenstionType.jpg.name())){
            new JpgHandler().handle(path);
        }else if(pathLowerCase.endsWith(ExtenstionType.gif.name())){
            new GifHandler().handle(path);
        }else{
            throw new UnsupportedExtension("This type of exception is not handled");
        }

    }
}
