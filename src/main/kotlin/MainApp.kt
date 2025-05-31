package viewer

import java.io.File

import LeftPane
import RightPane
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox
import javafx.stage.Stage

class MainApp : Application() {
    override fun start(primaryStage: Stage) {
        val rightPane = RightPane()
        val leftPane = LeftPane(primaryStage)

        val hBox = HBox(leftPane, rightPane).apply {
            HBox.setHgrow(rightPane, javafx.scene.layout.Priority.ALWAYS)
        }

        val root = BorderPane().apply {
            center = hBox
        }

        val scene = Scene(root, 1000.0, 600.0)
        primaryStage.title = "Das ist das Haus vom Nikolaus"
        primaryStage.scene = scene
        primaryStage.show()
    }
}

fun main() {
    Application.launch(MainApp::class.java)
}