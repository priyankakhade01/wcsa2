package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups="Functional")
  public void ft1() {
	  Reporter.log("Functional test case 1",true);
  }
  @Test(groups="Intrgration")
  public void it1() {
	  Reporter.log("Intrgration test case 1",true);
  }
  @Test(groups="Smoke")
    public void st1(){
	  Reporter.log("Smoke test case 1 ",true);
  }
  
  //----------------------------------------------
  
  @Test(groups="Functional")
  public void ft2() {
	  Reporter.log("Functional test case 2",true);
  }
  @Test(groups="Intrgration")
  public void it2() {
	  Reporter.log("Intrgration test case 2",true);
  }
  @Test(groups="Smoke")
    public void st2(){
	  Reporter.log("Smoke test case 2",true);
  }
  
  //----------------------------------------------
  
  
  @Test(groups="Functional")
  public void ft3() {
	  Reporter.log("Functional test case 3",true);
  }
  @Test(groups="Intrgration")
  public void it3() {
	  Reporter.log("Intrgration test case 3",true);
  }
  @Test(groups="Smoke")
    public void st3(){
	  Reporter.log("Smoke test case 3 ",true);
  }
  
  @Test(groups="Functional")
  public void ft4() {
	  Reporter.log("Functional test case 4",true);
  }
  @Test(groups="Intrgration")
  public void it4() {
	  Reporter.log("Intrgration test case 4",true);
  }
  @Test(groups="Smoke")
    public void st4(){
	  Reporter.log("Smoke test case 4",true);
  }
  @Test(groups="Functional")
  public void ft5() {
	  Reporter.log("Functional test case 5",true);
  }
  @Test(groups="Intrgration")
  public void it5() {
	  Reporter.log("Intrgration test case 5",true);
  }
  @Test(groups="Smoke")
    public void st5(){
	  Reporter.log("Smoke test case 5 ",true);
  }
  
  @Test(groups="Functional")
  public void ft6() {
	  Reporter.log("Functional test case 6",true);
  }
  @Test(groups="Intrgration")
  public void it6() {
	  Reporter.log("Intrgration test case 6",true);
  }
  @Test(groups="Smoke")
    public void st6(){
	  Reporter.log("Smoke test case 6 ",true);
  }
  
  
  
  
  
}
