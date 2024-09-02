package model;

import java.security.cert.X509Certificate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@AllArgsConstructor
public class Certificate {
	private Subject subject;
    private Issuer issuer;
    private String serialNumber;
    private Date startDate;
    private Date endDate;
    private X509Certificate x509Certificate;
	
   

}
