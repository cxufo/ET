
package com.etwebservice.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "insertImage", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertImage", namespace = "http://service.webservice.etwebservice.com/")
public class InsertImage {

    @XmlElement(name = "arg0", namespace = "")
    private com.etwebservice.domain.FirstPage arg0;

    /**
     * 
     * @return
     *     returns FirstPage
     */
    public com.etwebservice.domain.FirstPage getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.etwebservice.domain.FirstPage arg0) {
        this.arg0 = arg0;
    }

}
