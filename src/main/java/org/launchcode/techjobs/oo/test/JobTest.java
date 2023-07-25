package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {



        @Test
        public void testSettingJobId() {
                Employer employer1 = new Employer("launchcode");
                Location location1 = new Location("developer");
                PositionType positionType1 = new PositionType("developer");
                CoreCompetency coreCompetency1 = new CoreCompetency("coding");
                Job job1 = new Job("job1", employer1, location1, positionType1, coreCompetency1);
                Job job2 = new Job("job2", employer1, location1, positionType1, coreCompetency1);
                Job job3 = new Job("job3", employer1, location1, positionType1, coreCompetency1);
                Job job4 = new Job("job4", employer1, location1, positionType1, coreCompetency1);
                Job job5 = new Job("job5", employer1, location1, positionType1, coreCompetency1);

                assertNotEquals(job1.getId(), job2.getId());
        }


        @Test
        public void testJobConstructorSetsAllFields() {
                Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
                assertEquals("Product tester", newJob.getName());
                assertEquals("ACME", newJob.getEmployer().getValue());
                assertEquals("Desert", newJob.getLocation().getValue());
                assertEquals("Quality Control", newJob.getPositionType().getValue());
                assertEquals("Persistence", newJob.getCoreCompetency().getValue());


                assertTrue(newJob.getName() instanceof String);
                assertTrue(newJob.getEmployer() instanceof Employer);
                assertTrue(newJob.getLocation() instanceof Location);
                assertTrue(newJob.getPositionType() instanceof PositionType);
                assertTrue(newJob.getCoreCompetency() instanceof CoreCompetency);
        }

        @Test
        public void testJobForEquality() {
                Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
                Job newJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
                assertEquals(false, newJob.equals(newJob2));
        }

        @Test
        public void testToStringStartsAndEndsWithNewLine() {
                Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
                String expectedOutput = "\n" +
                        "ID: " + newJob.getId() + "\n" +
                        "Name: " + "Product tester" + "\n" +
                        "Employer: " + "ACME" + "\n" +
                        "Location: " + "Desert" + "\n" +
                        "Position Type: " + "Quality Control" + "\n" +
                        "Core Competency: " + "Persistence" + "\n";

                assertEquals(expectedOutput, newJob.toString());
        }

        @Test
        public void testToStringContainsCorrectLabelsAndData() {
                Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
                String expectedOutput = "\n" +
                        "ID: " + newJob.getId() + "\n" +
                        "Name: " + "Product tester" + "\n" +
                        "Employer: " + "ACME" + "\n" +
                        "Location: " + "Desert" + "\n" +
                        "Position Type: " + "Quality Control" + "\n" +
                        "Core Competency: " + "Persistence" + "\n";

                String actualOutput = newJob.toString();

                assertTrue(actualOutput.contains("ID: " + newJob.getId()));
                assertTrue(actualOutput.contains("Name: Product tester"));
                assertTrue(actualOutput.contains("Employer: ACME"));
                assertTrue(actualOutput.contains("Location: Desert"));
                assertTrue(actualOutput.contains("Position Type: Quality Control"));
                assertTrue(actualOutput.contains("Core Competency: Persistence"));
        }



        @Test
        public void testToStringHandlesEmptyField(){
                Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
                String expectedOutput = "\n" +
                        "ID: " + newJob.getId() + "\n" +
                        "Name: " + (newJob.getName() != null && !newJob.getName().isEmpty() ? newJob.getName() : "Data not available") + "\n" +
                        "Employer: " + (newJob.getEmployer() != null && !newJob.getEmployer().toString().isEmpty() ? newJob.getEmployer() : "Data not available") + "\n" +
                        "Location: " + (newJob.getLocation() != null && !newJob.getLocation().toString().isEmpty() ? newJob.getLocation() : "Data not available") + "\n" +
                        "Position Type: " + (newJob.getPositionType() != null && !newJob.getPositionType().toString().isEmpty() ? newJob.getPositionType() : "Data not available") + "\n" +
                        "Core Competency: " + (newJob.getCoreCompetency() != null && !newJob.getCoreCompetency().toString().isEmpty() ? newJob.getCoreCompetency() : "Data not available") + "\n";
                assertEquals(expectedOutput, newJob.toString());
        }

}





