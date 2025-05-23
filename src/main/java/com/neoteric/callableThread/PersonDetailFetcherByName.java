package com.neoteric.callableThread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.Callable;

public class PersonDetailFetcherByName implements Callable<Person> {
    private String name;
    public PersonDetailFetcherByName(String name) {
        this.name = name;
    }
    @Override
    public Person call() throws Exception {
        String url = "jdbc:mysql://localhost:3306/persondetails";
        String user = "root";
        String password = "Sow@5555";
        Connection conn = DriverManager.getConnection(url, user, password);

        PreparedStatement stmt = conn.prepareStatement("SELECT name, age, gender FROM  persondetails.person WHERE name = ?");
        stmt.setString(1, name);
        ResultSet rs = stmt.executeQuery();
        Person person = null;
        if (rs.next()) {
            person = new Person(rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("gender"));
        }
        rs.close();

        stmt.close();

        conn.close();

        return person;
    }
}
