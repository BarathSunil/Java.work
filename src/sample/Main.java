package sample;

import java.util.Scanner;
class Subjects{
    public static void main(String[] args)
    {
        int menu=1;
        int chem=1;
        int eng=1;
        int phy=1;
        int bio=1;
        int math=1;
        boolean value= false;
        System.out.println("LIST OF SUBJECTS");
        System.out.println("1.INPUT THE MARK OF EACH SUBJECTS :");
        System.out.println("2.FIND THE AVERAGE :");
        System.out.println("3.EDIT THE MARK :");
        System.out.println("4.DISPLAY YOUR MARKS");
        System.out.println("5.EXIT OR STOP THE PROGRAM");
        Scanner mk = new Scanner(System.in);
        while(menu<6){
            System.out.println("________________________________________________________________________________________________");
            System.out.println("ENTER THE NUMBER OF THE SELECTED MENU");
            menu = mk.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Enter the mark of Mathamatics : ");
                    math= mk.nextInt();

                    System.out.println("Enter the mark of Physics : ");
                    phy= mk.nextInt();

                    System.out.println("Enter the mark of Chemistry : ");
                    chem= mk.nextInt();

                    System.out.println("Enter the mark of Biology : ");
                    bio= mk.nextInt();

                    System.out.println("Enter the mark of English : ");
                    eng= mk.nextInt();

                    int x = 6;
                    value = true;
                    System.out.println("________________________________________________________________________");
                    System.out.println("for main menu press 1");
                    int select = mk.nextInt();
                    if (select ==1){
                    }
                    break;
                case 2:
                    if( value == true){
                        int avg = (phy+bio+chem+eng+math)/5;

                        System.out.println("Your average is : " + avg);   }
                    else
                    {
                        System.out.println("Enter the marks ");
                    }
                    break;


                case 3:
                    if( value ==true ){

                        System.out.println("Select the subject to edit marks ");
                        System.out.println("1.Maths");
                        System.out.println("2.Physics");
                        System.out.println("3.Chemistry");
                        System.out.println ("4.Biology");
                        System.out.println ("5.English");
                        System.out.println("Enter the number of selected subject•");
                        int edit =mk.nextInt();
                        if(value==true&&edit<=6){


                            switch(edit){
                                case 1:
                                    System.out.println("your mark for Maths : "+math);
                                    System.out.println("Enter the new mark to edit Maths mark");
                                    int newP1=mk.nextInt();
                                    math=newP1;

                                    System.out.println("     YOUR NEW MARK IS UPDATED  ");
                                    break;
                                case 2:
                                    System.out.println("your mark for physics : "+phy);
                                    System.out.println("Enter the new mark to edit Phyics mark");
                                    int newP2= mk.nextInt();
                                    phy=newP2;

                                    System.out.println("     YOUR NEW MARK IS UPDATED  ");
                                    break;
                                case 3:
                                    System.out.println("your mark for Chemistry : "+chem);
                                    System.out.println("Enter the new mark to edit Chemistry mark");
                                    int newP3= mk.nextInt();
                                    chem=newP3;

                                    System.out.println("     YOUR NEW MARK IS UPDATED  ");
                                    break;
                                case 4:
                                    System.out.println("your mark for Biology : "+bio);
                                    System.out.println("Enter the new mark to edit Biology mark");
                                    int newP4= mk.nextInt();
                                    bio=newP4;
                                    System.out.println("     YOUR NEW MARK IS UPDATED  ");

                                    break;
                                case 5:
                                    System.out.println("your mark for English : "+eng);
                                    System.out.println("Enter the new mark to edit English mark");
                                    int newP6= mk.nextInt();
                                    System.out.println("     YOUR NEW MARK IS UPDATED  ");				                 break;
                            }
                            System.out.println("for main menu press 1");
                            int select1 = mk.nextInt();
                            break;
                        }
                        else{
                            System.out.println("Invalid Entry");
                        }
                    }
                    else {
                        System.out.println("You haven't entered the marks please enter marks.");
                        System.out.println("For main menu enter 1");
                        break;
                    }
                case 4:
                    if(value==true){
                        System.out.println("YOUR MARKS ARE");
                        System.out.println("Maths : "+math);
                        System.out.println("Physics : "+phy);
                        System.out.println("Chemistry : "+chem);
                        System.out.println("Biology : "+bio);
                        System.out.println ("English : "+eng);
                        System.out.println("for main menu press 1");


                        int select2 = mk.nextInt();          }
                    else{
                        System.out.println("Please Enter Marks ");
                        System.out.println("For main menu enter 1");
                        int enter =mk.nextInt();

                        System.out.println("for main menu press 1");


                        int select3 = mk.nextInt();
                        break;
                    }
                case 5:
                    break;
            }
        }
        mk.close();
    }
}