module com.demo1.changlyminh {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.demo1.changlyminh to javafx.fxml;
    exports com.demo1.changlyminh;
}
