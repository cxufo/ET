
package com.etwebservice.webservice.delegate.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "queryNewsContentByIdResponse", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryNewsContentByIdResponse", namespace = "http://service.webservice.etwebservice.com/")
public class QueryNewsContentByIdResponse {

    @XmlElement(name = "return", namespace = "")
    private com.etwebservice.domain.News _return;

    /**
     * 
     * @return
     *     returns News
     */
    public com.etwebservice.domain.News getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.etwebservice.domain.News _return) {
        this._return = _return;
    }

}
