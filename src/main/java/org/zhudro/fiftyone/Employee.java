package org.zhudro.fiftyone;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by mikalai on 08.02.16.
 */
public class Employee {

    @NotNull @Min(2)
    private String firstName;

    @NotNull @Min(2)
    private String lastName;

    @NotNull @Pattern(regexp ="\\d++")
    private String zipCode;

    @NotNull @Pattern(regexp ="\\D{2}-\\d{4}")
    private String id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
