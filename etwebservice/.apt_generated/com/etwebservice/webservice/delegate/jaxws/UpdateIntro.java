
package com.etwebservice.webservice.delegate.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateIntro", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateIntro", namespace = "http://service.webservice.etwebservice.com/")
public class UpdateIntro {

    @XmlElement(name = "arg0", namespace = "")
    private com.etwebservice.domain.Introduction arg0;

    /**
     * 
     * @return
     *     returns Introduction
     */
    public com.etwebservice.domain.Introduction getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.etwebservice.domain.Introduction arg0) {
        this.arg0 = arg0;
    }

}
