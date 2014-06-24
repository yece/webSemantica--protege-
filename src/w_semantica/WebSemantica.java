package w_semantica;



import com.hp.hpl.jena.ontology.*;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import org.openmarkov.core.model.network.ProbNode;

public class WebSemantica {
    
      final public static List<String> rfinal = new ArrayList<>();
      final public static List<String> rpropiedades = new ArrayList<>();
      final public static List<String> rindividuos= new ArrayList<>();
      final public static List<String> rdevol= new ArrayList<>();
      public  List<String>  devolverClases(){
        OntModel areaOntology = ModelFactory.createOntologyModel();
        OntModel personaOntology = ModelFactory.createOntologyModel();
             
        try {
            InputStream file = new FileInputStream("C:/apache-tomcat-7.0.54/webapps/w_semantica/src/w_semantica/e.owl");
            personaOntology.read(file, "");
        } catch (FileNotFoundException ex) {
        }
         
        Iterator<ObjectProperty> propiedades = personaOntology.listObjectProperties();
        Iterator<OntClass> clases = personaOntology.listClasses();
         Iterator<Individual> individuos=personaOntology.listIndividuals();
         Iterator<DatatypeProperty> clases1 = personaOntology.listDatatypeProperties();
        while (individuos.hasNext()) {
            rindividuos.add(individuos.next().getLocalName());
        }
        while (propiedades.hasNext()) {
//            System.out.println(""+ propiedades.next().getLocalName());
            rpropiedades.add(propiedades.next().getLocalName());
        }
        System.out.println("-------------------------------------------");
        while (clases.hasNext()) {
    
            rfinal.add(clases.next().getSubClass().getLocalName());
            
        }
        
      return rfinal;
    }
    public  List<String>  devolverPropiedades(){
        OntModel areaOntology = ModelFactory.createOntologyModel();
        OntModel personaOntology = ModelFactory.createOntologyModel();
             
      // areaOntology.read("http://www.daml.org/2001/10/html/airport-ont");
        try {
            InputStream file = new FileInputStream("C:/apache-tomcat-7.0.54/webapps/w_semantica/src/w_semantica/e.owl");
            personaOntology.read(file, "");
        } catch (FileNotFoundException ex) {
        }
         
        Iterator<ObjectProperty> propiedades = personaOntology.listObjectProperties();
        Iterator<OntClass> clases = personaOntology.listClasses();
         Iterator<Individual> individuos=personaOntology.listIndividuals();
        while (individuos.hasNext()) {
            System.out.println("------"+individuos.next().getLocalName());
        }
        while (propiedades.hasNext()) {
//            System.out.println(""+ propiedades.next().getLocalName());
            rpropiedades.add(propiedades.next().getLocalName());
        }
        System.out.println("-------------------------------------------");
        while (clases.hasNext()) {
    
            rfinal.add(clases.next().getSubClass().getLocalName());
            
        }
        
      return rpropiedades;
    }  
    
    public  List<String>  devolverIndividuos(){
        OntModel areaOntology = ModelFactory.createOntologyModel();
        OntModel personaOntology = ModelFactory.createOntologyModel();
             
      // areaOntology.read("http://www.daml.org/2001/10/html/airport-ont");
        try {
            InputStream file = new FileInputStream("C:/apache-tomcat-7.0.54/webapps/w_semantica/src/w_semantica/e.owl");
            personaOntology.read(file, "");
        } catch (FileNotFoundException ex) {
        }
         
        Iterator<ObjectProperty> propiedades = personaOntology.listObjectProperties();
        Iterator<OntClass> clases = personaOntology.listClasses();
         Iterator<Individual> individuos=personaOntology.listIndividuals();
        while (individuos.hasNext()) {
//            System.out.println("------"+individuos.next().getLocalName());
            rindividuos.add(individuos.next().getLocalName());
        }
        while (propiedades.hasNext()) {
//            System.out.println(""+ propiedades.next().getLocalName());
            rpropiedades.add(propiedades.next().getLocalName());
        }
        System.out.println("-------------------------------------------");
        while (clases.hasNext()) {
    
            rfinal.add(clases.next().getSubClass().getLocalName());
            
        }
        
      return rindividuos;
    }
    
    
    public  List<String>  devolver(){
        OntModel areaOntology = ModelFactory.createOntologyModel();
        
        OntModel unlOntology = ModelFactory.createOntologyModel();
        try {
            InputStream file = new FileInputStream("C:/apache-tomcat-7.0.54/webapps/w_semantica/src/w_semantica/e.owl");
            unlOntology.read(file, "");
        } catch (FileNotFoundException ex) {
        }
         
        Iterator<ObjectProperty> propiedades = unlOntology.listObjectProperties();
        Iterator<OntClass> clases = unlOntology.listClasses();
        Iterator<Individual> individuos=unlOntology.listIndividuals();
        Iterator<DatatypeProperty> clases1 = unlOntology.listDatatypeProperties();
        
         
        while (individuos.hasNext()) {
//            System.out.println("------"+individuos.next().getLocalName());
            rindividuos.add(individuos.next().getLocalName());
        }
        while (propiedades.hasNext()) {
//            System.out.println(""+ propiedades.next().getLocalName());
            rpropiedades.add(propiedades.next().getLocalName());
        }
        System.out.println("-------------------------------------------");
        while (clases1.hasNext()) {
    
            rdevol.add(clases1.next().toString());
            
        }
      return rdevol;
    }
       
//       public void  obtenerDatos(){
//        
//        OntModel areaOntology = ModelFactory.createOntologyModel();
//        OntModel unlOntology = ModelFactory.createOntologyModel();
//       
//       
//      //  areaOntology.read("http://www.daml.org/2001/10/html/airport-ont");
//        try {
//            InputStream file = new FileInputStream("C:/apache-tomcat-7.0.54/webapps/w_semantica/src/w_semantica/e.owl");
//            unlOntology.read(file, "");
//        } catch (FileNotFoundException ex) {
//        }
//         
//        Iterator<DatatypeProperty> propiedades = areaOntology.listDatatypeProperties();
//        Iterator<OntClass> clases = unlOntology.listClasses();
//        while (propiedades.hasNext()) {
//            System.out.println(propiedades.next().getLocalName());
//        }
//        System.out.println("-------------------------------------------");
//        while (clases.hasNext()) {
//          //  rfinal.add(""+clases.next().getLocalName());
//            System.out.println("\nClases y subclases" + clases.next().getLocalName());
//        //    System.out.println("Clases y subclases" + clases.next().getSubClass());
//           
//        }
//     
//    }
       
    public void presentarTabla(JTextArea a1,JTextArea a2,JTextArea a4) throws Exception{
        List<String> rs1=this.devolverClases();
        List<String> rs2=this.devolverPropiedades();
        List<String> rs3=this.devolverIndividuos();
        List<String> rs4=this.devolver();
       String clases ="";
       for(int i= 0; i<rs1.size();i++){
           clases=clases+rs1.get(i)+"\n";
       }
       String prop ="";
       for(int i= 0; i<rs2.size();i++){
           prop=prop+rs2.get(i)+"\n";
       }
       String ind ="";
       for(int i= 0; i<rs3.size();i++){
           ind=ind+rs3.get(i)+"\n";
       }
       String dev ="";
       for(int i= 0; i<rs4.size();i++){
           dev=dev+rs4.get(i)+"\n";
       }
//       a3.setText(dev);
       a2.setText(prop);
       a1.setText(ind);
       a4.setText(clases);
        
        rfinal.clear();
        rpropiedades.clear();
        rindividuos.clear();
        rdevol.clear();
    }
       public static void main (String args[]){
          WebSemantica a = new WebSemantica();
//          a.obtenerDatos();
//           System.out.println("///////////////////////////////////////////////////////////////");
           a.devolverClases();
           System.out.println(a.devolver());
           System.out.println("-----------------------"+a.devolverClases());
           for(int o=0; o<=rfinal.size()-1;o++){
               if(!rfinal.get(o).equals(null)){
                   System.out.println(rfinal.get(o));
               }
           }
           System.out.println(rpropiedades);
       }
}
