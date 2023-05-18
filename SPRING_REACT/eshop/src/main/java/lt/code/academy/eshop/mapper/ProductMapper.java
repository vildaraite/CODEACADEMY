package lt.code.academy.eshop.mapper;
import lt.code.academy.eshop.dto.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

//implementina rowmapperi ir mes grazinsime produkta, kadangi turime gauti kitoki objekta nei resultsetas, overridinam metodelius
//overaidinam rowmap metoda, kuris ateina is rowmapperio
public class ProductMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        //kaip is resultseto padaryti produkta? sukuriam produkta ir idedam is resultseto sukisam ta objekta ir ta nauja produkta
        //tai darome per rs.get metoda
        return new Product(
                UUID.fromString(rs.getString("id")),
                rs.getString("name"),
                rs.getString("category"),
                rs.getString("description"),
                rs.getInt("quantity"),
                rs.getBigDecimal("price")
        );
    }
}