package tableCtrl;

import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import beans.Receipe;


import dao.Receipes;
import dao.Users;
   
@ManagedBean
@SessionScoped
public class ReceipeTableBean implements Serializable {  
      
    
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Receipe> receipes;  
      
    private Receipe selectedReceipe;  
	
    private ReceipeDataModel mediumReceipesModel;
    
    private Receipes DAO;
	
    public ReceipeTableBean() {  
        receipes = new ArrayList<Receipe>();  
        selectedReceipe = new Receipe(-1, "WtfReceipe", "Defaultsumup", "Faites revenir JSF dans un bouillon de caca d'oie <br/> Ajoutez un soupçon de pisse de chat pour obtenir un fumet plus délicat </br> Melangez jusqu'à obtenir une pâte onctueuse et servez sur des tranches de petit ours brun.", "", new Integer(2), "1", new Integer(1), new Integer(1337));
        populateRandomReceipes(receipes, 10); 
        this.DAO = new Receipes();
        mediumReceipesModel = new ReceipeDataModel(receipes);//DAO.getReceipes());
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
  
    public void updateModel(){
		
    	mediumReceipesModel = new ReceipeDataModel(DAO.getReceipes());
	}
	
}  