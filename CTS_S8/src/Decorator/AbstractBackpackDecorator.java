package Decorator;

public abstract class AbstractBackpackDecorator extends AbstractBackpack {
    protected AbstractBackpack basicBackpack;

    public AbstractBackpackDecorator(AbstractBackpack basicBackpack) {
        this.basicBackpack = basicBackpack;
    }
}
