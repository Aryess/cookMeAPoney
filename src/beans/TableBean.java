package beans;

import java.io.IOException;  
import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.Date;
import java.util.List;  
import java.util.UUID;  
  
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;  
import javax.faces.event.ActionEvent;  
import javax.servlet.ServletContext;  
   
@ManagedBean
public class TableBean implements Serializable {  
      
    
  
    private List<Receipe> receipes;  
      
    private Receipe selectedReceipe;  
  
    public TableBean() {  
        receipes = new ArrayList<Receipe>();  
          
        populateRandomReceipes(receipes, 50);  
    }  
      
    public Receipe getSelectedReceipe() {  
        return selectedReceipe;  
    }  
  
    public void setSelectedReceipe(Receipe selectedReceipe) {  
        this.selectedReceipe = selectedReceipe;  
    }  
  
    private void populateRandomReceipes(List<Receipe> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Receipe());  
    }  
  
    public List<Receipe> getReceipes() {  
        return receipes;  
    }  
  
}  