package beans;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class Bean {

    // Properties ---------------------------------------------------------------------------------

    private String input1;
    private String input2;
    
    // Actions ------------------------------------------------------------------------------------

    public void submit() {
    	System.out.println("i1"+input1+"i2"+input2);
        String message = String.format("Submitted: input1=%s, input2=%s", input1, input2);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(message));
    }

    // Getters/setters ----------------------------------------------------------------------------

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

}