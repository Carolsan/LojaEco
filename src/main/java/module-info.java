module br.ufpb.lojaeco {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens br.ufpb.lojaeco to javafx.fxml;
    exports br.ufpb.lojaeco;
}