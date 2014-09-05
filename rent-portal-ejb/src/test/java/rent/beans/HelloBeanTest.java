package rent.beans;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rent.beans.HelloBean;
import rent.beans.HelloBeanLocal;

import java.util.logging.Logger;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Jet on 14.06.14.
 */
public class HelloBeanTest {
    /* private EJBContainer ejbContainer;
     private Context context;*/
    private HelloBeanLocal helloBeanLocal = new HelloBean();
    private static final Logger LOG = Logger.getLogger("HelloBeanLocal");

    @Before
    public void setUp() throws Exception {
/*        ejbContainer = EJBContainer.createEJBContainer();
        context = ejbContainer.getContext();*/
        LOG.info("Creating " + helloBeanLocal);
    }

    @After
    public void tearDown() throws Exception {
       /* ejbContainer.close();*/
    }

    @Test
    public void testSayHello() throws Exception {
        /*EJBContainer ejbC = EJBContainer.createEJBContainer();

        Context ctx = ejbC.getContext();

        HelloBeanLocal helloBean = (HelloBeanLocal) ctx.lookup("java:global/classes/HelloBean");*/

        assertNotNull(helloBeanLocal);

        String expectedOutcome = "Hello from EJB";
        assertEquals(helloBeanLocal.sayHello(), expectedOutcome);
    }
}
