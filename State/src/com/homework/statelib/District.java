package com.homework.statelib;


import java.util.Objects;

public class District { //район

        private String district;

        public District(String district) {
            this.district = district;
        }

        public String getDistrict() {
            return district;
        }

    @Override
    public String toString() {
        return "District{" +
                "district='" + district + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district1 = (District) o;
        return district.equals(district1.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(district);
    }
}
