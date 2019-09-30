
import jpa.service.UserService;
import jpa.util.JpaUtil;
import org.hibernate.exception.JDBCConnectionException;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

public class TestDBConnection {


    /*@Test
    public void connectDb() throws Exception {
        JpaUtil jpaUtil = new JpaUtil();
        if (jpaUtil.isConnected()){
            System.out.println("DataBase connected!");
        }else {
            try {
                throw new JDBCConnectionException("Connection not found", new SQLException());
            }catch (JDBCConnectionException e){
                fail("Connection not found");
                System.out.println(e.getMessage());

            }
        }
    }*/

/*
    @Test
    public void findByUserNameAndUpdate() throws Exception {
        UserService userService = new UserService();
        assumeTrue(new JpaUtil().isConnected());
        userService.test();
    }*/
}
