package com.codenotfound.primefaces.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import com.codenotfound.primefaces.model.Car;
import com.codenotfound.primefaces.model.Vehicule;
import com.codenotfound.primefaces.repository.VehiculeRepository;

@Named
@SessionScoped
public class CarsView implements Serializable {

  private static final long serialVersionUID = 1L;

  @Autowired
  private VehiculeRepository carRepository;

  private List<Vehicule> cars;
  private Vehicule vehicule ;
  @PostConstruct
  public void init() {
  }

  public void setCars(List<Vehicule> cars) {
    this.cars = cars;
  }

  public CarsView() {
    vehicule = new Vehicule();
  }

  public List<Vehicule> getCars() {
    cars = carRepository.findAll() ;
    return cars;
  }

  public Vehicule getVehicule() {
    return vehicule;
  }

  public void setVehicule(Vehicule vehicule) {
    this.vehicule = vehicule;
  }

  public String addVehicule(){
    carRepository.save(vehicule);
    this.vehicule = new Vehicule();
    return "cars?faces-redirect=true";
  }


  public String editVehicule(Vehicule vehicule){
    this.vehicule = vehicule ;

    // return "vehiculeEdit";
    return "vehiculeEdit?faces-redirect=true";
    //return "vehicule?faces-redirect=true";
  }

  public String UpdateVehicule(){
    carRepository.save(vehicule);
    vehicule=new Vehicule();
    return "cars?faces-redirect=true";
  }
  public String deleteVehicule(Vehicule vehicule){
    System.out.println("delete vehicule"+vehicule.getMatricule());
    carRepository.delete(vehicule);
    return "cars?faces-redirect=true";
  }
}
