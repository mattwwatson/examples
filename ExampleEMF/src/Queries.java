import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import emfexample.Applicant;
import emfexample.City;
import emfexample.Person;
import emfexample.Position;
import emfexample.Supervisor;



public class Queries {
    
    public static void listPeopleByCity() throws IOException {
        ResourceSet resourceSet = CreateSimpleModel.createExampleResourceSet();
        
        Resource cities = resourceSet.getResource(URI.createFileURI(new File("cities.xmi").getAbsolutePath()), true);
        for (EObject obj : cities.getContents())
        {
            City city = (City)obj;
            System.err.println(city.getName() + " has people:");
            EList<Person> people = city.getPeople();
            for (Person p : people)
            {
                System.err.println("    " + p.getName() + "<" + p.getEmail() + ">");
            }
        }
    }
    
    public static void listJobs() throws IOException {
        ResourceSet resourceSet = CreateSimpleModel.createExampleResourceSet();
        
        Resource jobs = resourceSet.getResource(URI.createFileURI("jobs.xmi"), true);
        for (EObject obj : jobs.getContents())
        {
            Position job = (Position)obj;
            System.err.println(job.getTitle() + " in " + job.getLocation().getName() + " for $" + job.getPay() + " managed by: " + job.getManagedBy().getName());
        }
    }
    
    public static void listPeople() throws IOException {
        ResourceSet resourceSet = CreateSimpleModel.createExampleResourceSet();
        
        Resource people = resourceSet.getResource(URI.createFileURI("people.xmi"), true);
        
        for (EObject obj : people.getContents())
        {
            Person person = (Person)obj;
            printPerson(person);
        }
    }

    public static void listKelson() throws IOException {
        ResourceSet resourceSet = CreateSimpleModel.createExampleResourceSet();
        
        Person kelson = (Person) resourceSet.getEObject(URI.createFileURI("people.xmi").appendFragment("kelson@ho.com"), true);
        
//        Resource people = resourceSet.getResource(URI.createFileURI(new File("people.xmi").getAbsolutePath()), true);
//        Person kelson = (Person) people.getEObject("kelson@ho.com");
        printPerson(kelson);
    }

    private static void printPerson(Person person) {
        System.err.println(person.getName() + "<" + person.getEmail() + ">" + " in " + person.getLivesIn().getName());
        if (person instanceof Applicant)
        {
            System.err.println("    is going for jobs:");
            for (Position p : ((Applicant)person).getApplyingFor())
            {
                System.err.println("        " + p.getTitle());                    
            }
        }
        if (person instanceof Supervisor)
        {
            System.err.println("    manages:");
            for (Position p : ((Supervisor)person).getManages())
            {
                System.err.println("        " + p.getTitle());                    
            }
        }
    }

    
    public static void main(String[] args) throws IOException {
        System.err.println();
        System.err.println("People by City");
        listPeopleByCity();
        System.err.println();
        System.err.println("People");
        listPeople();
        System.err.println();
        System.err.println("Jobs");
        listJobs();
        System.err.println();
        System.err.println("Kelson");
        listKelson();
    }
    
}
