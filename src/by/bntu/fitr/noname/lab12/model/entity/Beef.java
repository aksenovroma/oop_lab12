package by.bntu.fitr.noname.lab12.model.entity;

import java.util.Objects;

public class Beef extends Product {
    public enum Sort {
        RIB_EYE, BRISCKET, KNUCKLE
    }

    private Sort sort;

    public Beef(double weight, double price, Sort sort) {
        super(weight, price);
        this.sort = sort;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Beef beef = (Beef) o;
        return sort == beef.sort;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sort);
    }

    @Override
    public String toString() {
        return "Beef{" + super.toString() +
                " sort=" + sort +
                '}';
    }
}
