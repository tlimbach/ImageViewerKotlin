package viewer

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class MainApp : Application() {
    override fun start(stage: Stage) {

        println("Hallo")

        val button = Button("Klick mich!")

        button.setOnAction {
            val alert = Alert(Alert.AlertType.INFORMATION)
            alert.title = "Hallo!"
            alert.headerText = null
            alert.contentText = "Du hast den Button gedrückt."
            alert.showAndWait()
        }

        val root = StackPane(button)
        val scene = Scene(root, 400.0, 200.0)

        stage.title = "ImageViewer (Kotlin FX)"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(MainApp::class.java)
}