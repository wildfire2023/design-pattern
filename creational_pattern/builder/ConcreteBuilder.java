package creational_pattern.builder;

public class ConcreteBuilder extends Builder {
    //complex object
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartA() {
        System.out.println("A part of Product");
        product.setPartA("partA");
    }

    @Override
    public void buildPartB() {
        System.out.println("B part of Product");
        product.setPartB("partB");
    }

    @Override
    public void buildPartC() {
        System.out.println("C part of Product");
        product.setPartC("partC");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
