
package co.badge.kpsPublic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoyadYok" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DogumGun" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DogumGunYok" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DogumAy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DogumAyYok" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DogumYil" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CuzdanSeri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CuzdanNo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TCKKSeriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tcKimlikNo",
    "ad",
    "soyad",
    "soyadYok",
    "dogumGun",
    "dogumGunYok",
    "dogumAy",
    "dogumAyYok",
    "dogumYil",
    "cuzdanSeri",
    "cuzdanNo",
    "tckkSeriNo"
})
@XmlRootElement(name = "KisiVeCuzdanDogrula")
public class KisiVeCuzdanDogrula {

    @XmlElement(name = "TCKimlikNo")
    protected long tcKimlikNo;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "Soyad")
    protected String soyad;
    @XmlElement(name = "SoyadYok")
    protected boolean soyadYok;
    @XmlElement(name = "DogumGun", required = true, type = Integer.class, nillable = true)
    protected Integer dogumGun;
    @XmlElement(name = "DogumGunYok")
    protected boolean dogumGunYok;
    @XmlElement(name = "DogumAy", required = true, type = Integer.class, nillable = true)
    protected Integer dogumAy;
    @XmlElement(name = "DogumAyYok")
    protected boolean dogumAyYok;
    @XmlElement(name = "DogumYil")
    protected int dogumYil;
    @XmlElement(name = "CuzdanSeri")
    protected String cuzdanSeri;
    @XmlElement(name = "CuzdanNo", required = true, type = Integer.class, nillable = true)
    protected Integer cuzdanNo;
    @XmlElement(name = "TCKKSeriNo")
    protected String tckkSeriNo;

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     */
    public long getTCKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     */
    public void setTCKimlikNo(long value) {
        this.tcKimlikNo = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAd(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyad(String value) {
        this.soyad = value;
    }

    /**
     * Gets the value of the soyadYok property.
     * 
     */
    public boolean isSoyadYok() {
        return soyadYok;
    }

    /**
     * Sets the value of the soyadYok property.
     * 
     */
    public void setSoyadYok(boolean value) {
        this.soyadYok = value;
    }

    /**
     * Gets the value of the dogumGun property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDogumGun() {
        return dogumGun;
    }

    /**
     * Sets the value of the dogumGun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDogumGun(Integer value) {
        this.dogumGun = value;
    }

    /**
     * Gets the value of the dogumGunYok property.
     * 
     */
    public boolean isDogumGunYok() {
        return dogumGunYok;
    }

    /**
     * Sets the value of the dogumGunYok property.
     * 
     */
    public void setDogumGunYok(boolean value) {
        this.dogumGunYok = value;
    }

    /**
     * Gets the value of the dogumAy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDogumAy() {
        return dogumAy;
    }

    /**
     * Sets the value of the dogumAy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDogumAy(Integer value) {
        this.dogumAy = value;
    }

    /**
     * Gets the value of the dogumAyYok property.
     * 
     */
    public boolean isDogumAyYok() {
        return dogumAyYok;
    }

    /**
     * Sets the value of the dogumAyYok property.
     * 
     */
    public void setDogumAyYok(boolean value) {
        this.dogumAyYok = value;
    }

    /**
     * Gets the value of the dogumYil property.
     * 
     */
    public int getDogumYil() {
        return dogumYil;
    }

    /**
     * Sets the value of the dogumYil property.
     * 
     */
    public void setDogumYil(int value) {
        this.dogumYil = value;
    }

    /**
     * Gets the value of the cuzdanSeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuzdanSeri() {
        return cuzdanSeri;
    }

    /**
     * Sets the value of the cuzdanSeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuzdanSeri(String value) {
        this.cuzdanSeri = value;
    }

    /**
     * Gets the value of the cuzdanNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCuzdanNo() {
        return cuzdanNo;
    }

    /**
     * Sets the value of the cuzdanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCuzdanNo(Integer value) {
        this.cuzdanNo = value;
    }

    /**
     * Gets the value of the tckkSeriNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCKKSeriNo() {
        return tckkSeriNo;
    }

    /**
     * Sets the value of the tckkSeriNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCKKSeriNo(String value) {
        this.tckkSeriNo = value;
    }

}
