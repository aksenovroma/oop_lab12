package by.bntu.fitr.noname.lab12.model.entity;

import java.util.Objects;

public class Potato extends Product {
    public enum Sort {
        GALA, ULADAR, UDACHA
    }

    private Sort sort;

    public Potato(Sort sort) {
        this.sort = sort;
    }

    public Potato(double weight, double calorie, Sort sort) {
        super(weight, calorie);
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
        Potato potato = (Potato) o;
        return sort == potato.sort;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sort);
    }

    @Override
    public String toString() {
        return "Potato{" + super.toString() +
                " sort=" + sort +
                '}';
    }
}
