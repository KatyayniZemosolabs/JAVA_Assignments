public class ErrorHandeling {
    public static void throwsExp(String s) throws Exception1,Exception2,Exception3,Exception{
        if(s.equalsIgnoreCase("exception1")) throw new Exception1("custom Exception 1 ");
        else if(s.equalsIgnoreCase("exception2")) throw new Exception2("custom Exception 2 ");
        else if(s.equalsIgnoreCase("exception3")) throw new Exception3("custom Exception 3 ");
        String c=null;
        c.toString();

    }
    public static void main(String args[]){
        String name=args[0];
        try{
            throwsExp(name);
        }
        catch(Exception1|Exception2|Exception3 e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("NUll pointer exception");
        }
        finally{
            System.out.println("finally block executed");
        }
    }
}
