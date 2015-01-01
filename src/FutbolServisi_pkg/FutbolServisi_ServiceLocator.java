/**
 * FutbolServisi_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package FutbolServisi_pkg;

public class FutbolServisi_ServiceLocator extends org.apache.axis.client.Service implements FutbolServisi_pkg.FutbolServisi_Service {

    public FutbolServisi_ServiceLocator() {
    }


    public FutbolServisi_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FutbolServisi_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FutbolServisiSOAP
    private java.lang.String FutbolServisiSOAP_address = "http://tempuri.org";

    public java.lang.String getFutbolServisiSOAPAddress() {
        return FutbolServisiSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FutbolServisiSOAPWSDDServiceName = "FutbolServisiSOAP";

    public java.lang.String getFutbolServisiSOAPWSDDServiceName() {
        return FutbolServisiSOAPWSDDServiceName;
    }

    public void setFutbolServisiSOAPWSDDServiceName(java.lang.String name) {
        FutbolServisiSOAPWSDDServiceName = name;
    }

    public FutbolServisi_pkg.FutbolServisi_PortType getFutbolServisiSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FutbolServisiSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFutbolServisiSOAP(endpoint);
    }

    public FutbolServisi_pkg.FutbolServisi_PortType getFutbolServisiSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            FutbolServisi_pkg.FutbolServisiSOAPStub _stub = new FutbolServisi_pkg.FutbolServisiSOAPStub(portAddress, this);
            _stub.setPortName(getFutbolServisiSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFutbolServisiSOAPEndpointAddress(java.lang.String address) {
        FutbolServisiSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (FutbolServisi_pkg.FutbolServisi_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                FutbolServisi_pkg.FutbolServisiSOAPStub _stub = new FutbolServisi_pkg.FutbolServisiSOAPStub(new java.net.URL(FutbolServisiSOAP_address), this);
                _stub.setPortName(getFutbolServisiSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FutbolServisiSOAP".equals(inputPortName)) {
            return getFutbolServisiSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("FutbolServisi", "FutbolServisi");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("FutbolServisi", "FutbolServisiSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FutbolServisiSOAP".equals(portName)) {
            setFutbolServisiSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
