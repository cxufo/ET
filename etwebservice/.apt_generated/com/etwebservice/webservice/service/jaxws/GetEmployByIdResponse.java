
package com.etwebservice.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getEmployByIdResponse", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployByIdResponse", namespace = "http://service.webservice.etwebservice.com/")
public class GetEmployByIdResponse {

    @XmlElement(name = "return", namespace = "")
    private com.etwebservice.domain.Employ _return;

    /**
     * 
     * @return
     *     returns Employ
     */
    public com.etwebservice.domain.Employ getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.etwebservice.domain.Employ _return) {
        this._return = _return;
    }

}
