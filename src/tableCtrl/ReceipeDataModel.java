package tableCtrl;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import beans.Receipe;

public class ReceipeDataModel extends ListDataModel<Receipe> implements SelectableDataModel<Receipe> {
	 public ReceipeDataModel(List<Receipe> data) {  
	        super(data);  
	    }  
	      
	    @Override  
	    public Receipe getRowData(String rowKey) {  
	        //In a real app, a more efficient way like a query by rowKey should be implemented to deal with huge data  
	          
	        List<Receipe> receipes = (List<Receipe>) getWrappedData();  
	          
	        for(Receipe receipe : receipes) {  
	            if(receipe.getId().toString().equals(rowKey))  
	                return receipe;  
	        }  
	          
	        return null;  
	    }  
	  
	    @Override  
	    public Object getRowKey(Receipe receipe) {  
	        return receipe.getId();  
	    }  
}
