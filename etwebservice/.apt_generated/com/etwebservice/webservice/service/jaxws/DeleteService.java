
package com.etwebservice.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "deleteService", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteService", namespace = "http://service.webservice.etwebservice.com/")
public class DeleteService {

    @XmlElement(name = "arg0", namespace = "")
    private com.etwebservice.domain.Service arg0;

    /**
     * 
     * @return
     *     returns Service
     */
    public com.etwebservice.domain.Service getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.etwebservice.domain.Service arg0) {
        this.arg0 = arg0;
    }

}
