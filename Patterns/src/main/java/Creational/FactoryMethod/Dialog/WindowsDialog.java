package Creational.FactoryMethod.Dialog;

import Creational.FactoryMethod.Button.Button;
import Creational.FactoryMethod.Button.WindowsButton;

public class WindowsDialog extends Dialog {

    Button createButton() {
        return new WindowsButton();
    }
}
