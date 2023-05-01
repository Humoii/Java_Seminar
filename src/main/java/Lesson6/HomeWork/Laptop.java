package Lesson6.HomeWork;

import java.util.Objects;

public class Laptop {
    private final String nameLaptop;
    private final String ramLaptop;
    private final String colorLaptop;
    private final Double diagonalLaptop;
    private final Integer quantityLaptop;

    public Laptop (String nameLaptop,
                   String ramLaptop,
                   String colorLaptop,
                   Double diagonalLaptop,
                   Integer quantityLaptop){
        this.nameLaptop = nameLaptop;
        this.ramLaptop = ramLaptop;
        this.colorLaptop = colorLaptop;
        this.diagonalLaptop = diagonalLaptop;
        this.quantityLaptop = quantityLaptop;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "nameLaptop='" + nameLaptop + '\'' +
                ", ramLaptop='" + ramLaptop + '\'' +
                ", colorLaptop='" + colorLaptop + '\'' +
                ", diagonalLaptop=" + diagonalLaptop +
                ", quantityLaptop=" + quantityLaptop +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(nameLaptop, laptop.nameLaptop) &&
                Objects.equals(ramLaptop, laptop.ramLaptop) &&
                Objects.equals(colorLaptop, laptop.colorLaptop) &&
                Objects.equals(diagonalLaptop, laptop.diagonalLaptop) &&
                Objects.equals(quantityLaptop, laptop.quantityLaptop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameLaptop, ramLaptop, colorLaptop, diagonalLaptop, quantityLaptop);
    }

    public String getNameLaptop() {
        return nameLaptop;
    }
    public String getRamLaptop() {
        return ramLaptop;
    }
    public String getColorLaptop() {
        return colorLaptop;
    }
    public Integer getQuantityLaptop() {
        return quantityLaptop;
    }
}
