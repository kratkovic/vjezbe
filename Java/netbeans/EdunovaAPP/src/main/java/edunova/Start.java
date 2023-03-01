/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edunova;

import edunova.controller.ObradaGrupa;
import edunova.controller.ObradaSmjer;
import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Smjer;
import edunova.util.EdunovaException;
import java.math.BigDecimal;




public class Start {

    // za ORM generalno čitati https://github.com/tjakopec/ORM_JAVA_PHP_CSHARP
    public static void main(String[] args) {
       /*
        ObradaSmjer os = new ObradaSmjer();
        
        Smjer smjer = new Smjer();
        smjer.setNaziv("Java programiranje");
        smjer.setCijena(new BigDecimal(10000));
        os.setEntitet(smjer);
        try {
            os.create();
        } catch (EdunovaException e) {
            System.out.println(e.getPoruka());
        }
        */
       
        ObradaGrupa og = new ObradaGrupa();
        
        for(Grupa g : og.read()){
            System.out.println(g.getNaziv());
            System.out.println(g.getPredavac().getIme());
            for(Polaznik p: g.getPolaznici()){
                System.out.println("\t" + p.getIme());
            }
        }
    }
}
