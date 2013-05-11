package beans;

import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;  
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
   
@ManagedBean
public class ReceipeTableBean implements Serializable {  
      
    
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Receipe> receipes;  
      
    private Receipe selectedReceipe;  
	
    private ReceipeDataModel mediumReceipesModel;
	
    public ReceipeTableBean() {  
        receipes = new ArrayList<Receipe>();  
        selectedReceipe = new Receipe(-1, "DefaultTitle", "Defaultsumup", "defaultDesc", "", new Integer(2), "1", new Integer(1), new Integer(1204));
        populateRandomReceipes(receipes, 10); 
        mediumReceipesModel = new ReceipeDataModel(receipes);
    }  
      
    public Receipe getSelectedReceipe() {  
        return selectedReceipe;  
    }  
  
	public ReceipeDataModel getMediumReceipesModel() {
		return mediumReceipesModel;
	}

    public void setSelectedReceipe(Receipe selectedReceipe) {  
        this.selectedReceipe = selectedReceipe;  
    }  
    
    public void onRowSelect(SelectEvent event) {
		FacesMessage msg = new FacesMessage("Receipe Selected",
				((Receipe) event.getObject()).getId().toString());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowUnselect(UnselectEvent event) {
		FacesMessage msg = new FacesMessage("Receipe Unselected",
				((Receipe) event.getObject()).getId().toString());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
    
    private void populateRandomReceipes(List<Receipe> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Receipe(i, "RandomTitle"+i, "Randomsumup"+i, "RandomDesc"+i, "", new Integer(i%5), ""+i, new Integer(i%5), new Integer(100/(i+1))));
             
    }  
  
    public List<Receipe> getReceipes() {  
        return receipes;  
    }  
  
}  