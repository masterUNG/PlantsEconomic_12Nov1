package srongklod_bangtamruat.plantseconomic.utility;

/**
 * Created by masterung on 27/12/2017 AD.
 */

public class SupplierModel {

    private String uidSupplierString, companyString, addressString,
            faxString, telephoneString, bussinessString, headQuartersString;

    public SupplierModel() {
    }

    public SupplierModel(String uidSupplierString,
                         String companyString,
                         String addressString,
                         String faxString,
                         String telephoneString,
                         String bussinessString,
                         String headQuartersString) {
        this.uidSupplierString = uidSupplierString;
        this.companyString = companyString;
        this.addressString = addressString;
        this.faxString = faxString;
        this.telephoneString = telephoneString;
        this.bussinessString = bussinessString;
        this.headQuartersString = headQuartersString;
    }

    public String getUidSupplierString() {
        return uidSupplierString;
    }

    public void setUidSupplierString(String uidSupplierString) {
        this.uidSupplierString = uidSupplierString;
    }

    public String getCompanyString() {
        return companyString;
    }

    public void setCompanyString(String companyString) {
        this.companyString = companyString;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

    public String getFaxString() {
        return faxString;
    }

    public void setFaxString(String faxString) {
        this.faxString = faxString;
    }

    public String getTelephoneString() {
        return telephoneString;
    }

    public void setTelephoneString(String telephoneString) {
        this.telephoneString = telephoneString;
    }

    public String getBussinessString() {
        return bussinessString;
    }

    public void setBussinessString(String bussinessString) {
        this.bussinessString = bussinessString;
    }

    public String getHeadQuartersString() {
        return headQuartersString;
    }

    public void setHeadQuartersString(String headQuartersString) {
        this.headQuartersString = headQuartersString;
    }
}   // Main Class
