/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.backing;


import model.Candidato;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class VacanteForm {

  @ManagedProperty(value="#{candidato}")
  private Candidato candidato;

  public void setCandidato(Candidato candidato) {
    this.candidato = candidato;
  }

  public String enviar() {
    if (this.candidato.getNombre().equals("Gabo")) {
      return "exito";
    } else {
      return "fallo";
    }
  }
}
