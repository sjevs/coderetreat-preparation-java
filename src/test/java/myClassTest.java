import static org.junit.Assert.*;

import com.google.inject.Inject;
import org.jukito.JukitoRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JukitoRunner.class)
public class myClassTest {

  @Inject
  private MyClass myClass;

  @Test
  public void doAction() throws Exception {
    assertEquals("Action result", 0, myClass.doAction());
  }

}
