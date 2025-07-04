package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "compte")
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date dateCreation;


    public Compte(int code, double solde, Date dateCreation){
        this.code = code ;

        this.solde = solde ;


        this.dateCreation = dateCreation ;
    }


    public Compte(){

    }
public int getCode(){
     return code;
        }
public void setCode(int code){
    this.code = code;
}
}
