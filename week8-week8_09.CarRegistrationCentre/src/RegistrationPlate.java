import java.util.Objects;

public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }
    
    @Override
    public boolean equals(Object object) {
        if(this == object) {
            return true;
        }
        
        if(!(object instanceof RegistrationPlate)) {
            return false;
        }
        
        RegistrationPlate plate = (RegistrationPlate) object;
        
        return Objects.equals(this.regCode, plate.regCode) &&
                Objects.equals(this.country, plate.country);
        
    }
    
    public int hashCode() {
        return Objects.hash(regCode, country);
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

}
