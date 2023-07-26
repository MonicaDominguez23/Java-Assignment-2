package org.launchcode.techjobs.oo;

import java.util.Objects;

   public class Job {
        private String name;
        private Employer employer;
        private Location location;
        private PositionType positionType;
        private CoreCompetency coreCompetency;
        private int id;
        private static int nextId = 1;
        private String value;
        public Job() {
            id = nextId;
            nextId++;
        }

        public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
            this();
            this.name = name;
            this.employer = employer;
            this.location = location;
            this.positionType = positionType;
            this.coreCompetency = coreCompetency;

    }

       public String toString() {
           return "\n" +
                   "ID: " + getId() + "\n" +
                   "Name: " + (getName().isEmpty() ? "Data not available" : getName()) + "\n" +
                   "Employer: " + (getEmployer().getValue().isEmpty() ? "Data not available" : getEmployer().getValue()) + "\n" +
                   "Location: " + (getLocation().getValue().isEmpty() ? "Data not available" : getLocation().getValue()) + "\n" +
                   "Position Type: " + (getPositionType().getValue().isEmpty() ? "Data not available" : getPositionType().getValue()) + "\n" +
                   "Core Competency: " + (getCoreCompetency().getValue().isEmpty() ? "Data not available" : getCoreCompetency().getValue()) + "\n";
       }


       @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Job job = (Job) o;
            return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency) && Objects.equals(value, job.value);
        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(name, employer, location, positionType, coreCompetency, value);
//        }
@Override
public int hashCode() {
    int result = 17;
    result = 31 * result + getId();
    result = 31 * result + getName().hashCode();
    result = 31 * result + getEmployer().getValue().hashCode();
    result = 31 * result + getLocation().getValue().hashCode();
    result = 31 * result + getPositionType().getValue().hashCode();
    result = 31 * result + getCoreCompetency().getValue().hashCode();
    return result;
}
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employer getEmployer() {
            return employer;
        }

        public void setEmployer(Employer employer) {
            this.employer = employer;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public PositionType getPositionType() {
            return positionType;
        }

        public void setPositionType(PositionType positionType) {
            this.positionType = positionType;
        }

        public CoreCompetency getCoreCompetency() {
            return coreCompetency;
        }

        public void setCoreCompetency(CoreCompetency coreCompetency) {
            this.coreCompetency = coreCompetency;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getId() {
            return id;
        }

//        public String toString() {
//            return "\n" +
//                    "ID: " + getId() + "\n" +
//                    "Name: " + getName() + "\n" +
//                    "Employer: " + getEmployer() + "\n" +
//                    "Location: " + getLocation() + "\n" +
//                    "Position Type: " + getPositionType() + "\n" +
//                    "Core Competency: " + getCoreCompetency() + "\n";
//        }

//        public String dataAvailable(Object data) {
//            return data != null ? data.toString() : "Data not available";
//        }

    }
//
//
//         TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
//      other five fields. The second constructor should also call the first in order to initialize
//      the 'id' field.
//
//     TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
//      match.
//
//     TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
//      and id.
