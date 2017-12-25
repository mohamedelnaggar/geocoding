package com.geocoding.domain;

import com.google.code.geocoder.model.GeocoderGeometry;

import java.io.Serializable;

/**
 * The camel geo model which contains custom response
 */
public class CamelGeoModel implements Serializable {

    private String formattedAddress;
    private GeocoderGeometry geometry;

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public GeocoderGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(GeocoderGeometry geometry) {
        this.geometry = geometry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CamelGeoModel that = (CamelGeoModel) o;

        if (formattedAddress != null ? !formattedAddress.equals(that.formattedAddress) : that.formattedAddress != null)
            return false;
        return !(geometry != null ? !geometry.equals(that.geometry) : that.geometry != null);

    }

    @Override
    public int hashCode() {
        int result = formattedAddress != null ? formattedAddress.hashCode() : 0;
        result = 31 * result + (geometry != null ? geometry.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CamelGeoModel{" +
                "formattedAddress='" + formattedAddress + '\'' +
                ", geometry=" + geometry +
                '}';
    }
}
