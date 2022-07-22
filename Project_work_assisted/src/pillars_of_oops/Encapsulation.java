package pillars_of_oops;

class Account {  
   
    private long account_no;  
    private String name,email;  
    private float amount;  
    
  
    public long getAcc_no() {  
        return account_no;  
    }  
    public void setAcc_no(long acc_no) {  
        this.account_no = acc_no;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
    public float getAmount() {  
        return amount;  
    }   
    public void setAmount(float amount) {  
        this.amount = amount;  
    }  
   
}  public class Encapsulation {  
    public static void main(String[] args) {  
       
        Account myAcc=new Account();  
       
        myAcc.setAcc_no(775492842L);  
        myAcc.setName("Mr.XYZ");  
        myAcc.setEmail("xyz@abc.com");  
        myAcc.setAmount(100000f);  
       
        System.out.println("Account No:" + myAcc.getAcc_no()+" \n"+"Account Name:"
                + myAcc.getName()+" \n"+"Account holder email:" + myAcc.getEmail()+"\n"
                + "Amount in Account:" + myAcc.getAmount());  
    }  
}