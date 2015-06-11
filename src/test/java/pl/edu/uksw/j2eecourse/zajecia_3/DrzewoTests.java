package pl.edu.uksw.j2eecourse.zajecia_3;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DrzewoTests {

    @Test
    public void powinienZapisacDrzewoDab() throws Exception {

        Aplikacja.main(new String[0]);

        List<String> nazwyDrzew = pobierzNazwyDrzew();

        assertEquals(1, nazwyDrzew.size());
        assertEquals("Dąb", nazwyDrzew.get(0));
    }

    private List<String> pobierzNazwyDrzew() throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from drzewo");
        List<String> nazwyDrzew = new ArrayList<>();
        while (resultSet.next()) {
            nazwyDrzew.add(resultSet.getString("gatunek"));
        }

        resultSet.close();
        connection.close();

        return nazwyDrzew;
    }
}

