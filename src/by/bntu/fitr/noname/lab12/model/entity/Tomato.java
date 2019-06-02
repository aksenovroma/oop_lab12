package by.bntu.fitr.noname.lab12.model.entity;

import java.util.Objects;

public class Tomato extends Product{
    public enum Sort {
        VITUAZ, ZHIGALO, CHERRY
    }
    private Sort sort;

    public Tomato(Sort variety) {
        this.sort = variety;
    }

    public Tomato(double weight, double price, Sort variety) {
        super(weight, price);
        this.sort = variety;
    }

    public Sort getVariety() {
        return sort;
    }

    public void setVariety(Sort variety) {
        this.sort = variety;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tomato tomato = (Tomato) o;
        return sort == tomato.sort;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sort);
    }

    @Override
    public String toString() {
        return "Tomato{" + super.toString() +
                " sort=" + sort +
                '}';
    }
}
