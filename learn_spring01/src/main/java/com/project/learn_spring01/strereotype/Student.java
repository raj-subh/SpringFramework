package com.project.learn_spring01.strereotype;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
// import jakarta.annotation.Resource;

@Component("studentObj")
@Scope("singleton")
public class Student {
    @Value("Raj Subhash")
    private String studentName;

    @Value("Mullana, Ambala")
    private String city;

    // 1. Solution
    @Value("#{listCollection}") // SpEL

    // 2. Solution
    // @Autowired
    // @Qualifier("listCollection")

    // 3. Solution
    // @Resource(name = "listCollection")
    private List<String> address;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public List<String> getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", city=" + city + "]";
    }
}
