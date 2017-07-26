
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per getGoalByIdPersonResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="getGoalByIdPersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://ws.document.introsde/}goal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGoalByIdPersonResponse", propOrder = {
    "message"
})
public class GetGoalByIdPersonResponse {

    protected Goal message;

    /**
     * Recupera il valore della proprieta message.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getMessage() {
        return message;
    }

    /**
     * Imposta il valore della proprieta message.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setMessage(Goal value) {
        this.message = value;
    }

}
