package za.ca.cput.Entity.StaffDetails;

public class Address {

      private String addressId, streetName ,
              suburb , city , country;
      private int streetNumber , postalCode;


    public Address(Builder builder)
      {
          this.addressId = builder.addressId;
          this.city = builder.city;
          this.country = builder.country;
          this.streetName = builder.streetName;
          this.suburb = builder.suburb;
          this.streetNumber = builder.streetNumber;
          this.postalCode = builder.postalCode;

      }
    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", streetNumber=" + streetNumber +
                ", postalCode=" + postalCode +
                '}';
    }
      private static class Builder{

          private String addressId, streetName ,
                  suburb , city , country;
          private int streetNumber , postalCode;

          public void setAddressId(String addressId) {
              this.addressId = addressId;
          }

          public void setStreetName(String streetName) {
              this.streetName = streetName;
          }

          public void setSuburb(String suburb) {
              this.suburb = suburb;
          }

          public void setCity(String city) {
              this.city = city;
          }

          public void setCountry(String country) {
              this.country = country;
          }

          public void setStreetNumber(int streetNumber) {
              this.streetNumber = streetNumber;
          }

          public void setPostalCode(int postalCode) {
              this.postalCode = postalCode;
          }
      }
}
