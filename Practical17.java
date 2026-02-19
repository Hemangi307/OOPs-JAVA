class Practical17{
      static int TotalStudents;
      static String UniversityName;

static {
     UniversityName = "Saffrony Institute of Technology";
     TotalStudents = 0;
     System.out.println("Static block is executed and University initialized");
}

{ System.out.println("Instance block is executed");
}

Practical17() {
     TotalStudents++;
     System.out.println("Constructor block is executed");
     }

static int getTotalStudents() {
    return TotalStudents;
}

public static void main(String [] args){
        System.out.println("Main method started");
        System.out.println("University Name: " + UniversityName);
  
        Practical17 S1 = new Practical17();
        Practical17 S2= new Practical17();
        Practical17 S3= new Practical17();

        System.out.println("Total Students: "+ getTotalStudents());
}
}
 



















































    