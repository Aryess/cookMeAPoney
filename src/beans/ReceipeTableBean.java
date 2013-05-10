package beans;

import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  
import javax.faces.bean.ManagedBean;  
   
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
          
        populateRandomReceipes(receipes, 50); 
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
  
    private void populateRandomReceipes(List<Receipe> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Receipe());  
    }  
  
    public List<Receipe> getReceipes() {  
        return receipes;  
    }  
  
}  