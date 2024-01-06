
import java.util.Scanner;

public class MarriageCertificateProgram {

        


     void process(){
        Scanner scanner = new Scanner(System.in);
        MarriageCertificate certificate = new MarriageCertificate();
        certificate.inputMarriageCertificate();
        certificate.displayCertificateInformation();

        //condition to edit
       
        
        System.out.print("\tDo you want to edit? [Y] Yes or [N] No: ");
        String user_input = scanner.nextLine();
        
        if(user_input.equals("Y")|| user_input.equals("y")){
            certificate.editCertificateInformation();
            certificate.displayCertificateInformation();
        }
    

         //System Repeats
        boolean System_repeater = true;
        while(System_repeater){
           
           System.out.println("\tDo you want to Continue to Edit?");
           System.out.print("\t[Y] Yes or [N] No: ");
           String decision = scanner.nextLine();
           if (decision.equals("Y")|| decision.equals("y")){
               System_repeater = true;
               certificate.editCertificateInformation();
           }
           else if(decision.equals("N") || decision.equals("n")){
                   System_repeater = false;
           }
           else{
            System_repeater = true;
           }
        }
           certificate.displayCertificateInformation();
        
        
        System.out.println("====================================================================================================");
        System.out.println("\t\t\t\t\tRepublic of the Philippines\n\t\t\t\tOFFICE OF THE CIVIL REGISTRAR GENERAL\n\t\t\t\t\tCERTIFICATE OF MARRIAGE");
        System.out.println("====================================================================================================");	 
        System.out.println("----------------------------------------------------------------------------------------------------");
    
        
        System.out.println("\t\t\t\t--------------------------------------------------------------------");
        System.out.printf("Name of Contracting Parties\t\t|(1a) %-10s|(1b) %-10s|(14a) %-10s|(14b) %-10s\n", 
        certificate.getWifeFirst(), certificate.getWifeMiddle(), certificate.getHusbandFirst(), certificate.getHusbandMiddle());
        System.out.println("\t\t\t\t--------------------------------------------------------------------");
        System.out.printf("Date of Birth/Age\t\t\t|(20) %-20s\t\t\t|(15) %-20s\n", certificate.getHusbandDateOfBirth(), certificate.getHusbandAge());
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("Place of Birth\t\t\t\t|(4) %-40s\t|(17) %-40s\n", certificate.getHusbandPlaceOfBirth(), certificate.getWifePlaceOfBirth());
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("Sex (Male/Female)\t\t\t|(5) %-20s\t\t\t|(18) %-20s\n", certificate.getHusbandSex(), certificate.getWifeSex());
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("Citizenship\t\t\t\t|(6) %-20s\t\t\t|(19) %-20s\n", certificate.getHusbandCitizen(), certificate.getWifeCitzen());
        System.out.println("----------------------------------------------------------------------------------------------------");
    } 


   
                

        
        
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarriageCertificateProgram marriageprint = new MarriageCertificateProgram();
        marriageprint.process();
        
       
        

    }
   
  
        
    
       
}