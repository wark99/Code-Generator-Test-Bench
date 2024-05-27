package gen;

// LicenseCheckRequestBody.java

import com.fasterxml.jackson.annotation.JsonProperty;

public class LicenseCheckRequestBody {
    private String key;
    private String address;
    private int devices;
    private int process;

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("devices")
    public int getDevices() {
        return devices;
    }

    public void setDevices(int devices) {
        this.devices = devices;
    }

    @JsonProperty("process")
    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }
}

