package session9.DatabaseAdmin;

import session9.entity.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDataAccess {
    private PreparedStatement preparedStatement;


        public void save (Product product) throws Exception {
            connect();
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO PRODUCT_TBL (ID, NAME, PRICE) VALUES (?,?,?)"
            );
            preparedStatement.
            PreparedStatement getTable = connection.prepareStatement(
                    "select * from product_tbl order by id"
            );
        }

}
