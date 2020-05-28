package Creational.FactoryMethod;

import Creational.FactoryMethod.Dialog.Dialog;
import Creational.FactoryMethod.Dialog.HtmlDialog;
import Creational.FactoryMethod.Dialog.WindowsDialog;

public class Application {

    private static Dialog dialog;

    // Приложение создаёт определённую фабрику в зависимости от
    // конфигурации или окружения.
    private static void initialize(){
//        String config = "Windows";
        String config = "Web";

        if(config.equalsIgnoreCase("Windows")){
            dialog = new WindowsDialog();
        } else if(config.equalsIgnoreCase("Web")){
            dialog = new HtmlDialog();
        }
    }

    // Если весь остальной клиентский код работает с фабриками и
    // продуктами только через общий интерфейс, то для него
    // будет не важно, какая фабрика была создана изначально.
    public static void main(String[] args) {
        initialize();
        dialog.render(1,2);
    }
}
