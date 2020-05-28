package Creational.FactoryMethod.Button;

public class WindowsButton implements Button {

    public void render(int a, int b) {
        System.out.println("rendering of WindowButton");
    }

    public void onClick(int f){
        System.out.println("Action onClick() of WindowsButton");
    }
}
