package Creational.FactoryMethod.Button;

// Паттерн Фабричный метод применим тогда, когда в программе
// есть иерархия классов продуктов.
public interface Button {
    void render(int a, int b);
    void onClick(int f);
}
