
package publicadores;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import net.java.dev.jaxb.array.StringArray;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServicesIDeportivas", targetNamespace = "http://Publicadores/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    net.java.dev.jaxb.array.ObjectFactory.class,
    publicadores.ObjectFactory.class
})
public interface WebServicesIDeportivas {


    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws InstitucionDeportivaRepetidaException_Exception
     */
    @WebMethod
    @Action(input = "http://Publicadores/WebServicesIDeportivas/altaInstitucionRequest", output = "http://Publicadores/WebServicesIDeportivas/altaInstitucionResponse", fault = {
        @FaultAction(className = InstitucionDeportivaRepetidaException_Exception.class, value = "http://Publicadores/WebServicesIDeportivas/altaInstitucion/Fault/InstitucionDeportivaRepetidaException")
    })
    public void altaInstitucion(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2)
        throws InstitucionDeportivaRepetidaException_Exception
    ;

    /**
     * 
     * @return
     *     returns publicadores.DataInstitucionArray
     * @throws InstitucionDeportivaNoExisteException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesIDeportivas/getInstitucionesRequest", output = "http://Publicadores/WebServicesIDeportivas/getInstitucionesResponse", fault = {
        @FaultAction(className = InstitucionDeportivaNoExisteException_Exception.class, value = "http://Publicadores/WebServicesIDeportivas/getInstituciones/Fault/InstitucionDeportivaNoExisteException")
    })
    public DataInstitucionArray getInstituciones()
        throws InstitucionDeportivaNoExisteException_Exception
    ;

    /**
     * 
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesIDeportivas/darNombreInstitucionesRequest", output = "http://Publicadores/WebServicesIDeportivas/darNombreInstitucionesResponse")
    public StringArray darNombreInstituciones();

    /**
     * 
     * @param arg0
     * @return
     *     returns publicadores.DataInstitucion
     * @throws InstitucionDeportivaNoExisteException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesIDeportivas/getInstitucionRequest", output = "http://Publicadores/WebServicesIDeportivas/getInstitucionResponse", fault = {
        @FaultAction(className = InstitucionDeportivaNoExisteException_Exception.class, value = "http://Publicadores/WebServicesIDeportivas/getInstitucion/Fault/InstitucionDeportivaNoExisteException")
    })
    public DataInstitucion getInstitucion(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws InstitucionDeportivaNoExisteException_Exception
    ;

    /**
     * 
     * @return
     *     returns publicadores.DataInstitucion
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesIDeportivas/newDataInstitucionRequest", output = "http://Publicadores/WebServicesIDeportivas/newDataInstitucionResponse")
    public DataInstitucion newDataInstitucion();

}
