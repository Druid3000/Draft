package Creational.FactoryMethod.Dialog;

import Creational.FactoryMethod.Button.Button;

// Базовый класс фабрики. Заметьте, что "фабрика" — это всего
// лишь дополнительная роль для класса. Скорее всего, он уже
// имеет какую-то бизнес-логику, в которой требуется создание
// разнообразных продуктов.
public abstract class Dialog {

    // Чтобы использовать фабричный метод, вы должны
    // убедиться в том, что эта бизнес-логика не зависит от
    // конкретных классов продуктов. Button — это общий
    // интерфейс кнопок, поэтому все хорошо.
    public void render(int a, int b){
        Button button = createButton();
        button.onClick(1);
        button.render(1,2);
    }

    // Мы выносим весь код создания продуктов в особый метод,
    // который назвают "фабричным".
    abstract Button createButton();

}
