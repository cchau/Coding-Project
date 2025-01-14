class SavingsAccount extends BankAccount {
   private double interestRate;
   private int withdrawCount;

   public SavingsAccount(String name, double initialDeposit,
   double interestRate)throws Exception {
      super(name, initialDeposit);
      this.interestRate = interestRate;
   }
   public void addInterest() throws Exception {
      if(interestRate < 1){
         throw new Exception("Can have an interest rate that decreases deposit");
      } else{
         setBalance(getBalance()*interestRate);
      }
   }

   public void withdraw(double amount) throws Exception{
      if(withdrawCount == 6){
         throw new Exception("Exceeded withdraw limit, can't withdraw anymore money");
      } else{
         withdrawCount++;
         super.withdraw(amount);
      }
   }

   public int getWithdrawCount() {
      return withdrawCount;
   }
}