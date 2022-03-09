package com.boot.web.wapper;

import com.boot.web.service.NameInfo;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="out" type="{http://wapper.web.boot.com}ArrayOfName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "out"
})
@XmlRootElement(name = "getAllNameResponse")
public class GetAllNameResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfName out;

    /**
     * 获取out属性的值。
     *
     * @return
     *     possible object is
     *     {@link ArrayOfName }
     *
     */
    public ArrayOfName getOut() {
        return out;
    }

    /**
     * 设置out属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfName }
     *
     */
    public void setOut(List<NameInfo> value) {
        if(value == null){
            this.out = null;
        }else{
            this.out = new ArrayOfName();
            this.out.names= value;
        }
    }
}
