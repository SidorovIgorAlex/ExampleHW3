package JsonExampleHW;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("hw3.json");
        ObjectMapper objectMapper = new ObjectMapper();

//        Company company = new Company();
//
//        String s = objectMapper.writeValueAsString(company);
//
        Companies companies = objectMapper.readValue(file, Companies.class);

//        Company[] companies1 = companies.getCompanies();
//        Securities[] securities = companies1[1].getSecurities();
//
//        for (Company company : companies.getCompanies()) {
//            System.out.println(company);
//        }
    }
}
