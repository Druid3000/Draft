package Creational.FactoryMethod.Button;

public class HtmlButton implements Button {

    public void render(int a, int b) {
        System.out.println("rendering of HtmlButton");
    }

    public void onClick(int f){
        System.out.println("Action onClick() of HtmlButton");
    }
}
