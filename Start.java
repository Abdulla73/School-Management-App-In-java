import java.lang.*;
import classes.*;
import java.util.Scanner;
import fileio.FileReadWriteDemo;


public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		School s = new School();
		
		s.showSchoolDetails();
		
		boolean repeat0 = true;
		while(repeat0)
		{
			System.out.println("\t\tWhat do you want to do?\n");
			System.out.println("\t\t1.  Admin panel");
			System.out.println("\t\t2.  Exit\n");
			
			System.out.print("Enter Your Choice: ");
            int choice1 = sc.nextInt();
            System.out.println("\t\t-----------------------------------");
			switch(choice1)
			{
				//ADMIN PANEL
				
			    case 1:
				System.out.println("\t\t-----------------------------------");
                System.out.print("\t\tEnter Your Password : ");
                String j = sc.next();
                String k = "123456";
                if (k.equals(j))
			    {
		
					boolean repeat = true;
					
					while(repeat)
					{
						System.out.println();
						System.out.println("\tMenu\n");
						System.out.println("\t\t1. Stuff Management");
						System.out.println("\t\t2. Application Form");
						System.out.println("\t\t3. Student Management");
						System.out.println("\t\t4. Teacher Management");
						System.out.println("\t\t5. Show School Information");
						System.out.println("\t\t6. Exit");
							
						System.out.println("\n--------------");
						System.out.print("Enter Your Choice: ");
						int choice = sc.nextInt();
						System.out.println("----------------\n");
						
						
						switch(choice)
						{
							case 1:
								
								System.out.println("Welcome to Stuff Management");
								System.out.println("------------------------------");
								System.out.println();
								
								boolean repeat1 = true;
								
								while(repeat1)
								{
								
									System.out.println("\tStuff Management Options: \n");
									System.out.println("\t\t1. Add New Stuff");
									System.out.println("\t\t2. Remove Stuff");
									System.out.println("\t\t3. Search Stuff");
									System.out.println("\t\t4. Show All Stuffs Information");
									System.out.println("\t\t5. Go Back");
									
									System.out.println("\n--------------");
									System.out.print("Enter Your Choice: ");
									int option1 = sc.nextInt();
									System.out.println("----------------\n");
									
									switch(option1)
									{
										case 1:
											
											System.out.println("You Have Selected Add Stuff");
											System.out.println("----------------------------");
											System.out.println();
											
											System.out.print("Enter Stuff Name: ");
											String name3 = sc.next();
											System.out.print("Enter Stuff ID: ");
											String id3 = sc.next();
											System.out.print("Enter Stuff Catagory: ");
											String catagory3 = sc.next();
											System.out.print("Enter Stuff Joining Date: ");
											String join3 = sc.next();
											System.out.print("Enter Stuff Salary: ");
											double salary3 = sc.nextDouble();
											
											Stuff st = new Stuff();
											st.setName(name3);
											st.setStuffId(id3);
											st.setCatagory(catagory3);
											st.setJoiningDate(join3);
											st.setSalary(salary3);
											
											if(s.admitStuff(st))
											{
												System.out.println(id3+ " Stuff Has Been Inserted");
											}
											else
											{
												System.out.println(id3+ " Stuff can not Be Inserted");
											}
											
											break;
											
										case 2:
											
											System.out.println("You Have Selected Remove Stuff");
											System.out.println("--------------------------------");
											System.out.println();
											
											System.out.print("Enter Stuff ID: ");
											String id4 = sc.next();
											
											Stuff st1 = s.searchStuff(id4);
											if(st1 != null)
											{
												if(s.removeStuff(st1))
												{
													System.out.println(id4+ "Successfully removed");
												}
											}
											else{System.out.println(id4+ "Could Not Successfully removed"); }
											
											break;
											
										case 3:
										
											System.out.println("You Have Selected Search Stuff");
											System.out.println("--------------------------------");
											System.out.println();
											
											System.out.print("Enter The ID to search a Stuff: ");
											String id5 = sc.next();
											
											Stuff st2 = s.searchStuff(id5);
											
											if(st2 != null)
											{
												System.out.println("Stuff Found");
												st2.showDetails();
											}
											else
											{
												System.out.println("Stuff NOT Found");
											}
											
											break;
											
										case 4:
											
											System.out.println("Stuffs Information");
											System.out.println("-------------------");
											System.out.println();
											
											s.showAllStuffs();
											break;
											
										case 5:
											
											System.out.println("Going Back.......");
											System.out.println("------------------");
											repeat1 = false;
											System.out.println();
											break;
											
										default:
										
											System.out.println("Invalid Option.......");
											System.out.println("--------------------------------");
											System.out.println();
											
											break;
									}
								}
								
								break;
								
							case 2:
								
								System.out.println("Welcome to Application Management");
								System.out.println("------------------------------");
								System.out.println();
								
								boolean repeat2 = true;
								
								while(repeat2)
								{
								
									System.out.println("\tApplication Management Options: \n");
									System.out.println("\t\t1. Add New Applicant");
									System.out.println("\t\t2. Remove Applicant");
									System.out.println("\t\t3. Search Applicant");
									System.out.println("\t\t4. Show All Applicants Information");
									System.out.println("\t\t5. Go Back");
									
									System.out.println("\n---------------");
									System.out.print("Enter Your Choice: ");
									int option2 = sc.nextInt();
									System.out.println("-----------------\n");
									
									switch(option2)
									{
										case 1:
											
											System.out.println("You Have Selected Add Applicant");
											System.out.println("-------------------------------");
											System.out.println();
											
											System.out.print("Enter First Name: ");
											String firstName1 = sc.next();
											System.out.print("Enter Last Name: ");
											String lastName1 = sc.next();
											System.out.print("Enter Mobile Number: ");
											String mobileNum1 = sc.next();
											System.out.print("Enter Address: ");
											String address1 = sc.next();
											System.out.print("Enter Gender: ");
											String gender1 = sc.next();
											System.out.print("Enter Date of Birth: ");
											String dob1 = sc.next();
											
											Application a = new Application();
											a.setFirstName(firstName1);
											a.setLastName(lastName1);
											a.setMobileNum(mobileNum1);
											a.setAddress(address1);
											a.setGender(gender1);
											a.setDob(dob1);
											
											if(s.addApplicant(a))
											{
												System.out.println(" Applicant Has Been Inserted");
											}
											else
											{
												System.out.println(" Applicant can not Be Inserted");
											}
											
											
											break;
											
										case 2:
											
											System.out.println("You Have Selected Remove Applicant");
											System.out.println("--------------------------------");
											System.out.println();
											
											System.out.print("Enter Applicant Mobile Number: ");
											String mobileNum2 = sc.next();
											
											Application a1 = s.searchApplicant(mobileNum2);
											if(a1 != null)
											{
												if(s.removeApplicant(a1))
												{
													System.out.println("Successfully removed");
												}
											}
											else{System.out.println("Could Not Successfully removed"); }
											
											break;
											
										case 3:

											System.out.println("You Have Selected Search Applicant");
											System.out.println("--------------------------------");
											System.out.println();
											
											System.out.print("Enter The Mobile Number to search an Applicant: ");
											String mobileNum3 = sc.next();
											
											Application a2 = s.searchApplicant(mobileNum3);
											
											if(a2 != null)
											{
												System.out.println("Applicant Found");
												System.out.println("---------------");
												a2.showDetails();
											}
											else
											{
												System.out.println("Applicant NOT Found");
											}
											
											break;
											
										case 4:
											
											System.out.println("You Have Selected Show All Applicant Information");
											System.out.println("------------------------------------------------");
											System.out.println();
											
											System.out.println("Applied Applicant Information");
											System.out.println("-----------------------------");
											s.showAllApplicants();
											
											break;
											
										case 5:
											
											System.out.println("Going Back...........");
											System.out.println("----------------------");
											repeat2 = false;
											System.out.println();
											break;
											
										default:
											
											System.out.println("-----------------------");
											System.out.println("Invalid Option.......");
											System.out.println("-----------------------");
											System.out.println();
											
											break;
									}
								}
								
								break;
								
							case 3:
							
								System.out.println("Welcome to Student Management");
								System.out.println("----------------------------");
								System.out.println();
								
								boolean repeat3 = true;
								
								while(repeat3)
								{
								
									System.out.println("\tStudent Management Options: \n");
									System.out.println("\t\t1. Admit New Student");
									System.out.println("\t\t2. Remove Student");
									System.out.println("\t\t3. Search Student");
									System.out.println("\t\t4. GPA Check for Scholarship");
									System.out.println("\t\t5. Show All Student Information");
									System.out.println("\t\t6. Go Back");
									
									System.out.println("\n---------------");
									System.out.print("Enter Your Choice: ");
									int option3 = sc.nextInt();
									System.out.println("-----------------\n");
									
									switch(option3)
									{
										case 1:
											
											System.out.println("You Have Selected Admit Student");
											System.out.println("-------------------------------");
											System.out.println();
											
											System.out.print("Enter Applicant Mobile Number for Verification: ");
											String mobileNum4 = sc.next();
											
											Application a1 = s.searchApplicant(mobileNum4);
											
											if(a1 != null)
											{
												System.out.println("Applicant Found");
												
												System.out.print("Enter Student ID: ");
												String id6 = sc.next();
												System.out.print("Enter Student Shift: ");
												String shift1 = sc.next();
												System.out.print("Enter Student GPA: ");
												double gpa1 = sc.nextDouble();
												
												Student s1 = new Student(a1, id6, shift1, gpa1);
												
												if(s.admitStudent(s1))
													{
														System.out.println("Student Inserted");
													}
													else
													{
														System.out.println("Student Not Inserted");
													}
											}
											else{System.out.println("Invalid Applicant");}
											
											break;
											
										case 2:
											
											System.out.println("You Have Selected Remove Student");
											System.out.println("--------------------------------");
											System.out.println();
											
											System.out.print("Enter The ID to remove a Student: ");
											String id7 = sc.next();
											
											Student s2 = s.searchStudent(id7);
											
											if(s2 != null)
											{
												if(s.removeStudent(s2))
												{
													System.out.println("Student Removed Successfully");
												}
											}
											else
											{
												System.out.println("Student Can NOT be Removed");
											}
											
											break;
											
										case 3:
										
											System.out.println("You Have Selected Search Student");
											System.out.println("--------------------------------");
											System.out.println();
											
											System.out.print("Enter The ID to search a Student: ");
											String id8 = sc.next();
											
											Student s3 = s.searchStudent(id8);
											
											if(s3 != null)
											{
												System.out.println("Student Found");
												s3.showDetails();
											}
											else
											{
												System.out.println("Student NOT Found");
											}
											
											break;
											
										case 4:
											
											System.out.println("You Have Selected Show All Students Information");
											System.out.println("------------------------------------------------");
											System.out.println();
											
											System.out.print("Enter GPA to Check Scholarship: ");
											double gpa2 = sc.nextDouble();
											
											Student st3 = new Student();
											
											st3.checkGpa(gpa2);
											
											break;
											
										case 5:
											
											System.out.println("You Have Selected Show All Students Information");
											System.out.println("------------------------------------------------");
											System.out.println();
											
											s.showAllStudents();
											
											break;	
											
										case 6:
											
											System.out.println("Going Back...........");
											System.out.println("---------------------");
											repeat3 = false;
											System.out.println();
											break;
											
										default:
											
											System.out.println("Invalid Option.......");
											System.out.println("---------------------");
											System.out.println();
											
											break;
									}
								}
							
								break;
								
							case 4:
								
								System.out.println("Welcome to Teacher Management");
								System.out.println("------------------------------");
								System.out.println();
								
								boolean repeat4 = true;
								
								while(repeat4)
								{
								
									System.out.println("\tTeacher Management Options: \n");
									System.out.println("\t\t1. Admit New Teacher");
									System.out.println("\t\t2. Remove Teacher");
									System.out.println("\t\t3. Search Teacher");
									System.out.println("\t\t4. Show All Teachers Information");
									System.out.println("\t\t5. Go Back");
									
									System.out.println("\n--------------");
									System.out.print("Enter Your Choice: ");
									int option4 = sc.nextInt();
									System.out.println("----------------\n");
									
									switch(option4)
									{
										case 1:
											
											System.out.println("You Have Selected Add Teacher");
											System.out.println("-----------------------------");
											System.out.println();
											
											System.out.print("Enter Applicant Mobile Number for Verification: ");
											String mobileNum5 = sc.next();
											
											Application a1 = s.searchApplicant(mobileNum5);
											
											if(a1 != null)
											{
												System.out.println("Applicant Found");
												
												System.out.print("Enter Teacher ID: ");
												String id9 = sc.next();
												System.out.print("Enter Teacher Shift: ");
												String shift2 = sc.next();
												System.out.print("Enter Teacher Subject: ");
												String subject1 = sc.next();
												System.out.print("Enter Teacher Position: ");
												String position1 = sc.next();
												System.out.print("Enter Teacher Salary: ");
												double salary1 = sc.nextDouble();
												
												Teacher t = new Teacher(a1, id9, shift2, subject1, position1, salary1);
												
												if(s.admitTeacher(t))
													{
														System.out.println("Teacher Inserted");
													}
													else
													{
														System.out.println("Teacher Not Inserted");
													}
											}
											else{System.out.println("Invalid Applicant");}
											
											break;
											
										case 2:
											
											System.out.println("You Have Selected Remove Teacher");
											System.out.println("--------------------------------");
											System.out.println();
											
											System.out.print("Enter The ID to remove a Teacher: ");
											String id10 = sc.next();
											
											Teacher t1 = s.searchTeacher(id10);
											
											if(t1 != null)
											{
												if(s.removeTeacher(t1))
												{
													System.out.println("Teacher Removed Successfully");
												}
											}
											else
											{
												System.out.println("Teacher Can NOT be Removed");
											}
											
											break;
											
										case 3:
										
											System.out.println("You Have Selected Search Teacher");
											System.out.println("--------------------------------");
											System.out.println();
											
											System.out.print("Enter The ID to search a Teacher: ");
											String id11 = sc.next();
											
											Teacher t2 = s.searchTeacher(id11);
											
											if(t2 != null)
											{
												System.out.println("Teacher Found");
												t2.showDetails();
											}
											else
											{
												System.out.println("Teacher NOT Found");
											}
											
											break;
											
										case 4:
											
											System.out.println("You Have Selected Show All Teachers Information");
											System.out.println("-----------------------------------------------");
											System.out.println();
											
											s.showAllTeachers();
											
											break;
											
										case 5:
											
											System.out.println("Going Back...........");
											System.out.println("---------------------");
											repeat4 = false;
											System.out.println();
											break;
											
										default:
											
											System.out.println("Invalid Option.......");
											System.out.println("---------------------");
											System.out.println();
											
											break;
									}
								}
								
									break;
							case 5:
								
								System.out.println("School Information");
								System.out.println("-------------------");
								System.out.println();
								
								s.showSchoolDetails();
								
								break;
								
							case 6:
								
								System.out.println("Thank You for Using Our Application");
								System.out.println("-----------------------------------");
								System.out.println();
								
								repeat = false;
								
								break;
								
							default:
							
								System.out.println("Invalid Selection.....");
								System.out.println("----------------------");
								System.out.println();
								
								break;
							
						}
					}
				}
			 else 
			 System.out.println("Invalid Password\n\n");
			 break;		
				
				case 2: 
				
                System.out.println("\n You Chose to END the program"); 
                repeat0=false;
                break;
			}
		}		
	}
}