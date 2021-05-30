package by.teachmeskills.lesson6.human;

import by.teachmeskills.lesson6.human.jacket.IJacket;
import by.teachmeskills.lesson6.human.shoes.IShoes;
import by.teachmeskills.lesson6.human.trousers.ITrousers;

public class Human implements IHuman {

    private String name;
    private IJacket jacket;
    private IShoes shoes;
    private ITrousers trousers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }

    public Human(String name, IJacket jacket, IShoes shoes, ITrousers trousers){
        this.name = name;
        this.jacket = jacket;
        this.shoes = shoes;
        this.trousers = trousers;
    }

    @Override
    public void putOnClothes(){
        jacket.putOn(name);
        shoes.putOn(name);
        trousers.putOn(name);
    }

    @Override
    public void takeOffClothes(){
        jacket.takeOff(name);
        shoes.takeOff(name);
        trousers.takeOff(name);
    }
}
