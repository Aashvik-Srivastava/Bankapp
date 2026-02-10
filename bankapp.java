import java.util.scanner;
public class BankApp {
  int accountNumber;
  string name;
  double balance;
  public static void main(string[]args)
  {
    scanner sc = new scanner(system.in);
    int choice;
    system.out.println();
    system.out.println("---Bank Management System---");
    system.out.println(" 1. Create Account");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Check Balance");
    System.out.println("5. Exit");

    System.out.print("Choose option: ");
            choice = sc.nextInt();

        switch (choice){
                case 1:
                    system.out.print("Enter Account Number");
                    accountNumber = sc.nextInt():
                    sc.nextLine();

                    system.out.print("Enter Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    balance = sc.nextDouble();  
                    
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Amount Deposited!");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Amount Withdrawn!");
                    }
                    break;

                case 4:
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("Name: " + name);
                    System.out.println("Balance: " + balance);
                    break;

                case 5:
                    System.out.println("Thank you for using Bank App!");
                    break;

                default:
                    System.out.println("Invalid Option!");
                }    
    
        

            
            } while (choice !=5);


  } 
