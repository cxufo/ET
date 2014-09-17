
package com.etwebservice.webservice.delegate.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "insertNews", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertNews", namespace = "http://service.webservice.etwebservice.com/")
public class InsertNews {

    @XmlElement(name = "arg0", namespace = "")
    private com.etwebservice.domain.News arg0;

    /**
     * 
     * @return
     *     returns News
     */
    public com.etwebservice.domain.News getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.etwebservice.domain.News arg0) {
        this.arg0 = arg0;
    }

}
