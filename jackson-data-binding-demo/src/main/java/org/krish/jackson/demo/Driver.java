package org.krish.jackson.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    static void jsonToPOJO()
    {
        try
        {
            //Create object mapper
            ObjectMapper mapper = new ObjectMapper();

            //Read JSON file and convert to Java POJO : sample-lite.json
            Student student = mapper.readValue(new File(Driver.class.getClassLoader().getResource("sample-lite.json").getFile()),
                                                Student.class);

            System.out.println(student);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

       jsonToPOJO();
    }
}
