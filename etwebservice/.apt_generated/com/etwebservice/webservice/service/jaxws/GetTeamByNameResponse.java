
package com.etwebservice.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getTeamByNameResponse", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTeamByNameResponse", namespace = "http://service.webservice.etwebservice.com/")
public class GetTeamByNameResponse {

    @XmlElement(name = "return", namespace = "")
    private com.etwebservice.domain.Team _return;

    /**
     * 
     * @return
     *     returns Team
     */
    public com.etwebservice.domain.Team getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.etwebservice.domain.Team _return) {
        this._return = _return;
    }

}
