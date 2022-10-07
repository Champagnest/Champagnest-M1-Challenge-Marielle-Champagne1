package com.company.pointofsale;

import java.util.Objects;

public class IceCream {
//    IceCream ic = new IceCream();
   public String Vanilla;
   public String chocolate;
   public String spumoni;



   public IceCream(String vanilla, String chocolate, String spumoni, int price) {
      Vanilla = vanilla;
      this.chocolate = chocolate;
      this.spumoni = spumoni;
      this.price = price;
   }

   public int price;

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getVanilla() {
      return Vanilla;
   }

   public void setVanilla(String vanilla) {
      Vanilla = vanilla;
   }

   public String getChocolate() {
      return chocolate;
   }

   public void setChocolate(String chocolate) {
      this.chocolate = chocolate;
   }

   public String getSpumoni() {
      return spumoni;
   }

   public void setSpumoni(String spumoni) {
      this.spumoni = spumoni;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      IceCream iceCream = (IceCream) o;
      return price == iceCream.price && Objects.equals(Vanilla, iceCream.Vanilla) && Objects.equals(chocolate, iceCream.chocolate) && Objects.equals(spumoni, iceCream.spumoni);
   }

   @Override
   public int hashCode() {
      return Objects.hash(Vanilla, chocolate, spumoni, price);
   }

   @Override
   public String toString() {
      return "IceCream{" +
              "Vanilla='" + Vanilla + '\'' +
              ", chocolate='" + chocolate + '\'' +
              ", spumoni='" + spumoni + '\'' +
              ", price=" + price +
              '}';
   }
}
