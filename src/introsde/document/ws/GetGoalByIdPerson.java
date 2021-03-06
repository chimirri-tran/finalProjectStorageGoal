
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getGoalByIdPerson complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getGoalByIdPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalByIdPerson", propOrder = {
    "idPerson"
})
public class GetGoalByIdPerson {

    protected int idPerson;

    /**
     * Recupera il valore della proprieta idPerson.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Imposta il valore della proprieta idPerson.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

}
