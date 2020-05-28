package Creational.FactoryMethod.Dialog;

import Creational.FactoryMethod.Button.Button;
import Creational.FactoryMethod.Button.HtmlButton;

// Конкретные фабрики переопределяют фабричный метод и
// возвращают из него собственные продукты.
public class HtmlDialog extends Dialog{

    Button createButton() {
        return new HtmlButton();
    }
}
