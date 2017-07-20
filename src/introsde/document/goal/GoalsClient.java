package introsde.document.goal;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.net.URL;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Service;

import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import introsde.document.goal.JaxWsHandlerResolver;
import introsde.document.ws.Goal;
import introsde.document.ws.Goals;
@Stateless
@LocalBean
@Path("/goalStorage")
public class GoalsClient {
	
	public GoalsClient(){}

	private URL url;
	private QName qname;
	private Goals goals;
	private DocumentBuilderFactory domFactory;
	private DocumentBuilder builder;
	private Document doc;
	SOAPConnectionFactory soapConnectionFactory;
	SOAPConnection soapConnection;

	SOAPMessage soapMessage = null;
	SOAPBody soapBody = null;

	final String ENVELOPE_NAMESPACE = "http://schemas.xmlsoap.org/soap/envelope/";
	final String ENVELOPE_NAMESPACE_TAG = "ws";
	final String ENCODING_NAMESPACE = "http://www.w3.org/2001/12/soap-encoding";

	final String BODY_NAMESPACE = "http://ws.document.introsde/";
	final String BODY_NAMESPACE_TAG = "m";

	String mediaType = "text/xml";
	
	public GoalsClient(){}

	public GoalsClient(String endpointUrl) throws Exception {
		// My server local
		// final String MY_LOCAL_SERVER = "http://127.0.1.1:6902";

		// My server that should be deployed on Heroku
		// String MY_HEROKU_SERVER = "https://agile-shelf-1769.herokuapp.com";
		// String BASE_URL = "/ws/people";
		// String endpointUrl = MY_HEROKU_SERVER + BASE_URL + "?wsdl";

		System.out.println("Starting Goals Service...");
		System.out.println("**STEP 1**");
		System.out.println("WSDL url " + endpointUrl + "\n[kill the process to exit]");

		// 1st argument service URI, refer to wsdl document above
		url = new URL(endpointUrl);

		// 2nd argument is service name, refer to wsdl document above
		qname = new QName("http://ws.document.introsde/", "GoalService");

		Service service = Service.create(url, qname);

		FileOutputStream fos = new FileOutputStream(new File("output.txt"), true);
		service.setHandlerResolver(new JaxWsHandlerResolver(fos));
		goals = service.getPort(Goals.class);

		// Create SOAP Connection
		soapConnectionFactory = SOAPConnectionFactory.newInstance();
		soapConnection = soapConnectionFactory.createConnection();
	}

	
	// ricevo dati da sopra per salvare utente se non esiste o per aggiornare se
		// esiste
		@GET

		@Produces({ MediaType.TEXT_XML, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
		public String receiveData(
				@DefaultValue("") @QueryParam("savegoal") String savegoal,
				@DefaultValue("") @QueryParam("finalweight") String finalweight,
				@DefaultValue("") @QueryParam("actualweight") String actualweight,
				@DefaultValue("") @QueryParam("heartrate") String heartrate,
				@DefaultValue("") @QueryParam("height") String height,
				@DefaultValue("") @QueryParam("initialweight") String initialweight,
				@DefaultValue("") @QueryParam("lostweight") String lostweight,
				@DefaultValue("") @QueryParam("minbloodpressure") String minbloodpressure,
				@DefaultValue("") @QueryParam("maxbloodpressure") String maxbloodpressure,
				@DefaultValue("") @QueryParam("sleephours") String sleephours,
				@DefaultValue("") @QueryParam("steps") String steps,
				@DefaultValue("") @QueryParam("idperson") String idperson
				) 
						throws Exception {
			System.out.println("GET");
			String urlserver = "http://localhost:6904/ws/goal";
			GoalsClient g = new GoalsClient(urlserver);
				if (savegoal.equals("yes")){
			String ggg="nuovo";
			for (int i = 0; i < g.request_1().size(); i++) {
				if (g.request_1().get(i).getIdPerson()== Integer.parseInt(idperson)) {
					 SOAPMessage soapResponse3 = g.soapConnection
							 .call(g.request_3(Double.parseDouble(actualweight), Double.parseDouble(finalweight), Integer.parseInt(heartrate), Double.parseDouble(height), Integer.parseInt(idperson),
									 Double.parseDouble(initialweight), Integer.parseInt(lostweight), Integer.parseInt(minbloodpressure), Integer.parseInt(maxbloodpressure), Integer.parseInt(sleephours) ,Integer.parseInt(steps)), g.url);
							 System.out.println("INBOUND MESSAGE\n");
							 System.out.println(getSOAPMessageAsString(soapResponse3));
					
					ggg="";
					return "update user";
				}

			}
			if (ggg.equals("nuovo")) {
				
				SOAPMessage soapResponse4 = g.soapConnection.call(g.request_4( Double.parseDouble(actualweight), Double.parseDouble(finalweight), Integer.parseInt(heartrate), Double.parseDouble(height), Integer.parseInt(idperson),
						 Double.parseDouble(initialweight), Integer.parseInt(lostweight), Integer.parseInt(minbloodpressure), Integer.parseInt(maxbloodpressure), Integer.parseInt(sleephours) ,Integer.parseInt(steps)), g.url);
				System.out.println("INBOUND MESSAGE\n");
				System.out.println(getSOAPMessageAsString(soapResponse4));
				/**/
				domFactory = DocumentBuilderFactory.newInstance();
				domFactory.setNamespaceAware(true);
				builder = domFactory.newDocumentBuilder();
				doc = builder.parse(new InputSource(new StringReader(getSOAPMessageAsString(soapResponse4))));
				Element rootElement = doc.getDocumentElement();

				String found = "";
				for (int i = 0; i < rootElement.getChildNodes().getLength(); i++) {
					System.out.println("found: " + rootElement.getTextContent());
					if (rootElement.getChildNodes().item(i).getNodeName().equals("idPerson")) {
						found = rootElement.getTextContent();
					}
				}
				return rootElement.getTextContent();
				/**/
			}
			}else {
				for (int i = 0; i < g.request_1().size(); i++) {
					if (g.request_1().get(i).getIdPerson()==  Integer.parseInt(idperson)) {
						Goal goal= g.getGoalByIdPerson(Integer.parseInt(idperson));
						JSONObject params = new JSONObject();
						  params.put("finalweight",goal.getFinalWeight());
						  params.put("actualweight",goal.getActualWeight());
						  params.put("heartrate",goal.getHeartRate());
						  params.put("idperson",goal.getIdPerson());
						  params.put("height",goal.getHeight());
						  params.put("initialweight",goal.getInitialWeight());
						  params.put("lostweight",goal.getLostWeight());
						  params.put("minbloodpressure",goal.getMinBloodPressure());
						  params.put("maxbloodpressure",goal.getMaxBloodPressure());
						  params.put("sleephours",goal.getSleepHours());
						  params.put("steps",goal.getSteps());
						return params.toString();
					} else {
						return "-1";
				
					}

				}
			}
				return null;

			// MANDARE UNA RISPOSTA AL LIVELLO SOPRA return ;

		}

/*
	public static void main(String[] args) throws Exception {
		// assert() : "mi aspetto true";
		if (args.length < 1)
			System.out.println("Error: insert server url");

		else {
			
			try {

				GoalsClient c = new GoalsClient(args[0]);
				System.out.println("**STEP 2*");
				c.getGoalByIdPerson(3);
				//c.request_1();
				//c.getGoalByIdPerson();

//				 SOAPMessage soapResponse3 = c.soapConnection
//				 .call(c.request_3(ChooseId), c.url);
//				 System.out.println("INBOUND MESSAGE\n");
//				 System.out.println(getSOAPMessageAsString(soapResponse3));
//				
//
//				SOAPMessage soapResponse4 = c.soapConnection.call(c.request_4( ActualWeight,  FinalWeight,  HeartRate,  Height,  idPerson,
//						 InitialWeight,  LostWeight, 	 MinBloodPressure,  MaxBloodPressure,  SleepHours ,  Steps), c.url);
//				System.out.println("INBOUND MESSAGE\n");
//				System.out.println(getSOAPMessageAsString(soapResponse4));
				
				/**/
//				 domFactory = DocumentBuilderFactory.newInstance();
//				  domFactory.setNamespaceAware(true);
//				  builder = domFactory.newDocumentBuilder();
//			     doc = builder.parse(new InputSource(new StringReader(getSOAPMessageAsString(soapResponse4))));
//			    Element rootElement = doc.getDocumentElement();
//			   
//			   String found="";
//			   for(int i = 0; i < rootElement.getChildNodes().getLength();i++){
//					System.out.println("found: "+rootElement.getTextContent());
//				   if (rootElement.getChildNodes().item(i).getNodeName().equals("idPerson")){
//					   found = rootElement.getTextContent();
//				   }
//			   }
/*			    
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}*/

	public List<Goal> request_1() {
		System.out.println("REQUEST 1");
		templateRequest(1, "POST", mediaType);
		return goals.readGoalList();
	}

	public void request_2() {
		System.out.println("REQUEST 2");
		templateRequest(2, "POST", mediaType);
		int i = 52;
	
		goals.readGoal(i);
		
	}
	
	public Goal getGoalByIdPerson(int i ) {
		System.out.println("getGoalByIdPerson");
		templateRequest(2, "POST", mediaType);
		
		return goals.getGoalByIdPerson(i);
		
	}

	public SOAPMessage request_3(double ActualWeight, double FinalWeight, int HeartRate, double Height, int idPerson,
			double InitialWeight, double LostWeight, 	int MinBloodPressure, int MaxBloodPressure, int SleepHours , int Steps) {
		String method_3 = "updateGoal";
		String arg0 = "idGoal";
		String arg1 = "actualWeight";
		String arg2 = "finalWeight";
		String arg3 = "heartRate";
		String arg4 = "hight";
		String arg5 = "idPerson";
		String arg6 = "initialWeight";
		String arg7 = "lostWeight";
		String arg8 = "maxBloodPressure";
		String arg9 = "minBloodPressure";
		String arg10 = "sleepHours";
		String arg11 = "steps";
		
		
		try {
			createSOAPRequest();
			SOAPElement updateGoal = soapBody.addChildElement(method_3, BODY_NAMESPACE_TAG);

			SOAPElement goal = updateGoal.addChildElement("goal");

//			SOAPElement goalId = goal.addChildElement(arg0);
//			 goalId.addTextNode(String.valueOf(idGoal));

			SOAPElement actualWeight = goal.addChildElement(arg1);
			actualWeight.addTextNode(String.valueOf(ActualWeight));

			SOAPElement finalWeight = goal.addChildElement(arg2);
			finalWeight.addTextNode(String.valueOf(FinalWeight));

			SOAPElement heartRate = goal.addChildElement(arg3);
			heartRate.addTextNode(String.valueOf(HeartRate));

			SOAPElement height = goal.addChildElement(arg4);
			height.addTextNode(String.valueOf(Height));

			SOAPElement IdPerson = goal.addChildElement(arg5);
			IdPerson.addTextNode(String.valueOf(idPerson));

			SOAPElement initialWeight = goal.addChildElement(arg6);
			initialWeight.addTextNode(String.valueOf(InitialWeight));

			SOAPElement lostWeight = goal.addChildElement(arg7);
			lostWeight.addTextNode(String.valueOf(LostWeight));

			SOAPElement maxBloodPressure = goal.addChildElement(arg8);
			maxBloodPressure.addTextNode(String.valueOf(MaxBloodPressure));

			SOAPElement minBloodPressure = goal.addChildElement(arg9);
			minBloodPressure.addTextNode(String.valueOf(MinBloodPressure));

			SOAPElement sleepHours = goal.addChildElement(arg10);
			sleepHours.addTextNode(String.valueOf(SleepHours));

			SOAPElement steps = goal.addChildElement(arg11);
			steps.addTextNode(String.valueOf(Steps));

			//goal.addChildElement(goalId);
			goal.addChildElement(actualWeight);
			goal.addChildElement(finalWeight);
			goal.addChildElement(heartRate);
			goal.addChildElement(height);
			goal.addChildElement(IdPerson);
			goal.addChildElement(initialWeight);
			goal.addChildElement(lostWeight);
			goal.addChildElement(maxBloodPressure);
			goal.addChildElement(minBloodPressure);
			goal.addChildElement(sleepHours);

			soapMessage.saveChanges();

			/* Print the request message */
			templateRequest(3, "PUT", mediaType);
			System.out.println("OUTBOUND MESSAGE\n");
			System.out.println(getSOAPMessageAsString(soapMessage));
			System.out.println();

			return soapMessage;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public SOAPMessage request_4(double ActualWeight, double FinalWeight, int HeartRate, double Height, int idPerson,
	double InitialWeight, double LostWeight, 	int MinBloodPressure, int MaxBloodPressure, int SleepHours , int Steps) {

		SOAPElement createGoal = null;
		String method_4 = "createGoal";
		String arg0 = "idGoal";
		String arg1 = "actualWeight";
		String arg2 = "finalWeight";
		String arg3 = "heartRate";
		String arg4 = "height";
		String arg5 = "idPerson";
		String arg6 = "initialWeight";
		String arg7 = "lostWeight";
		String arg8 = "maxBloodPressure";
		String arg9 = "minBloodPressure";
		String arg10 = "sleepHours";
		String arg11 = "steps";

		int idGoal;
		
		try {
			createSOAPRequest();
			createGoal = soapBody.addChildElement(method_4, BODY_NAMESPACE_TAG);

			SOAPElement goal = createGoal.addChildElement("goal");

			SOAPElement actualWeight = goal.addChildElement(arg1);
			actualWeight.addTextNode(String.valueOf(ActualWeight));

			SOAPElement finalWeight = goal.addChildElement(arg2);
			finalWeight.addTextNode(String.valueOf(FinalWeight));

			SOAPElement heartRate = goal.addChildElement(arg3);
			heartRate.addTextNode(String.valueOf(HeartRate));

			SOAPElement height = goal.addChildElement(arg4);
			height.addTextNode(String.valueOf(Height));

			SOAPElement IdPerson = goal.addChildElement(arg5);
			IdPerson.addTextNode(String.valueOf(idPerson));

			SOAPElement initialWeight = goal.addChildElement(arg6);
			initialWeight.addTextNode(String.valueOf(InitialWeight));

			SOAPElement lostWeight = goal.addChildElement(arg7);
			lostWeight.addTextNode(String.valueOf(LostWeight));

			SOAPElement maxBloodPressure = goal.addChildElement(arg8);
			maxBloodPressure.addTextNode(String.valueOf(MaxBloodPressure));

			SOAPElement minBloodPressure = goal.addChildElement(arg9);
			minBloodPressure.addTextNode(String.valueOf(MinBloodPressure));

			SOAPElement sleepHours = goal.addChildElement(arg10);
			sleepHours.addTextNode(String.valueOf(SleepHours));

			SOAPElement steps = goal.addChildElement(arg11);
			steps.addTextNode(String.valueOf(Steps));

			goal.addChildElement(actualWeight);
			goal.addChildElement(finalWeight);
			goal.addChildElement(heartRate);
			goal.addChildElement(height);
			goal.addChildElement(IdPerson);
			goal.addChildElement(initialWeight);
			goal.addChildElement(lostWeight);
			goal.addChildElement(maxBloodPressure);
			goal.addChildElement(minBloodPressure);
			goal.addChildElement(sleepHours);

			soapMessage.saveChanges();

			/* Print the request message */
			templateRequest(4, "POST", mediaType);
			System.out.println("OUTBOUND MESSAGE\n");
			System.out.println(getSOAPMessageAsString(soapMessage));
			System.out.println();
			
			return soapMessage;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public void request_5() {
		templateRequest(5, "DELETE", mediaType);
		int i = 0;
		while (goals.readGoal(i) == null) {
			i = (int) (Math.random() * 100);
			// System.out.println(i);
		}

		goals.deleteGoal(i);
	}

	public void createSOAPRequest() throws Exception {
		// Create message
		MessageFactory messageFactory = MessageFactory.newInstance();
		soapMessage = messageFactory.createMessage();
		SOAPPart soapPart = soapMessage.getSOAPPart();

		// SOAP Envelope
		SOAPEnvelope envelope = soapPart.getEnvelope();
		// envelope.addNamespaceDeclaration(ENVELOPE_NAMESPACE_TAG,ENVELOPE_NAMESPACE);
		envelope.setEncodingStyle(ENCODING_NAMESPACE);

		// SOAP Body
		soapBody = envelope.getBody();
		soapBody.addNamespaceDeclaration(BODY_NAMESPACE_TAG, BODY_NAMESPACE);
	}

	public static String getSOAPMessageAsString(SOAPMessage soapMessage) {
		try {

			TransformerFactory tff = TransformerFactory.newInstance();
			Transformer tf = tff.newTransformer();

			// Set formatting

			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

			Source sc = soapMessage.getSOAPPart().getContent();

			ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
			StreamResult result = new StreamResult(streamOut);
			tf.transform(sc, result);

			String strMessage = streamOut.toString();
			return strMessage;
		} catch (Exception e) {
			System.out.println("Exception in getSOAPMessageAsString " + e.getMessage());
			return null;
		}

	}

	/**
	 * 
	 * @param numberRequest
	 * @param method
	 * @param mediaType
	 */
	public static void templateRequest(int numberRequest, String method, String mediaType) {
		mediaType = mediaType.toUpperCase();
		System.out.println(
				"======================================================================================================");
		System.out.println("Method #" + numberRequest + ": " + method + " " + "Accept: " + mediaType + " "
				+ "Content-Type: " + mediaType);
		System.out.println();
	}

}
