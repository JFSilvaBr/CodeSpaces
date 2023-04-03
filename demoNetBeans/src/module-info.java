module demoNetBeans {
    requires javafx.media;    
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;
    
//    opens com.sconsole.academy.practice.e02 to javafx.graphics, javafx.controls, javafx.media, javafx.fxml;
//    opens com.sconsole.academy.practice.e01 to javafx.graphics, javafx.controls, javafx.media, javafx.fxml;
//    opens com.sconsole.academy.practice.e03 to javafx.graphics, javafx.controls, javafx.media, javafx.fxml;
    
    exports com.sconsole.academy.practice.e01;
    exports com.sconsole.academy.practice.e02;
    exports com.sconsole.academy.practice.e03;
}
