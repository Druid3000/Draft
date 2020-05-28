package Creational.FactoryMethod;

import Creational.FactoryMethod.Dialog.Dialog;
import Creational.FactoryMethod.Dialog.HtmlDialog;
import Creational.FactoryMethod.Dialog.WindowsDialog;

public class Application {

    private static Dialog dialog;

    private static void initialize(){
//        String config = "Windows";
        String config = "Web";
//
        if(config.equalsIgnoreCase("Windows")){
            dialog = new WindowsDialog();
        } else if(config.equalsIgnoreCase("Web")){
            dialog = new HtmlDialog();
        }
    }

    public static void main(String[] args) {
        initialize();
        dialog.render(1,2);
    }
}
