package com.company.factory;

import java.util.Objects;

public class IceCream {
   public String milk;
    public String sugar;
    public String flavor;



    public IceCream(String milk, String sugar, String flavor) {
        this.milk = milk;
        this.sugar = sugar;
        this.flavor = flavor;
    }

    public IceCream() {
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Objects.equals(milk, iceCream.milk) && Objects.equals(sugar, iceCream.sugar) && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(milk, sugar, flavor);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "milk='" + milk + '\'' +
                ", sugar='" + sugar + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}
