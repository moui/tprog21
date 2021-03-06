
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
import net.java.dev.jaxb.array.StringArray;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServicesADeportivas", targetNamespace = "http://Publicadores/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    net.java.dev.jaxb.array.ObjectFactory.class,
    publicadores.ObjectFactory.class
})
public interface WebServicesADeportivas {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://Publicadores/WebServicesADeportivas/cambiarEstadoRequest", output = "http://Publicadores/WebServicesADeportivas/cambiarEstadoResponse")
    public void cambiarEstado(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        EstadoActi arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/getActividadesCategoriaRequest", output = "http://Publicadores/WebServicesADeportivas/getActividadesCategoriaResponse")
    public StringArray getActividadesCategoria(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns publicadores.DataActividadArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/buscarActividadesRequest", output = "http://Publicadores/WebServicesADeportivas/buscarActividadesResponse")
    public DataActividadArray buscarActividades(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns publicadores.DataActividadArray
     * @throws ActividadDeportivaNoExisteException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/getDataActividadesIngresadasRequest", output = "http://Publicadores/WebServicesADeportivas/getDataActividadesIngresadasResponse", fault = {
        @FaultAction(className = ActividadDeportivaNoExisteException_Exception.class, value = "http://Publicadores/WebServicesADeportivas/getDataActividadesIngresadas/Fault/ActividadDeportivaNoExisteException")
    })
    public DataActividadArray getDataActividadesIngresadas()
        throws ActividadDeportivaNoExisteException_Exception
    ;

    /**
     * 
     * @return
     *     returns publicadores.WrapperSetDtClase
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/getTodasLasClasesRequest", output = "http://Publicadores/WebServicesADeportivas/getTodasLasClasesResponse")
    public WrapperSetDtClase getTodasLasClases();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     * @param arg8
     * @throws ActividadDeportivaRepetidaException_Exception
     */
    @WebMethod
    @Action(input = "http://Publicadores/WebServicesADeportivas/altaActividadDeportivaRequest", output = "http://Publicadores/WebServicesADeportivas/altaActividadDeportivaResponse", fault = {
        @FaultAction(className = ActividadDeportivaRepetidaException_Exception.class, value = "http://Publicadores/WebServicesADeportivas/altaActividadDeportiva/Fault/ActividadDeportivaRepetidaException")
    })
    public void altaActividadDeportiva(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1,
        @WebParam(name = "arg2", partName = "arg2")
        String arg2,
        @WebParam(name = "arg3", partName = "arg3")
        String arg3,
        @WebParam(name = "arg4", partName = "arg4")
        float arg4,
        @WebParam(name = "arg5", partName = "arg5")
        float arg5,
        @WebParam(name = "arg6", partName = "arg6")
        XMLGregorianCalendar arg6,
        @WebParam(name = "arg7", partName = "arg7")
        StringArray arg7,
        @WebParam(name = "arg8", partName = "arg8")
        String arg8)
        throws ActividadDeportivaRepetidaException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns publicadores.DataActividadArray
     * @throws ActividadDeportivaNoExisteException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/getActividadesRequest", output = "http://Publicadores/WebServicesADeportivas/getActividadesResponse", fault = {
        @FaultAction(className = ActividadDeportivaNoExisteException_Exception.class, value = "http://Publicadores/WebServicesADeportivas/getActividades/Fault/ActividadDeportivaNoExisteException")
    })
    public DataActividadArray getActividades(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws ActividadDeportivaNoExisteException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns publicadores.DataActividad
     * @throws ActividadDeportivaNoExisteException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/getDataActividadRequest", output = "http://Publicadores/WebServicesADeportivas/getDataActividadResponse", fault = {
        @FaultAction(className = ActividadDeportivaNoExisteException_Exception.class, value = "http://Publicadores/WebServicesADeportivas/getDataActividad/Fault/ActividadDeportivaNoExisteException")
    })
    public DataActividad getDataActividad(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0)
        throws ActividadDeportivaNoExisteException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/darNombresActividadesDeportivasRequest", output = "http://Publicadores/WebServicesADeportivas/darNombresActividadesDeportivasResponse")
    public StringArray darNombresActividadesDeportivas(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     * @throws ActividadDeportivaNoExisteException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/getActividadesIngresadasRequest", output = "http://Publicadores/WebServicesADeportivas/getActividadesIngresadasResponse", fault = {
        @FaultAction(className = ActividadDeportivaNoExisteException_Exception.class, value = "http://Publicadores/WebServicesADeportivas/getActividadesIngresadas/Fault/ActividadDeportivaNoExisteException")
    })
    public StringArray getActividadesIngresadas()
        throws ActividadDeportivaNoExisteException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns net.java.dev.jaxb.array.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/mostrarClasesVigentesDeActividadDeportivaRequest", output = "http://Publicadores/WebServicesADeportivas/mostrarClasesVigentesDeActividadDeportivaResponse")
    public StringArray mostrarClasesVigentesDeActividadDeportiva(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @return
     *     returns publicadores.DataActividad
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/newDataActividadRequest", output = "http://Publicadores/WebServicesADeportivas/newDataActividadResponse")
    public DataActividad newDataActividad();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     * @throws IOException_Exception
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://Publicadores/WebServicesADeportivas/saveFileRequest", output = "http://Publicadores/WebServicesADeportivas/saveFileResponse", fault = {
        @FaultAction(className = IOException_Exception.class, value = "http://Publicadores/WebServicesADeportivas/saveFile/Fault/IOException")
    })
    public boolean saveFile(
        @WebParam(name = "arg0", partName = "arg0")
        byte[] arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1)
        throws IOException_Exception
    ;

}
