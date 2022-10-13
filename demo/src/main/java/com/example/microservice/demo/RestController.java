package com.example.microservice.demo;

import jdk.jfr.Frequency;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private static List<Person> personList=new ArrayList<>();
    static {
        Person person=new Person();
        person.setPid(1);
        person.setName("Omkar Ghotekar");
        person.setPhone("9604662462");
        personList.add(person);
    }

    @RequestMapping("/greet")
    public String greet(){
        return "My name is Omkar Ghotekar. This is my first REST API";
    }

    @RequestMapping(value = "/rest", method = RequestMethod.GET)
    public List<Person> getPersons(){
        return personList;
    }


    @RequestMapping(value="/rest", method = RequestMethod.POST)
    public Person savePerson(@RequestBody Person person){
        personList.add(person);
        return person;
    }


    @RequestMapping(value = "/rest", method= RequestMethod.PUT)
    public Person updatePerson(@RequestBody Person person){
        Person tempPerson=new Person();

        for(Person p:personList){
            if(p.getPid()==person.getPid()){
                tempPerson.setName(person.getName());
                tempPerson.setPid(person.getPid());
                tempPerson.setPhone(person.getPhone());

            }
        }

        personList.add(tempPerson);
        return tempPerson;
    }

    @RequestMapping(value ="/rest", method = RequestMethod.DELETE)
    public Person deletePerson(@RequestBody Person person){


        for(Person p: personList){
            if(p.getPid()==person.getPid()){
                personList.remove(person);
            }
        }
        return person;
    }
}
