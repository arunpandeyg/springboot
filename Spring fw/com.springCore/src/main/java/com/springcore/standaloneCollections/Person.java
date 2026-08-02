package com.springcore.standaloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friend;
    private Map<String, Integer> feeStructure;
    private Properties properties;

    public Map<String, Integer> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, Integer> feeStructure) {
        this.feeStructure = feeStructure;
    }

    public List<String> getFriend() {
        return friend;
    }

    public void setFriend(List<String> friend) {
        this.friend = friend;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friend=" + friend +
                ", feeStructure=" + feeStructure +
                ", properties=" + properties +
                '}';
    }
}
