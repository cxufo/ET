
package com.etwebservice.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "deleteEmploy", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteEmploy", namespace = "http://service.webservice.etwebservice.com/")
public class DeleteEmploy {

    @XmlElement(name = "arg0", namespace = "")
    private com.etwebservice.domain.Employ arg0;

    /**
     * 
     * @return
     *     returns Employ
     */
    public com.etwebservice.domain.Employ getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.etwebservice.domain.Employ arg0) {
        this.arg0 = arg0;
    }

}
