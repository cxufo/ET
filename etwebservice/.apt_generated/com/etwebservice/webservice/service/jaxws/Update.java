
package com.etwebservice.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "update", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update", namespace = "http://service.webservice.etwebservice.com/")
public class Update {

    @XmlElement(name = "arg0", namespace = "")
    private com.etwebservice.domain.Contact arg0;

    /**
     * 
     * @return
     *     returns Contact
     */
    public com.etwebservice.domain.Contact getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.etwebservice.domain.Contact arg0) {
        this.arg0 = arg0;
    }

}
