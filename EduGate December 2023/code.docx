

package com.mycompany.universitymanagmentsystem;
import java.util.Scanner;
//project edit 1 with exception handling
class Person{
    private String name;
    private int national_id;
    private String nationality;
    private String adress;
    
    public void setname(String n)
    {
        this.name = n;
    }
    public void setnationalid( int i)
    {
        this.national_id = i;
    }
    public void setnationality( String n1)
    {
        this.nationality = n1;
    }
    public void setadress( String a)
    {
        this.adress = a;
    }
    public String getname()
    {
        return this.name;
    }
    public int getnational_id()
    {
        return national_id;
    }
    public String getnationality()
    {
        return nationality;
    }
    public String getadress()
    {
        return adress;
    }
    public void display()
    {
        System.out.println("Name: " + getname());
        System.out.println("Nationality ID: " + getnational_id());
        System.out.println("Nationality : " + getnationality());
        System.out.println("Adress: " + getadress());
    }
}

class Dr extends Person{
    
     private int work_hours;
     private String courses;
     private float salary;
     private int dr_id ;
     private String lecture1,lecture2 ,lecture3,lecture4,lecture5;
     private String hall1,hall2,hall3,hall4,hall5;
     
     public void setwork_hour(int a)
     {
         this.work_hours = a;
     }
     public void setcourses(String n )
     {
         this.courses = n;
     }
     public void setsalary( float s1)
     {
         this.salary = s1;
     }
     public void setdr_id( int i)
     {
         this.dr_id = i;
     }
     public int getwork_hour()
     {
         return this.work_hours;
     }
     public String getcourses()
     {
         return courses;
     }
     public float getsalary()
     {
         return this.salary;
     }
     public int getdr_id()
     {
         return this.dr_id;
     }
     @Override
     public void display()
     {
         super.display();
         System.out.println("Work Hour: " + "(" +getwork_hour()+")" + " hours");
         System.out.println("Courses: " + getcourses());
         System.out.println("Salary: " + getsalary() + " $");
         System.out.println("Dr Id : " + getdr_id());
     }
     public void set_Lectures_Schedule(String l1, String l2 , String l3, String l4 , String l5)
     {
         this.lecture1 = l1;
         this.lecture2 = l2;
         this.lecture3 = l3;
         this.lecture4 = l4;
         this.lecture5 = l5;
     }
     public void sethall(String h1,String h2,String h3,String h4,String h5)
     {
         this.hall1 = h1;
         this.hall2 = h2;
         this.hall3 = h3;
         this.hall4 = h4;
         this.hall5 = h5;
     }
     public void printSchedule()
     {
         System.out.println("Lectures_Schedule : ");
         System.out.println();
         System.out.println("Divsion" +"      "+ "Time"  +"        "+ "The hall");
         System.out.println("Division 1: " + "("+lecture1+")"+"   "+ hall1);
         System.out.println("Division 2: " + "("+lecture2+")"+"  "+ hall2);
         System.out.println("Division 3: " + "("+lecture3+")"+" "+ hall3);
         System.out.println("Division 4: " + "("+lecture4+")"+"  "+ hall4);
         System.out.println("Division 5: " + "("+lecture5+")"+"   "+ hall5);
     }
         
}
class Staff extends Person{
    private String building;
    private float work_hours;
    private float salary_emp;
    private int emp_id;
    
    public void setworkhour(float n)
    {
        this.work_hours = n;
    }
    public void setbuilding(String b)
    {
        this.building = b;
    }
    public void setsalary_emp(float s)
    {
        this.salary_emp = s;
    }
    public void setempid( int a)
    {
        this.emp_id = a;
    }
    public int getemp_id()
    {
        return emp_id;
    }
    public float getworkhours()
    {
        return work_hours;
    }
    public String getbuilding()
    {
        return building;
    }
    public float getsalary()
    {
        return salary_emp;
    }
    
    public void display2()
    {
        display();
        System.out.println("Work Hours: " + getworkhours());
        System.out.println("Salary: " + getsalary() + "$");
        System.out.println("Building: " + getbuilding());
        System.out.println("Employee ID: " + getemp_id()+" .");
    }
    public float bonus_deduct(float n1)
    {
        if(n1 < 30)
        {
          return salary_emp -= 100;
        }
        else if (n1 > 30)
        {
          return salary_emp += 100;
        }
        else if(n1 == 30)
        {
          return salary_emp;
        }
        else 
        {
            return 0; 
        }
    }
    public void print_new_salary()
    {
        System.out.println("The New Salary : " + getsalary());
    }
}

class Student extends Person{
     
        private String faculty;
        private String Major;
        private final float Registration_fees = 450;
        private float Hourly_cost;
        private int University_ID , Semester_hour;
        private String course1,course2,course3,course4,course5;
        private int division1,division2,division3,division4,division5;
        private String hall1,hall2,hall3,hall4,hall5;
        private String lecture1,lecture2 ,lecture3,lecture4,lecture5;
        
        
        public void set_faculty(String f)
        {
            this.faculty = f;
        }
        public void set_major(String m)
        {
            this.Major = m;
        }
        public void set_university_ID(int u)
        {
            this.University_ID = u;
        }
        public String getfaculty()
        {
            return faculty;
        }
        public String getmajor()
        {
            return Major;
        }
        public int getuniversity_id()
        {
            return University_ID;
        }
        public void display3()
        {
            display();
            System.out.println("Faculty : " + getfaculty());
            System.out.println("Major : " + getmajor());
            System.out.println("University ID : " + getuniversity_id());
        }
        public void setcourse_name(String c1,String c2,String c3,String c4,String c5)
        {
            this.course1 = c1;
            this.course2 = c2;
            this.course3 = c3;
            this.course4 = c4;
            this.course5 = c5;
        }
        public void set_division(int d1,int d2 ,int d3,int d4,int d5)
        {
            this.division1 = d1;
            this.division2 = d2;
            this.division3 = d3;
            this.division4 = d4;
            this.division5 = d5;
        }
        public void sethall(String h1,String h2,String h3,String h4,String h5)
        {
            this.hall1 = h1;
            this.hall2 = h2;
            this.hall3 = h3;
            this.hall4 = h4;
            this.hall5 = h5;
        }
        public void set_Lectures_Schedule(String l11, String l12 , String l13, String l14 , String l15)
        {
         this.lecture1 = l11;
         this.lecture2 = l12;
         this.lecture3 = l13;
         this.lecture4 = l14;
         this.lecture5 = l15;
        }
        public void print_Schedule()
        {
            System.out.println("          Lectures Schedule");
            System.out.println("******************************************");
            System.out.println("Course Name" +"   "+ "Division" + "   "+"The Hall" + "    "+"Time");
            System.out.println(course1 + "         " + division1 + "         " + hall1 + "      " + lecture1);
            System.out.println(course2 + "              " + division2 + "         " + hall2 + "      " + lecture2);
            System.out.println(course3 + "             " + division3 + "         " + hall3 + "      " + lecture3);
            System.out.println(course4 + "           " + division4 + "         " + hall4 + "      " + lecture4);
            System.out.println(course5 + "   " + division5 + "         " + hall5 + "      " + lecture5);
        }
        public void university_fees( )
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of hours : ");
            int h = scan.nextInt();
            this.Semester_hour = h;
            System.out.print("Enter the cost of hour : ");
            float h1 = scan.nextFloat();
            this.Hourly_cost = h1;
        }
        public float getuniversityfees()
        {
            return (Semester_hour * Hourly_cost) + Registration_fees;
        }
        public void printuniversityfees()
        {
            System.out.println("University fees are equal to : " + getuniversityfees()+"$");
            System.out.println();
            System.out.println("Note: Now after payment you will be able to register courses");
        }
        public void Register_courses()
        {
            System.out.println("");
        }
        
    }

class GPA {
    
    private Scanner scan = new Scanner(System.in);
    private double final_total_point;
    private double total_point;
    private double total_GPA = 0;
    private int totalCreditHours = 0;
    private double[] grades = new double[5];
    private int[] creditHours = new int[5];

    public void calc_GPA() {

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Enter grade for Course " + (i + 1) + " (0-4): ");
                double grade = scan.nextDouble();

                // Check if the entered grade is within the valid range
                if (grade < 0 || grade > 4) {
                    throw new IllegalArgumentException("Grade should be between 0 and 4");
                }

                grades[i] = grade;

                System.out.print("Enter credit hours for Course " + (i + 1) + ": ");
                creditHours[i] = scan.nextInt();

            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scan.nextLine(); // Consume the invalid input to avoid an infinite loop
                i--; // Decrement the loop counter to repeat the current iteration
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--; // Decrement the loop counter to repeat the current iteration
            }
        }

        for (int i = 0; i < 5; i++) {
            total_point = grades[i] * creditHours[i];
            final_total_point += total_point;
            totalCreditHours += creditHours[i];
        }

        total_GPA = final_total_point / totalCreditHours;
        System.out.println();
        System.out.println("*************************************");
        System.out.println("Overall GPA : " + total_GPA);
        System.out.println("*************************************");
    }
}


public class UniversityManagmentSystem {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Dr d1 = new Dr();
        Staff s1 = new Staff();
        Student s = new Student();
        GPA g1 = new GPA();
        long id;
        String type;
        System.out.println("            Welcome to Meu University         ");
        System.out.println("*********                               *********");
        System.out.println("What type of user are you ? ");
        System.out.print("(Student,Dr,Staff): ");
        type = scan.next();
        if(type.equals("Dr"))
        {
            System.out.print("Enter your ID: ");
            id = scan.nextLong();
            if(id == (753216984))
            {   
                System.out.println();
                System.out.println("your information");
                System.out.println("***************************");
                d1.setname("Dr laith");
                d1.setnationalid(200011213);
                d1.setnationality("Jordanian");
                d1.setadress("Amman");
                d1.setwork_hour(35);
                d1.setsalary(1500);
                d1.setcourses("Java course");
                d1.setdr_id(753216984);
                d1.display();
                System.out.println();
                d1.set_Lectures_Schedule("8:00_9:30","9:30_11:00","11:00_12:30","12:30_2:00","2:00_3:30");
                d1.sethall("b123","b108","b273","h110","b124");
                d1.printSchedule();
            }
            else if(id == (890432176))
            {
                System.out.println();
                System.out.println("your information");
                System.out.println("***************************");
                d1.setname("Dr Ahmad");
                d1.setnationalid(200011731);
                d1.setnationality("Jordanian");
                d1.setadress("Amman");
                d1.setwork_hour(35);
                d1.setsalary(1600);
                d1.setcourses("data structure course");
                d1.setdr_id(890432176);
                d1.display();
                System.out.println();
                d1.set_Lectures_Schedule("8:00_9:30","11:00_12:30","12:30_2:00","2:00_3:30","3:30_5:00");
                d1.sethall(" b126","b103","  b272","  h111"," b124");
                d1.printSchedule();
            }
            else if(id == (645809312))
            {
                System.out.println();
                System.out.println("your information");
                System.out.println("***************************");
                d1.setname("Dr Ashraf");
                d1.setnationalid(200010542);
                d1.setnationality("Jordanian");
                d1.setadress("Amman");
                d1.setwork_hour(28);
                d1.setsalary(1200);
                d1.setcourses("Python course");
                d1.setdr_id(645809312);
                d1.display();
                System.out.println();
                d1.set_Lectures_Schedule("8:00_9:00","11:00_12:00","12:00_1:00","1:00_3:00","3:00_5:00");
                d1.sethall(" AB18","b102","  b274","  AB16"," AB14");
                d1.printSchedule();
            }
            else if(id == (987605432))
            {
                System.out.println();
                System.out.println("your information");
                System.out.println("***************************");
                d1.setname("Dr Mohammad");
                d1.setnationalid(200010311);
                d1.setnationality("Jordanian");
                d1.setadress("Amman");
                d1.setwork_hour(35);
                d1.setsalary(1500);
                d1.setcourses("C++ course");
                d1.setdr_id(987605432);
                d1.display();
                System.out.println();
                d1.set_Lectures_Schedule("8:00_9:30","11:00_12:30","12:30_2:00","2:00_3:30","3:30_5:00");
                d1.sethall(" b113","h101","  b272","  bb15"," bb14");
                d1.printSchedule();
            }
            else
            {
            System.out.println("Error: "+"ID you Entered does not exist.");
            }
            //class Dr Finished
        }
        
        else if(type.equals("Staff"))
        {
            System.out.print("Enter your ID: ");
            id = scan.nextLong();
            
            if(id == (127534890))
            {
                System.out.println();
                System.out.println("  your information");
                System.out.println("***************************");
                s1.setname("Ahmad");
                s1.setnationalid(200020311);
                s1.setnationality("Jordanian");
                s1.setadress("Amman");
                s1.setworkhour(30);
                s1.setsalary_emp(700);
                s1.setempid(127534890);
                s1.setbuilding("Building 'B'");
                s1.display2();
                System.out.println();
                System.out.println("Option : Inquiry about salary increase or decrease ");
                System.out.print("Enter the number of hours you worked this month, knowing that the original number of hours is 30:   ");
                int n1 = scan.nextInt();
                s1.bonus_deduct(n1);
                s1.print_new_salary();
            }
            else if(id == (227434981))
            {
                System.out.println();
                System.out.println("  your information");
                System.out.println("***************************");
                s1.setname("Mohammad");
                s1.setnationalid(200022451);
                s1.setnationality("Jordanian");
                s1.setadress("Amman");
                s1.setworkhour(30);
                s1.setsalary_emp(700);
                s1.setempid(227434981);
                s1.setbuilding("Building 'B'");
                s1.display2();
                System.out.println();
                System.out.println("Option : Inquiry about salary increase or decrease ");
                System.out.print("Enter the number of hours you worked this month, knowing that the original number of hours is 30:   ");
                int n1 = scan.nextInt();
                s1.bonus_deduct(n1);
                s1.print_new_salary();
            }
            else if(id == (109876543))
            {
                System.out.println();
                System.out.println("  your information");
                System.out.println("***************************");
                s1.setname("Ali");
                s1.setnationalid(200021763);
                s1.setnationality("Jordanian");
                s1.setadress("Amman");
                s1.setworkhour(30);
                s1.setsalary_emp(700);
                s1.setempid(109876543);
                s1.setbuilding("Building 'B'");
                s1.display2();
                System.out.println();
                System.out.println("Option : Inquiry about salary increase or decrease ");
                System.out.print("Enter the number of hours you worked this month, knowing that the original number of hours is 30:   ");
                int n1 = scan.nextInt();
                s1.bonus_deduct(n1);
                s1.print_new_salary();
            }
            else if(id == (567890321))
            {
                System.out.println();
                System.out.println("  your information");
                System.out.println("***************************");
                s1.setname("Omar");
                s1.setnationalid(200022354);
                s1.setnationality("Jordanian");
                s1.setadress("Amman");
                s1.setworkhour(30);
                s1.setsalary_emp(700);
                s1.setempid(567890321);
                s1.setbuilding("Building 'B'");
                s1.display2();
                System.out.println();
                System.out.println("Option : Inquiry about salary increase or decrease ");
                System.out.print("Enter the number of hours you worked this month, knowing that the original number of hours is 30:   ");
                int n1 = scan.nextInt();
                s1.bonus_deduct(n1);
                s1.print_new_salary();
            }
            else 
            {
                System.out.println("Error: "+"ID you Entered does not exist.");
            }
            //class Staff finished
        }
        else if(type.equals("Student"))
        {
            System.out.print("Enter your ID: ");
            id = scan.nextLong();
            
            if(id == (202211061))
            {
                System.out.println();
                System.out.println();
                System.out.println("  **Your Information**");
                System.out.println("***********************************");
                s.setname("Ahmad");
                s.setnationalid(200013121);
                s.setnationality("Jordanian");
                s.setadress("Amman");
                s.set_faculty("information technology");
                s.set_major("computer science");
                s.set_university_ID(202211061);
                s.setcourse_name("calculas","C++", "java", "python", "data structure");
                s.set_division(1, 3, 7, 5, 3);
                s.sethall("b120", "b108", "bb15", "bb14", "h101");
                s.set_Lectures_Schedule("8:00_9:30","9:30_11:00","11:00_12:30","12:30_2","2_3:30");
                s.display3();
                System.out.println("***********************************");
                System.out.println();
                System.out.println();
                System.out.println("The options:");
                System.out.println("Option 1: Student Schedule");
                System.out.println("Option 2: Calculation of the rate");
                System.out.println("option 3: Online Registration");
                System.out.print("Any option you want? ");
                int option;
                option = scan.nextInt();
                if(option == (1))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("  **Your Schedule**  ");
                    System.out.println("*************************************");
                    s.print_Schedule();
                }
                else if(option == (2))
                {
                    
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Calculation of the Rate **");
                    System.out.println("*******************************");
                    g1.calc_GPA();
                }
                else if(option == (3))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Online Registration **");
                    System.out.println("*******************************");
                    s.university_fees();
                    s.printuniversityfees();
                }
                else
                {
                    System.out.println("Error: "+"option you Entered does not exist.");
                }
                
                
                
            }
            else if(id == (202233051))
            {
                System.out.println();
                System.out.println();
                System.out.println("  **Your Information**");
                System.out.println("***********************************");
                s.setname("Omar");
                s.setnationalid(200014231);
                s.setnationality("Jordanian");
                s.setadress("Amman");
                s.set_faculty("information technology");
                s.set_major("computer science");
                s.set_university_ID(202233051);
                s.setcourse_name("calculas","Css", "java", "python", "Logic design  ");
                s.set_division(4, 2, 5, 5, 3);
                s.sethall("b122", "b103", "bb14", "bb15", "h102");
                s.set_Lectures_Schedule("8:00_9:30","9:30_11:00","11:00_12:30","12:30_2","2_3:30");
                s.display3();
                System.out.println("***********************************");
                System.out.println();
                System.out.println();
                System.out.println("The options:");
                System.out.println("Option 1: Student Schedule");
                System.out.println("Option 2: Calculation of the rate");
                System.out.println("option 3: Online Registration");
                System.out.print("Any option you want? ");
                int option;
                option = scan.nextInt();
                if(option == (1))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("  **Your Schedule**  ");
                    System.out.println("*************************************");
                    s.print_Schedule();
                }
                else if(option == (2))
                {
                    
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Calculation of the Rate **");
                    System.out.println("*******************************");
                    g1.calc_GPA();
                }
                else if(option == (3))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Online Registration **");
                    System.out.println("*******************************");
                    s.university_fees();
                    s.printuniversityfees();
                }
                else
                {
                    System.out.println("Error: "+"option you Entered does not exist.");
                }
                
                
                
            }
            else if(id == (202221452))
            {
                System.out.println();
                System.out.println();
                System.out.println("  **Your Information**");
                System.out.println("***********************************");
                s.setname("Ali");
                s.setnationalid(2000121261);
                s.setnationality("Jordanian");
                s.setadress("Amman");
                s.set_faculty("information technology");
                s.set_major("Artificial Intelligence");
                s.set_university_ID(202221452);
                s.setcourse_name("phsyics ","C++", "Java", "Logic ", "Data structure");
                s.set_division(2, 1, 4, 5, 3);
                s.sethall("b121", "b102", "b014", "b015", "h103");
                s.set_Lectures_Schedule("8:00_9:30","9:30_11:00","11:00_12:30","12:30_2","2_3:30");
                s.display3();
                System.out.println("***********************************");
                System.out.println();
                System.out.println();
                System.out.println("The options:");
                System.out.println("Option 1: Student Schedule");
                System.out.println("Option 2: Calculation of the rate");
                System.out.println("option 3: Online Registration");
                System.out.print("Any option you want? ");
                int option;
                option = scan.nextInt();
                if(option == (1))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("  **Your Schedule**  ");
                    System.out.println("*************************************");
                    s.print_Schedule();
                }
                else if(option == (2))
                {
                    
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Calculation of the Rate **");
                    System.out.println("*******************************");
                    g1.calc_GPA();
                }
                else if(option == (3))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Online Registration **");
                    System.out.println("*******************************");
                    s.university_fees();
                    s.printuniversityfees();
                }
                else
                {
                    System.out.println("Error: "+"option you Entered does not exist.");
                }
            }
            else if(id == (202241051))
            {
                System.out.println();
                System.out.println();
                System.out.println("  **Your Information**");
                System.out.println("***********************************");
                s.setname("Mohammad");
                s.setnationalid(2000234262);
                s.setnationality("Jordanian");
                s.setadress("Amman");
                s.set_faculty("information technology");
                s.set_major("Artificial Intelligence");
                s.set_university_ID(202241051);
                s.setcourse_name("phsyics ","C++", "Java", "Logic ", "Data structure");
                s.set_division(2, 1, 4, 5, 3);
                s.sethall("b121", "b102", "b014", "b015", "h103");
                s.set_Lectures_Schedule("8:00_9:30","9:30_11:00","11:00_12:30","12:30_2","2_3:30");
                s.display3();
                System.out.println("***********************************");
                System.out.println();
                System.out.println();
                System.out.println("The options:");
                System.out.println("Option 1: Student Schedule");
                System.out.println("Option 2: Calculation of the rate");
                System.out.println("option 3: Online Registration");
                System.out.print("Any option you want? ");
                int option;
                option = scan.nextInt();
                if(option == (1))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("  **Your Schedule**  ");
                    System.out.println("*************************************");
                    s.print_Schedule();
                }
                else if(option == (2))
                {
                    
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Calculation of the Rate **");
                    System.out.println("*******************************");
                    g1.calc_GPA();
                }
                else if(option == (3))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Online Registration **");
                    System.out.println("*******************************");
                    s.university_fees();
                    s.printuniversityfees();
                }
                else
                {
                    System.out.println("Error: "+"option you Entered does not exist.");
                }
            }
            else if(id == (202111071))
            {
                 System.out.println();
                System.out.println();
                System.out.println("  **Your Information**");
                System.out.println("***********************************");
                s.setname("Khaled");
                s.setnationalid(2000145263);
                s.setnationality("Jordanian");
                s.setadress("Amman");
                s.set_faculty("information technology");
                s.set_major("Computer Science");
                s.set_university_ID(202111071);
                s.setcourse_name("phsyics ","Css", "Java", "Python", "chemistry     ");
                s.set_division(2, 1, 4, 5, 3);
                s.sethall("b121", "b102", "b014", "b015", "h103");
                s.set_Lectures_Schedule("8:00_9:30","9:30_11:00","11:00_12:30","12:30_2","2_3:30");
                s.display3();
                System.out.println("***********************************");
                System.out.println();
                System.out.println();
                System.out.println("The options:");
                System.out.println("Option 1: Student Schedule");
                System.out.println("Option 2: Calculation of the rate");
                System.out.println("option 3: Online Registration");
                System.out.print("Any option you want? ");
                int option;
                option = scan.nextInt();
                if(option == (1))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("  **Your Schedule**  ");
                    System.out.println("*************************************");
                    s.print_Schedule();
                }
                else if(option == (2))
                {
                    
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Calculation of the Rate **");
                    System.out.println("*******************************");
                    g1.calc_GPA();
                }
                else if(option == (3))
                {
                    System.out.println();
                    System.out.println();
                    System.out.println("*******************************");
                    System.out.println(" ** Online Registration **");
                    System.out.println("*******************************");
                    s.university_fees();
                    s.printuniversityfees();
                }
                else
                {
                    System.out.println("Error: "+"option you Entered does not exist.");
                }
            }
            else
            {
                System.out.println("Error: "+"ID you Entered does not exist.");
            }
        }
        else
        {
            System.out.println();
            System.out.println("Error: Incorrect entry!!");
        }
    }
}
