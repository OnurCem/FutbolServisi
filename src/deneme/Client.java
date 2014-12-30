package deneme;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import org.apache.axis.Constants;

public class Client {

	public static void main(String[] args) {
		
		try {		
			//String endpoint = "http://localhost:8080/FutbolServisi/services/FutbolServisiSOAP";
			String endpoint = "http://192.168.0.15:8080/FutbolServisi/services/FutbolServisiSOAP";
			
			Service service = new Service();
			Call call = (Call) service.createCall();
			
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			call.addParameter("TakimNo", Constants.XSD_INTEGER, ParameterMode.IN);
			call.addParameter("TakimAdi", Constants.XSD_STRING, ParameterMode.IN);

			QName qName = new QName("http://tempuri.org/", "FutbolcuDizisi");
			call.addParameter("Futbolcular", qName, ParameterMode.IN);
			
			call.setReturnType(Constants.XSD_BOOLEAN);
			call.setOperationName(new QName("http://tempuri.org/", "TakimKaydet"));
			
			FutbolcuTipi[] futbolcular = new FutbolcuTipi[] {
					new FutbolcuTipi("Onur", 1, 1, 0),
					new FutbolcuTipi("Furkan", 1, 2, 0),
					new FutbolcuTipi("Cahit", 1, 3, 0),
					new FutbolcuTipi("Taner", 1, 4, 0),
					new FutbolcuTipi("Bozbay", 1, 5, 0)};
			
			Object[] values =
			        new Object[] {
			         1,
			         "Deadline Dev",
			         futbolcular
			        };
			
			Boolean ret = (Boolean) call.invoke(values);
			
			//System.out.println("Service return: " + ret);
		
		} catch (Exception e) {
			System.err.println(e.toString());
		}

	}

}
