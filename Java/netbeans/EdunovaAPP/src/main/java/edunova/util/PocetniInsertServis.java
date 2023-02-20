/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Servis;
import org.hibernate.Session;

public class PocetniInsertServis {

    public static void izvedi() {
        Session session = HibernateUtil.getSession();
        Faker faker = new Faker();

        Servis s;
        session.beginTransaction();
        for(int i =0; i<100;i++){
            s = new Servis();
            s.setNaziv(faker.name().name());
            s.setMjesto(faker.name().firstName());
            s.setRadnovrijeme(faker.name().fullName());
                        
            session.persist(s);
        }
        session.getTransaction().commit();
    }

}
