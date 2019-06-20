package com.codenotfound.primefaces.view;

import com.codenotfound.primefaces.model.Client;
import com.codenotfound.primefaces.model.Location;
import com.codenotfound.primefaces.model.Vehicule;
import com.codenotfound.primefaces.repository.ClientRepository;
import com.codenotfound.primefaces.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class LocationBean implements Serializable {
    @Autowired
    private ClientRepository clientRepository ;
    @Autowired
    private VehiculeRepository  vehiculeRepository ;
 private Location location ;

    public LocationBean() {
        location = new Location() ;
        location.setClient(new Client());
        location.setVehicule(new Vehicule());
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String addLocation(){
   return "succes" ;
    }

    public void clientExist(){

        Client c = null ;
        c = clientRepository.findClientByNumPiece(location.getClient().getNumPiece());
        System.out.println("Client "+c.getNumPiece());
        if(c!=null){
            location.setClient(c);
        }
    }
    public void vehiculeExist(){
       Vehicule v = null ;
       v = vehiculeRepository.findVehiculeByMatricule(location.getVehicule().getMatricule());
        System.out.println("Vehicule "+v.getMatricule());
       if(v!=null){
           location.setVehicule(v);
       }
    }
}
