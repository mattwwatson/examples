import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import emfexample.Applicant;
import emfexample.City;
import emfexample.EmfexampleFactory;
import emfexample.EmfexamplePackage;
import emfexample.Position;
import emfexample.Supervisor;



public class CreateSimpleModel {
    
    public static void main(String[] args) throws IOException {

        City sydney = EmfexampleFactory.eINSTANCE.createCity();
        sydney.setName("Sydney");
        
        City melbourne = EmfexampleFactory.eINSTANCE.createCity();
        melbourne.setName("Melbourne");
        
        Supervisor phil = EmfexampleFactory.eINSTANCE.createSupervisor();
        phil.setName("Phil");
        phil.setEmail("employee@db.com");
        phil.setLivesIn(sydney);
        
        Supervisor bob = EmfexampleFactory.eINSTANCE.createSupervisor();
        bob.setName("Bob Roberts");
        bob.setEmail("hotsausages@gmail.com");
        bob.setLivesIn(melbourne);
        
        Position hotDogs = EmfexampleFactory.eINSTANCE.createPosition();
        hotDogs.setLocation(melbourne);
        hotDogs.setManagedBy(bob);
        hotDogs.setPay(24900.00);
        hotDogs.setTitle("Hot Dog Sales Representative");
        
        Position javaGuru = EmfexampleFactory.eINSTANCE.createPosition();
        javaGuru.setLocation(sydney);
        javaGuru.setManagedBy(phil);
        javaGuru.setPay(111111.11);
        javaGuru.setTitle("Java Guru Extraordinaire");
        
        Applicant kelson = EmfexampleFactory.eINSTANCE.createApplicant();
        kelson.setName("Kelson");
        kelson.setEmail("kelson@ho.com");
        kelson.setLivesIn(sydney);
        kelson.getApplyingFor().add(javaGuru);
        kelson.getApplyingFor().add(hotDogs);
        
        ResourceSet resourceSet = createExampleResourceSet();
        
        Resource cities = resourceSet.createResource(URI.createFileURI("cities.xmi"));
        cities.getContents().add(sydney);
        cities.getContents().add(melbourne);
        
        Resource people = resourceSet.createResource(URI.createFileURI("people.xmi"));
        people.getContents().add(phil);
        people.getContents().add(bob);
        people.getContents().add(kelson);

        Resource jobs = resourceSet.createResource(URI.createFileURI("jobs.xmi"));
        jobs.getContents().add(hotDogs);
        jobs.getContents().add(javaGuru);
        
        Map<String,Object> options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_LINE_WIDTH, 100);
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
        options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

        cities.save(options);
        people.save(options);
        jobs.save(options);
    }

    static ResourceSet createExampleResourceSet() {
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getPackageRegistry().put(EmfexamplePackage.eINSTANCE.getNsURI(), EmfexamplePackage.eINSTANCE);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
        return resourceSet;
    }
    
}
