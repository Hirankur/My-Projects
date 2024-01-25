public class CustomerAddress {

    private String city;
    private String areaName;
    private String houseNo;

    public CustomerAddress(String city, String areaName, String houseNo) {
        this.city = city;
        this.areaName = areaName;
        this.houseNo = houseNo;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getAreaName() {
        return areaName;
    }

}