package com.project.learn_spring.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String, Integer> feeDetails;
    private Properties properties;

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getFriends() {
        return friends;
    }

    public Map<String, Integer> getFeeDetails() {
        return feeDetails;
    }

    public void setFeeDetails(Map<String, Integer> feeDetails) {
        this.feeDetails = feeDetails;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return "Person [friends=" + friends + ", feeDetails=" + feeDetails + ", properties=" + properties + "]";
    }

}
