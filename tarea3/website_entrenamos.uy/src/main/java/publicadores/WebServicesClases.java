
package publicadores;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServicesClases", targetNamespace = "http://Publicadores/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServicesClases {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @throws ClaseLlenaException_Exception
     * @throws ClaseYaCompradaException_Exception
     */
    @WebMethod
    @Action(input = "http://Publicadores/WebServicesClases/registrarSocioAClaseRequest", output = "http://Publicadores/WebServicesClases/registrarSocioAClaseResponse", fault = {
        @FaultAction(className = ClaseYaCompradaException_Exception.class, value = "http://Publicadores/WebServicesClases/registrarSocioAClase/Fault/ClaseYaCompradaException"),
        @FaultAction(className = ClaseLlenaException_Exception.class, value = "http://Publicadores/WebServicesClases/registrarSocioAClase/Fault/ClaseLlenaException")
    })
    public void registrarSocioAClase(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        boolean arg3,
        @WebParam(name = "arg4", partName = "arg4")
        String arg4,
        @WebParam(name = "arg5", partName = "arg5")
        XMLGregorianCalendar arg5)
        throws ClaseLlenaException_Exception, ClaseYaCompradaException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws PremioSorteadosException_Exception
     */
    @WebMethod
    @Action(input = "http://Publicadores/WebServicesClases/sortearPremiosRequest", output = "http://Publicadores/WebServicesClases/sortearPremiosResponse", fault = {
        @FaultAction(className = PremioSorteadosException_Exception.class, value = "http://Publicadores/WebServicesClases/sortearPremios/Fault/PremioSorteadosException")
    })
    public void sortearPremios(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws PremioSorteadosException_Exception
    ;

    /**
     * 
     * @param arg7
     * @param arg6
     * @param arg9
     * @param arg8
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg13
     * @param arg1
     * @param arg0
     * @param arg10
     * @param arg11
     * @param arg12
     * @throws ClaseRepetidaException_Exception
     */
    @WebMethod
    @Action(input = "http://Publicadores/WebServicesClases/crearClaseRequest", output = "http://Publicadores/WebServicesClases/crearClaseResponse", fault = {
        @FaultAction(className = ClaseRepetidaException_Exception.class, value = "http://Publicadores/WebServicesClases/crearClase/Fault/ClaseRepetidaException")
    })
    public void crearClase(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        XMLGregorianCalendar arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        int arg3,
        @WebParam(name = "arg4", partName = "arg4")
        int arg4,
        @WebParam(name = "arg5", partName = "arg5")
        String arg5,
        @WebParam(name = "arg6", partName = "arg6")
        String arg6,
        @WebParam(name = "arg7", partName = "arg7")
        XMLGregorianCalendar arg7,
        @WebParam(name = "arg8", partName = "arg8")
        String arg8,
        @WebParam(name = "arg9", partName = "arg9")
        int arg9,
        @WebParam(name = "arg10", partName = "arg10")
        int arg10,
        @WebParam(name = "arg11", partName = "arg11")
        String arg11,
        @WebParam(name = "arg12", partName = "arg12")
        String arg12,
        @WebParam(name = "arg13", partName = "arg13")
        int arg13)
        throws ClaseRepetidaException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesClases/esProfeDeClaseRequest", output = "http://Publicadores/WebServicesClases/esProfeDeClaseResponse")
    public boolean esProfeDeClase(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns publicadores.WrapperSetString
     * @throws ClaseNoExisteException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesClases/mostrarClasesDeActividadDeportivaRequest", output = "http://Publicadores/WebServicesClases/mostrarClasesDeActividadDeportivaResponse", fault = {
        @FaultAction(className = ClaseNoExisteException_Exception.class, value = "http://Publicadores/WebServicesClases/mostrarClasesDeActividadDeportiva/Fault/ClaseNoExisteException")
    })
    public WrapperSetString mostrarClasesDeActividadDeportiva(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws ClaseNoExisteException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns publicadores.DtClase
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesClases/darDtClaseRequest", output = "http://Publicadores/WebServicesClases/darDtClaseResponse")
    public DtClase darDtClase(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns publicadores.DtPremio
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesClases/sinProposito1Request", output = "http://Publicadores/WebServicesClases/sinProposito1Response")
    public DtPremio sinProposito1();

    /**
     * 
     * @return
     *     returns publicadores.DtClase
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesClases/sinProposito2Request", output = "http://Publicadores/WebServicesClases/sinProposito2Response")
    public DtClase sinProposito2();

}