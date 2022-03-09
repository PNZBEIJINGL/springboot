package com.boot.web.wapper;

import com.boot.web.service.NameInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>ArrayOfName complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ArrayOfName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameInfo" type="{http://wapper.web.boot.com}AcceptReasonInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfName", namespace = "http://service.web.boot.com", propOrder = {
        "names"
})
public class ArrayOfName {

    @XmlElement(name = "Names", nillable = true)
    public List<NameInfo> names;

    public List<NameInfo> getNames() {
        if (names == null) {
            names = new ArrayList<>();
        }
        return names;
    }

    public void setName(List<NameInfo> names) {
        this.names = names;
    }
}
