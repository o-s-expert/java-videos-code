package com.osachitech.examples;

import java.util.Objects;

public class DriveLicense {

    private final String license;

    public DriveLicense(String license) {
        this.license = license;
    }

    public String getLicense() {
        return license;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DriveLicense that = (DriveLicense) o;
        return Objects.equals(license, that.license);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(license);
    }
}
