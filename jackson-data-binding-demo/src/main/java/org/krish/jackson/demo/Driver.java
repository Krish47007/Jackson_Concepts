package org.krish.jackson.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;

public class Driver {

    static void jsonToPOJO()
    {
        try
        {
            //Create object mapper
            ObjectMapper mapper = new ObjectMapper();

            //Read JSON file and convert to Java POJO : sample-lite.json
            /*Student student = mapper.readValue(new File(Driver.class.getClassLoader().getResource("sample-lite.json").getFile()),
                                                Student.class);*/
            Student_2 student = mapper.readValue(new File(Driver.class.getClassLoader().getResource("sample-full.json").getFile()),
                    Student_2.class);

            System.out.println("Student Name : "+student.getFirstName()+" "+student.getLastName());
            System.out.println("Address : "+ student.getAddress());
            System.out.println("Languages: "+ Arrays.toString(student.getLanguages()));

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

       jsonToPOJO();
    }
}
