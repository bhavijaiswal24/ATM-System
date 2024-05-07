public class App {
    public static void main(String[] args) throws Exception {
        MachineFeatures machine =new MachineFeatures();
        Location location=new Location("India","56789","Uttar Pradesh","Aligarh","Marris Road","AP");
        CurrencyComposition composition=new CurrencyComposition(500,500,1000,5000,10000);
        User user=new User("Ajay",1234,"5678905689",789,20000,07,2030);
        ATM atm=new ATM("12345",location,composition);
        machine.checkUserBalance(user);
        machine.seeComposition(composition);
        machine.withdraw(21000, user, atm);
        machine.withdraw(1000, user, atm);
        machine.createATM(location, composition);
        //creating new composition
        machine.updateATMComposition(atm, composition);
        composition=new CurrencyComposition(50,50,100,5000,1000);
        machine.seeComposition(composition);
        machine.withdraw(60,user,atm);
    }
}
