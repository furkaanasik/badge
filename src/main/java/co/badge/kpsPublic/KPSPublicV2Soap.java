
package co.badge.kpsPublic;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "KPSPublicV2Soap", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface KPSPublicV2Soap {


    /**
     * 
     * @param cuzdanNo
     * @param dogumAyYok
     * @param ad
     * @param dogumGun
     * @param tckkSeriNo
     * @param cuzdanSeri
     * @param tcKimlikNo
     * @param dogumAy
     * @param soyad
     * @param dogumYil
     * @param dogumGunYok
     * @param soyadYok
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "KisiVeCuzdanDogrula", action = "http://tckimlik.nvi.gov.tr/WS/KisiVeCuzdanDogrula")
    @WebResult(name = "KisiVeCuzdanDogrulaResult", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
    @RequestWrapper(localName = "KisiVeCuzdanDogrula", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", className = "co.badge.kpsPublic.KisiVeCuzdanDogrula")
    @ResponseWrapper(localName = "KisiVeCuzdanDogrulaResponse", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", className = "co.badge.kpsPublic.KisiVeCuzdanDogrulaResponse")
    public boolean kisiVeCuzdanDogrula(
        @WebParam(name = "TCKimlikNo", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        long tcKimlikNo,
        @WebParam(name = "Ad", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        String ad,
        @WebParam(name = "Soyad", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        String soyad,
        @WebParam(name = "SoyadYok", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        boolean soyadYok,
        @WebParam(name = "DogumGun", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        Integer dogumGun,
        @WebParam(name = "DogumGunYok", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        boolean dogumGunYok,
        @WebParam(name = "DogumAy", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        Integer dogumAy,
        @WebParam(name = "DogumAyYok", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        boolean dogumAyYok,
        @WebParam(name = "DogumYil", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        int dogumYil,
        @WebParam(name = "CuzdanSeri", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        String cuzdanSeri,
        @WebParam(name = "CuzdanNo", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        Integer cuzdanNo,
        @WebParam(name = "TCKKSeriNo", targetNamespace = "http://tckimlik.nvi.gov.tr/WS")
        String tckkSeriNo);

}
