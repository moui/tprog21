
package publicadores;

import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */

@WebServiceClient(name = "WebServicesIDeportivasService", targetNamespace = "http://Publicadores/", wsdlLocation = "http://localhost:9129/ctrlInstituciones?wsdl")
public class WebServicesIDeportivasService
    extends Service
{

    private final static URL WEBSERVICESIDEPORTIVASSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICESIDEPORTIVASSERVICE_EXCEPTION;
    private final static QName WEBSERVICESIDEPORTIVASSERVICE_QNAME = new QName("http://Publicadores/", "WebServicesIDeportivasService");

    static {
    	URL url = null;
        WebServiceException e = null;
        try {
        	Properties p = null;
        	String valUrl = "";
        	try {
    	    	FileReader reader=new FileReader("/entrenamosUy/conf.properties");  
    	    	p=new Properties();  
    	    	p.load(reader); 
    	    	valUrl = p.getProperty("urlIDeportivas");
        	} catch (Exception ex) {}
            url = new URL(valUrl);
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICESIDEPORTIVASSERVICE_WSDL_LOCATION = url;
        WEBSERVICESIDEPORTIVASSERVICE_EXCEPTION = e;
    }

    public WebServicesIDeportivasService() {
        super(__getWsdlLocation(), WEBSERVICESIDEPORTIVASSERVICE_QNAME);
    }

    public WebServicesIDeportivasService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICESIDEPORTIVASSERVICE_QNAME, features);
    }

    public WebServicesIDeportivasService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICESIDEPORTIVASSERVICE_QNAME);
    }

    public WebServicesIDeportivasService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICESIDEPORTIVASSERVICE_QNAME, features);
    }

    public WebServicesIDeportivasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServicesIDeportivasService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServicesIDeportivas
     */
    @WebEndpoint(name = "WebServicesIDeportivasPort")
    public WebServicesIDeportivas getWebServicesIDeportivasPort() {
        return super.getPort(new QName("http://Publicadores/", "WebServicesIDeportivasPort"), WebServicesIDeportivas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServicesIDeportivas
     */
    @WebEndpoint(name = "WebServicesIDeportivasPort")
    public WebServicesIDeportivas getWebServicesIDeportivasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Publicadores/", "WebServicesIDeportivasPort"), WebServicesIDeportivas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICESIDEPORTIVASSERVICE_EXCEPTION!= null) {
            throw WEBSERVICESIDEPORTIVASSERVICE_EXCEPTION;
        }
        return WEBSERVICESIDEPORTIVASSERVICE_WSDL_LOCATION;
    }

}
