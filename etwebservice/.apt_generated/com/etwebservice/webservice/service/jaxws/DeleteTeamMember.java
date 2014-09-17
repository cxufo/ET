
package com.etwebservice.webservice.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "deleteTeamMember", namespace = "http://service.webservice.etwebservice.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteTeamMember", namespace = "http://service.webservice.etwebservice.com/")
public class DeleteTeamMember {

    @XmlElement(name = "arg0", namespace = "")
    private com.etwebservice.domain.Team arg0;

    /**
     * 
     * @return
     *     returns Team
     */
    public com.etwebservice.domain.Team getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.etwebservice.domain.Team arg0) {
        this.arg0 = arg0;
    }

}
