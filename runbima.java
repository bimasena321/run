package tugas;
import java.util.*;
public class runbima{
  public static void main(String [] args){
   Runtime  app = Runtime.getRuntime();
    try{
      //ini masukan nama aplikasi di bagian app.exec ("nama aplikasi");
      app.exec("notepad");
      app.exec("calc");
    }
    catch(Exception ex){
      System.out.println("Error: "+ex.toString());
    }
  }
}
