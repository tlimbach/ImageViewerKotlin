import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.DirectoryChooser
import javafx.stage.Stage

class LeftPane(private val primaryStage: Stage) : VBox() {
    init {
        spacing = 10.0
        padding = Insets(10.0)
        prefWidth = 200.0
        style = "-fx-background-color: #dddddd"
        children += Label("Steuerung")

        val chooseDirButton = Button("Verzeichnis wählen").apply {
            setOnAction {
                val chooser = DirectoryChooser()
                chooser.title = "Wähle ein Verzeichnis"
                val selectedDir = chooser.showDialog(primaryStage)
                if (selectedDir != null) {
                    println("Gewähltes Verzeichnis: ${selectedDir.absolutePath}")
                }
            }
        }

        children += chooseDirButton
    }
}