package ru.job4j.pojo;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setOwner("Ivanov");
        first.setModel("T6");
        first.setCode("audio");
        first.setCreated(new Date());
        License second = new License();
        second.setOwner("Ivanov");
        second.setModel("T6");
        second.setCode("audio");
        second.setCreated(new Date());
        assertThat(first, is(second));
    }

    @Test
    public void notEqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertNotSame(first, second);
    }
}