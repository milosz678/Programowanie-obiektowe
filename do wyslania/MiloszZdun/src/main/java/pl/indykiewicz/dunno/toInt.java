package pl.indykiewicz.dunno;

public class toInt {

    public int toInt(String string){
        try{
            return Integer.parseInt(string);
        }catch (NumberFormatException e){
            System.out.print("Exception was caught, input was not correct. Default value of 0 is returned");
            return 0;
        }
    }
}
