package FutbolServisi_pkg;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;

import org.apache.axis.Constants;

public class Client {

	public static void main(String[] args) {
		
		try {		
			String endpoint = "http://localhost:8080/FutbolServisi/services/FutbolServisiSOAP";
			
			Service service = new Service();
			Call call = (Call) service.createCall();
			
/*BURASI*/	//Servis geri donus tipini XML olarak belirliyor ve bu sinif icin serializer/deserializer yaratiyor
/*YENI*/	QName XMLType = new QName("FutbolServisi", "ServisYaniti");
			BeanSerializerFactory bsf = new BeanSerializerFactory(ServisYaniti.class, XMLType);
		   	BeanDeserializerFactory bdf = new BeanDeserializerFactory(ServisYaniti.class, XMLType);
			
		   	//XML ile Java sinifinin tiplerini eslestiriyor
/*BU DA*/	call.registerTypeMapping(ServisYaniti.class, XMLType, bsf, bdf);			
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			call.addParameter("TakimNo", Constants.XSD_INTEGER, ParameterMode.IN);
			call.addParameter("TakimAdi", Constants.XSD_STRING, ParameterMode.IN);

			QName qName = new QName("http://tempuri.org/", "FutbolcuDizisi");
			call.addParameter("Futbolcular", qName, ParameterMode.IN);
			
/*ONEMLÝ*/	call.setReturnType(XMLType);
			call.setOperationName(new QName("http://tempuri.org/", "TakimKaydet"));
			
			Futbolcu[] futbolcular = new Futbolcu[] {
					new Futbolcu("Onur", 1, 1, 0),
					new Futbolcu("Furkan", 1, 2, 0),
					new Futbolcu("Cahit", 1, 3, 0),
					new Futbolcu("Taner", 1, 4, 0),
					new Futbolcu("Bozbay", 1, 5, 0)};
			
			Object[] values =
			        new Object[] {
			         1,
			         "Sigirlar",
			         futbolcular
			        };
			
			ServisYaniti ret = (ServisYaniti) call.invoke(values);
			System.out.println(ret.getMesaj());
			
			karsilasmaEkle();
			karsilasmaGetir();
			takimGetir();
		
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}
	
	public static void karsilasmaEkle() throws ServiceException, MalformedURLException, RemoteException {
		String endpoint = "http://localhost:8080/FutbolServisi/services/FutbolServisiSOAP";
		
		Service service = new Service();
		Call call = (Call) service.createCall();
		
		QName XMLType = new QName("FutbolServisi", "ServisYaniti");
		BeanSerializerFactory bsf = new BeanSerializerFactory(ServisYaniti.class, XMLType);
	   	BeanDeserializerFactory bdf = new BeanDeserializerFactory(ServisYaniti.class, XMLType);
		
	   	call.registerTypeMapping(ServisYaniti.class, XMLType, bsf, bdf);		
		call.setTargetEndpointAddress(new java.net.URL(endpoint));
		call.addParameter("HaftaNo", Constants.XSD_INTEGER, ParameterMode.IN);
		call.addParameter("EvSahibiTakimNo", Constants.XSD_INTEGER, ParameterMode.IN);
		call.addParameter("MisafirTakimNo", Constants.XSD_INTEGER, ParameterMode.IN);
		call.addParameter("EvSahibiGolSayisi", Constants.XSD_INTEGER, ParameterMode.IN);
		call.addParameter("MisafirGolSayisi", Constants.XSD_INTEGER, ParameterMode.IN);
		call.setReturnType(XMLType);
		call.setOperationName(new QName("http://tempuri.org/", "KarsilasmaKaydet"));
		
		ServisYaniti ret = (ServisYaniti) call.invoke(new Object[] {11, 1, 1, 3, 2});
		System.out.println(ret.getMesaj());
	}

	public static void karsilasmaGetir() throws ServiceException, MalformedURLException, RemoteException {
		String endpoint = "http://localhost:8080/FutbolServisi/services/FutbolServisiSOAP";
		
		Service service = new Service();
		Call call = (Call) service.createCall();
		
		QName XMLType = new QName("FutbolServisi", "KarsilasmaYaniti");
		BeanSerializerFactory bsf = new BeanSerializerFactory(KarsilasmaYaniti.class, XMLType);
	   	BeanDeserializerFactory bdf = new BeanDeserializerFactory(KarsilasmaYaniti.class, XMLType);
		
	   	call.registerTypeMapping(KarsilasmaYaniti.class, XMLType, bsf, bdf);
	   	call.setTargetEndpointAddress(new java.net.URL(endpoint));
		call.addParameter("TakimNumarasi", Constants.XSD_INT, ParameterMode.IN);
		call.setReturnType(XMLType);
		call.setOperationName(new QName("http://tempuri.org/", "KarsilasmaGetir"));
	
		KarsilasmaYaniti ret = (KarsilasmaYaniti) call.invoke(new Object[] {1});
		System.out.println(ret.getMesaj());
		for (Karsilasma k : ret.getKarsilasmalar()) {
			System.out.println("Karsilasma hafta no: " + k.getHaftaNo());
		}
	}
	
	public static void takimGetir() throws ServiceException, MalformedURLException, RemoteException {
		String endpoint = "http://localhost:8080/FutbolServisi/services/FutbolServisiSOAP";
		
		Service service = new Service();
		Call call = (Call) service.createCall();
		
		QName XMLType = new QName("FutbolServisi", "TakimYaniti");
		BeanSerializerFactory bsf = new BeanSerializerFactory(TakimYaniti.class, XMLType);
	   	BeanDeserializerFactory bdf = new BeanDeserializerFactory(TakimYaniti.class, XMLType);
	   	
	   	call.registerTypeMapping(TakimYaniti.class, XMLType, bsf, bdf);		
		call.setTargetEndpointAddress(new java.net.URL(endpoint));
		call.addParameter("TakimNo", Constants.XSD_INT, ParameterMode.IN);
		call.setReturnType(XMLType);
		call.setOperationName(new QName("http://tempuri.org/", "TakimGetir"));
		
		TakimYaniti ret = (TakimYaniti) call.invoke(new Object[] {1});
		System.out.println(ret.getMesaj());
		System.out.println(ret.getTakim().getTakimAdi());
		for (Futbolcu f : ret.getTakim().getFutbolcular()) {
			System.out.println(f.getAdSoyad());
		}
	}
}
