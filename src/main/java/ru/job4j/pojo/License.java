package ru.job4j.pojo;

import javax.swing.*;
import java.util.Date;
import java.util.Objects;

public class License {
    private String owner;
    private String model;
    private String code;
    private Date created;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        boolean res = false;
        if (owner != null && license.owner != null && owner.equals(license.owner)) {
            res = true;
        } else if (model != null && license.model != null && model.equals(license.model)) {
            res = res;
        } else if (code.equals(license.code) && model == null && license.model == null
                && owner == null && license.owner == null && created == null
                && license.created == null) {
            return true;
        } else if (created.equals(license.created) && model == null && license.model == null
                && code == null && license.code == null && owner == null && license.owner == null) {
            return true;
        } else if (owner.equals(license.owner) && model.equals(license.model)
                && code.equals(license.code) && created.equals(license.created)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }

    public static void main(String[] args) {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        System.out.println(first.equals(second));
    }
}
