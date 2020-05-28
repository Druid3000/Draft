package Creational.FactoryMethod.Dialog;

import Creational.FactoryMethod.Button.Button;
import Creational.FactoryMethod.Button.HtmlButton;

public class HtmlDialog extends Dialog{

    Button createButton() {
        return new HtmlButton();
    }
}
