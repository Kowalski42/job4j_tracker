package ru.job4j.pojo;

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
        if ((owner != null && license.owner != null && owner.equals(license.owner))
                || (owner == null && license.owner == null)) {
            if ((model != null && license.model != null && model.equals(license.model))
                    || (model == null && license.model == null)) {
                if ((code != null && license.code != null && code.equals(license.code))
                        || (code == null && license.code == null)) {
                    return (created != null && license.created != null
                            && created.equals(license.created))
                            || (created == null && license.created == null);
                }
            }
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
