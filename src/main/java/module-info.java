module ipap.oppo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ipap.oppo to javafx.fxml;
    exports ipap.oppo;
}