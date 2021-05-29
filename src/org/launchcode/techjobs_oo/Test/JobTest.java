package org.launchcode.techjobs_oo.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.assertEquals;

public class JobTest {

    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    Job test_job6;
    Job test_job7;
    Job test_job8;
    Job test_job9;
    Job test_job10;

    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        test_job4 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        test_job5 = new Job("",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency("")
        );

        test_job6 = new Job("",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        test_job7 = new Job("Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        test_job8 = new Job("Product tester",
                new Employer("ACME"),
                new Location(""),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        test_job9 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType(""),
                new CoreCompetency("Persistence")
        );

        test_job10 = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("")
        );

    }


    @Test
    public void testSettingJobId() {
        assertEquals(1,test_job2.getId() - test_job1.getId(),0.001);
    }

    @Test
    public void testJobConstructorSetAllFields() {
        assertEquals(true,test_job3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertEquals(false,test_job3.equals(test_job4));
    }

    @Test
    public void testToStringEmpty() {
        assertEquals(false,test_job5.toString().startsWith("\n"));
    }

    @Test
    public void testToStringEmpty1() {
        assertEquals(false,test_job5.toString().endsWith("\n"));
    }

    @Test
    public void testToString1() {
        assertEquals(true,test_job6.toString().contains("Data not available"));
    }

    @Test
    public void testToString2() {
        assertEquals(true,test_job7.toString().contains("Data not available"));
    }
    @Test
    public void testToString3() {
        assertEquals(true,test_job8.toString().contains("Data not available"));
    }

    @Test
    public void testToString4() {
        assertEquals(true,test_job9.toString().contains("Data not available"));
    }

    @Test
    public void testToString5() {
        assertEquals(true,test_job10.toString().contains("Data not available"));
    }

    @Test
    public void testToString6() {
        assertEquals("OOPS! This job does not seem to exist.",test_job5.toString());
    }





}