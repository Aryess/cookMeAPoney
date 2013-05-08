package validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "validators.userage")
public class UserAgeValidator implements Validator {

	private static final Integer USER_MAX_AGE = 100 ;
 
	public UserAgeValidator() {
	}
 
	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
 
		if(!(Integer.parseInt(value.toString()) < USER_MAX_AGE)) { 
			FacesMessage msg = 
				new FacesMessage("user age validation failed.", 
						"User age Validation failed please follow the contraint <"+USER_MAX_AGE);
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
 
		}
 
	}

}
