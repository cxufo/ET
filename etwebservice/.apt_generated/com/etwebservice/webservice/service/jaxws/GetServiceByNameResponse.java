
package com.etwebservice.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getServiceByNameResponse", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceByNameResponse", namespace = "http://service.webservice.etwebservice.com/")
public class GetServiceByNameResponse {

    @XmlElement(name = "return", namespace = "")
    private com.etwebservice.domain.Service _return;

    /**
     * 
     * @return
     *     returns Service
     */
    public com.etwebservice.domain.Service getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.etwebservice.domain.Service _return) {
        this._return = _return;
    }

}
