package shchur_pavlo.models;


import javax.validation.ValidatorFactory;

public class Validation {

    public static void main(String[] args) {

        ValidatorFactory validatorFactory =
                javax.validation.Validation.buildDefaultValidatorFactory();
        validatorFactory.getValidator();
        
        Citizen citizen = new Citizen();

    }
}
