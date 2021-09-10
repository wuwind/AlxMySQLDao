package sql.alex.model;

import situ.sql.assistant.Table;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;

public class T_customer implements Table {
    private java.lang.Integer id;
    public static String ID = "id";

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;

    }

    public void setId(java.lang.String id) {
        if (id == null || id.length() == 0) {
            System.out.println("YOUR INPUT IS NULL");
            return;
        }
        this.id = Integer.parseInt(id);

    }

    private java.lang.String customer_name;
    public static String CUSTOMER_NAME = "customer_name";

    public java.lang.String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(java.lang.String customer_name) {
        this.customer_name = customer_name;

    }

    private java.lang.Integer customer_level;
    public static String CUSTOMER_LEVEL = "customer_level";

    public java.lang.Integer getCustomer_level() {
        return customer_level;
    }

    public void setCustomer_level(java.lang.Integer customer_level) {
        this.customer_level = customer_level;

    }

    public void setCustomer_level(java.lang.String customer_level) {
        if (customer_level == null || customer_level.length() == 0) {
            System.out.println("YOUR INPUT IS NULL");
            return;
        }
        this.customer_level = Integer.parseInt(customer_level);

    }

    private java.lang.String code;
    public static String CODE = "code";

    public java.lang.String getCode() {
        return code;
    }

    public void setCode(java.lang.String code) {
        this.code = code;

    }

    public String giveTableName() {
        return "t_customer";
    }

    public String givePrimaryColumnName() {
        return "id";
    }

    public String[] giveDualPrimaryName() {
        return null;
    }

    public T_customer(java.lang.Integer id, java.lang.String customer_name, java.lang.Integer customer_level, java.lang.String code) {
        super();
        this.id = id;
        this.customer_name = customer_name;
        this.customer_level = customer_level;
        this.code = code;
    }

    public T_customer() {
    }

    public String toString() {
        return "{" + "id:" + (id == null ? "null" : "'" + id + "'") + "," + "customer_name:" + (customer_name == null ? "null" : "'" + customer_name + "'") + "," + "customer_level:" + (customer_level == null ? "null" : "'" + customer_level + "'") + "," + "code:" + (code == null ? "null" : "'" + code + "'") + "}";
    }
}
