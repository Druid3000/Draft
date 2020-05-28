package Creational.FactoryMethod.Dialog;

import Creational.FactoryMethod.Button.Button;
import Creational.FactoryMethod.Button.WindowsButton;

// Конкретные фабрики переопределяют фабричный метод и
// возвращают из него собственные продукты.
public class WindowsDialog extends Dialog {

    Button createButton() {
        return new WindowsButton();
    }
}
