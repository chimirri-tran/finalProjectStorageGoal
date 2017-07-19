
package introsde.document.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.document.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateGoal_QNAME = new QName("http://ws.document.introsde/", "createGoal");
    private final static QName _DeleteGoal_QNAME = new QName("http://ws.document.introsde/", "deleteGoal");
    private final static QName _ReadGoalResponse_QNAME = new QName("http://ws.document.introsde/", "readGoalResponse");
    private final static QName _UpdateGoal_QNAME = new QName("http://ws.document.introsde/", "updateGoal");
    private final static QName _ReadGoal_QNAME = new QName("http://ws.document.introsde/", "readGoal");
    private final static QName _ReadGoalList_QNAME = new QName("http://ws.document.introsde/", "readGoalList");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://ws.document.introsde/", "deleteGoalResponse");
    private final static QName _GetGoalByIdPersonResponse_QNAME = new QName("http://ws.document.introsde/", "getGoalByIdPersonResponse");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://ws.document.introsde/", "createGoalResponse");
    private final static QName _GetGoalByIdPerson_QNAME = new QName("http://ws.document.introsde/", "getGoalByIdPerson");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://ws.document.introsde/", "updateGoalResponse");
    private final static QName _ReadGoalListResponse_QNAME = new QName("http://ws.document.introsde/", "readGoalListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.document.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalByIdPersonResponse }
     * 
     */
    public GetGoalByIdPersonResponse createGetGoalByIdPersonResponse() {
        return new GetGoalByIdPersonResponse();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link GetGoalByIdPerson }
     * 
     */
    public GetGoalByIdPerson createGetGoalByIdPerson() {
        return new GetGoalByIdPerson();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
    }

    /**
     * Create an instance of {@link ReadGoalListResponse }
     * 
     */
    public ReadGoalListResponse createReadGoalListResponse() {
        return new ReadGoalListResponse();
    }

    /**
     * Create an instance of {@link CreateGoal }
     * 
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link ReadGoalResponse }
     * 
     */
    public ReadGoalResponse createReadGoalResponse() {
        return new ReadGoalResponse();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     * 
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link ReadGoal }
     * 
     */
    public ReadGoal createReadGoal() {
        return new ReadGoal();
    }

    /**
     * Create an instance of {@link ReadGoalList }
     * 
     */
    public ReadGoalList createReadGoalList() {
        return new ReadGoalList();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readGoalResponse")
    public JAXBElement<ReadGoalResponse> createReadGoalResponse(ReadGoalResponse value) {
        return new JAXBElement<ReadGoalResponse>(_ReadGoalResponse_QNAME, ReadGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readGoal")
    public JAXBElement<ReadGoal> createReadGoal(ReadGoal value) {
        return new JAXBElement<ReadGoal>(_ReadGoal_QNAME, ReadGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readGoalList")
    public JAXBElement<ReadGoalList> createReadGoalList(ReadGoalList value) {
        return new JAXBElement<ReadGoalList>(_ReadGoalList_QNAME, ReadGoalList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalByIdPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "getGoalByIdPersonResponse")
    public JAXBElement<GetGoalByIdPersonResponse> createGetGoalByIdPersonResponse(GetGoalByIdPersonResponse value) {
        return new JAXBElement<GetGoalByIdPersonResponse>(_GetGoalByIdPersonResponse_QNAME, GetGoalByIdPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGoalByIdPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "getGoalByIdPerson")
    public JAXBElement<GetGoalByIdPerson> createGetGoalByIdPerson(GetGoalByIdPerson value) {
        return new JAXBElement<GetGoalByIdPerson>(_GetGoalByIdPerson_QNAME, GetGoalByIdPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.document.introsde/", name = "readGoalListResponse")
    public JAXBElement<ReadGoalListResponse> createReadGoalListResponse(ReadGoalListResponse value) {
        return new JAXBElement<ReadGoalListResponse>(_ReadGoalListResponse_QNAME, ReadGoalListResponse.class, null, value);
    }

}
