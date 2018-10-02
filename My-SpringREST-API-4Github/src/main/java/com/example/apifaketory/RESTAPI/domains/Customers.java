package com.example.apifaketory.RESTAPI.domains;

import java.util.HashMap;
import java.util.Map;

public class Customers {

private String firstname;
private String lastname;
private String customerUrl;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getFirstname() {
return firstname;
}

public void setFirstname(String firstname) {
this.firstname = firstname;
}

public String getLastname() {
return lastname;
}

public void setLastname(String lastname) {
this.lastname = lastname;
}

public String getCustomerUrl() {
return customerUrl;
}

public void setCustomerUrl(String customerUrl) {
this.customerUrl = customerUrl;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}