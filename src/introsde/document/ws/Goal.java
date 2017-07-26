
package introsde.document.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per goal complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="finalWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="heartRate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="idGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="initialWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="lostWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxBloodPressure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minBloodPressure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sleepHours" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="steps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "actualWeight",
    "finalWeight",
    "heartRate",
    "idPerson",
    "height",
    "idGoal",
    "initialWeight",
    "lostWeight",
    "maxBloodPressure",
    "minBloodPressure",
    "sleepHours",
    "steps"
})
public class Goal {

    protected double actualWeight;
    protected double finalWeight;
    protected int heartRate;
    protected double height;
    protected int idGoal;
    
    protected int idPerson;
    protected double initialWeight;
    protected int lostWeight;
    protected int maxBloodPressure;
    protected int minBloodPressure;
    protected int sleepHours;
    protected int steps;

    /**
     * Recupera il valore della proprieta actualWeight.
     * 
     */
    public double getActualWeight() {
        return actualWeight;
    }

    /**
     * Imposta il valore della proprieta actualWeight.
     * 
     */
    public void setActualWeight(double value) {
        this.actualWeight = value;
    }

    /**
     * Recupera il valore della proprieta finalWeight.
     * 
     */
    public double getFinalWeight() {
        return finalWeight;
    }

    /**
     * Imposta il valore della proprieta finalWeight.
     * 
     */
    public void setFinalWeight(double value) {
        this.finalWeight = value;
    }

    /**
     * Recupera il valore della proprieta heartRate.
     * 
     */
    public int getHeartRate() {
        return heartRate;
    }

    /**
     * Imposta il valore della proprieta heartRate.
     * 
     */
    public void setHeartRate(int value) {
        this.heartRate = value;
    }

    /**
     * Recupera il valore della proprieta height.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Imposta il valore della proprieta height.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Recupera il valore della proprieta idGoal.
     * 
     */
    public int getIdGoal() {
        return idGoal;
    }

    /**
     * Imposta il valore della proprieta idGoal.
     * 
     */
    public void setIdGoal(int value) {
        this.idGoal = value;
    }

    /**
     * Recupera il valore della proprieta initialWeight.
     * 
     */
    public double getInitialWeight() {
        return initialWeight;
    }

    /**
     * Imposta il valore della proprieta initialWeight.
     * 
     */
    public void setInitialWeight(double value) {
        this.initialWeight = value;
    }

    /**
     * Recupera il valore della proprieta lostWeight.
     * 
     */
    public int getLostWeight() {
        return lostWeight;
    }

    /**
     * Imposta il valore della proprieta lostWeight.
     * 
     */
    public void setLostWeight(int value) {
        this.lostWeight = value;
    }

    /**
     * Recupera il valore della proprieta maxBloodPressure.
     * 
     */
    public int getMaxBloodPressure() {
        return maxBloodPressure;
    }

    /**
     * Imposta il valore della proprieta maxBloodPressure.
     * 
     */
    public void setMaxBloodPressure(int value) {
        this.maxBloodPressure = value;
    }

    /**
     * Recupera il valore della proprieta minBloodPressure.
     * 
     */
    public int getMinBloodPressure() {
        return minBloodPressure;
    }

    /**
     * Imposta il valore della proprieta minBloodPressure.
     * 
     */
    public void setMinBloodPressure(int value) {
        this.minBloodPressure = value;
    }

    /**
     * Recupera il valore della proprieta sleepHours.
     * 
     */
    public int getSleepHours() {
        return sleepHours;
    }

    /**
     * Imposta il valore della proprieta sleepHours.
     * 
     */
    public void setSleepHours(int value) {
        this.sleepHours = value;
    }

    /**
     * Recupera il valore della proprieta steps.
     * 
     */
    public int getSteps() {
        return steps;
    }

    /**
     * Imposta il valore della proprieta steps.
     * 
     */
    public void setSteps(int value) {
        this.steps = value;
    }


	public int getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(int value) {
        this.idPerson = value;
    }

}
