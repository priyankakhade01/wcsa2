package pageObjectModel;

import java.io.IOException;

public class TestActiTimeVaildLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		  BaseTest bt = new BaseTest();
		  bt.openBrowser();
		  
           LoginPage lp = new LoginPage(driver);
                    
              Flib flib = new Flib();
              lp.validLoginActitime(flib.readPropertyFile(PROP_PATH, "username"), flib.readPropertyFile(PROP_PATH, "passward"));
                    
	}

}
